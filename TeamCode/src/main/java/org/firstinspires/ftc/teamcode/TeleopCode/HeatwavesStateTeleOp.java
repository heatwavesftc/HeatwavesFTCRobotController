package org.firstinspires.ftc.teamcode.TeleopCode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;


@TeleOp
public class HeatwavesStateTeleOp extends OpMode {

    private DcMotor slides = null;
    private CRServo intake = null;
    private DcMotor arm = null;
    private DcMotor motorRightFront;
    private DcMotor motorRightBack;
    private DcMotor motorLeftFront;
    private DcMotor motorLeftBack;
    private Servo wrist;
    private DcMotor clawslides;
    private Servo claw;

    public void moveDriveTrain() {
        double vertical;
        double horizontal;
        double pivot;
        vertical =  0.6 * gamepad1.left_stick_y;
        horizontal = 0.6 * -gamepad1.left_stick_x;
        pivot = 0.6 * -gamepad1.right_stick_x;

        motorRightFront.setPower(-pivot + (vertical - horizontal));
        motorRightBack.setPower(-pivot + (vertical + horizontal));
        motorLeftBack.setPower(-pivot + (-vertical + horizontal));
        motorLeftFront.setPower(-pivot + (-vertical - horizontal));
    }

    @Override
    public void init() {
        slides = hardwareMap.get(DcMotor.class, "Slide");
        arm = hardwareMap.get(DcMotor.class, "arm");
        intake = hardwareMap.get(CRServo.class, "intake");
        motorRightFront = hardwareMap.get(DcMotor.class, "FR");
        motorRightBack = hardwareMap.get(DcMotor.class, "BR");
        motorLeftBack = hardwareMap.get(DcMotor.class, "BL");
        motorLeftFront = hardwareMap.get(DcMotor.class, "FL");
        wrist = hardwareMap.get(Servo.class, "wrist");
        clawslides = hardwareMap.get(DcMotor.class, "clawSlides");
        claw = hardwareMap.get(Servo.class, "claw");

        arm.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        motorLeftBack.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        motorLeftFront.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        motorRightBack.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        motorRightFront.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);


        arm.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        arm.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        clawslides.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        clawslides.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

    }

    @Override
    public void loop() {
            wrist.setPosition(0.555);

            moveDriveTrain();
            int position = arm.getCurrentPosition();

            slides.setPower(-gamepad2.left_stick_x);
            slides.setPower(gamepad2.left_stick_y);

            int CLAW_SLIDES_LOW = 0;
            int CLAW_SLIDES_HIGH = -2150;

            int ARM_TARGET_POSITION = 750;
            int ARM_LOWER_POSITION = 200;
            if (gamepad2.x) {
                arm.setTargetPosition(ARM_TARGET_POSITION);
                arm.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                if (arm.getCurrentPosition() < arm.getTargetPosition() && arm.getCurrentPosition() <= ARM_TARGET_POSITION) {
                    arm.setPower(0.5);
                } else {
                    arm.setPower(0);
                }
            } else if (gamepad2.y) {
                arm.setTargetPosition(ARM_LOWER_POSITION);
                arm.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                if (arm.getCurrentPosition() > arm.getTargetPosition() && arm.getCurrentPosition() >= ARM_LOWER_POSITION) {
                    arm.setPower(0.2);
                } else {
                    arm.setPower(0);
                }
            } /*else {
                // If no button is pressed, keep the arm in its current position within range
                // arm.setTargetPosition(Math.max(ARM_LOWER_POSITION, Math.min(position, ARM_TARGET_POSITION)));
                // arm.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                // arm.setPower(0.3); // A small power to keep the arm in place
            }*/

            if (gamepad2.a) {
                intake.setPower(1.0);
            } else if (gamepad2.b) {
                intake.setPower(-1.0);
            } else if (gamepad1.a) {
                init();
            } else {
                wrist.setPosition(0.555);
                intake.setPower(0.0);
            }

            if (gamepad2.dpad_down) {
                clawslides.setTargetPosition(CLAW_SLIDES_LOW);
                clawslides.setPower(0.8);
                clawslides.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            }

            if (gamepad2.dpad_up) {
                clawslides.setTargetPosition(CLAW_SLIDES_HIGH);
                clawslides.setPower(1);
                clawslides.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            }

            if (gamepad2.left_bumper) {
                claw.setPosition(0);
            }

            if (gamepad2.right_bumper) {
                claw.setPosition(1);
            }

            if(gamepad1.left_bumper){
                arm.setTargetPosition(ARM_LOWER_POSITION);
                arm.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                if (arm.getCurrentPosition() > arm.getTargetPosition()) {
                    arm.setPower(0.2);                                                                                                                                                                                                             
                } else {
                    arm.setPower(0);
                }
            }

            telemetry.addData("Arm Position: ", arm.getCurrentPosition());
            telemetry.addData("Arm Target Pos: ", arm.getTargetPosition());
            telemetry.update();
        }
    }

