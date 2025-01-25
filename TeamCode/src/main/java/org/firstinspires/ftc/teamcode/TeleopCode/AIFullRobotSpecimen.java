package org.firstinspires.ftc.teamcode.TeleopCode;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@Disabled
@TeleOp
public class AIFullRobotSpecimen extends OpMode {

    private DcMotor slides = null;
    private CRServo intake = null;
    private DcMotor arm = null;
    private DcMotor motorRightFront;
    private DcMotor motorRightBack;
    private DcMotor motorLeftFront;
    private DcMotor motorLeftBack;
    private Servo wrist;

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
        arm.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        motorLeftBack.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        motorLeftFront.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        motorRightBack.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        motorRightFront.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);


        arm.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        arm.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);



    }

    @Override
    public void loop() {
            wrist.setPosition(0.555);

            moveDriveTrain();
            int position = arm.getCurrentPosition();

            slides.setPower(-gamepad2.left_stick_x);
            slides.setPower(gamepad2.left_stick_y);

            int ARM_TARGET_POSITION = 750;
            int ARM_LOWER_POSITION = 100;
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
            } else {
                // If no button is pressed, keep the arm in its current position within range
                arm.setTargetPosition(Math.max(ARM_LOWER_POSITION, Math.min(position, ARM_TARGET_POSITION)));
                arm.setMode(DcMotor.RunMode.RUN_TO_POSITION);
                arm.setPower(0.3); // A small power to keep the arm in place
            }

            if (gamepad2.a) {
                intake.setPower(1.0);
            } else if (gamepad2.b) {
                intake.setPower(-1.0);
            } else if (gamepad1.a) {
                wrist.setPosition(0.2);
            } else {
                wrist.setPosition(0.555);
                intake.setPower(0.0);
            }

            telemetry.addData("Arm Position: ", arm.getCurrentPosition());
            telemetry.addData("Arm Target Pos: ", arm.getTargetPosition());
            telemetry.update();
        }
    }

