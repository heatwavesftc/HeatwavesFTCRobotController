package org.firstinspires.ftc.teamcode.TeleopCode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
@Disabled
public class fullRobotCopy extends OpMode {

    private DcMotor slides = null;
    private CRServo intake = null;
    private DcMotor arm = null;
    private DcMotor motorRightFront;
    private DcMotor motorRightBack;
    private DcMotor motorLeftFront;
    private DcMotor motorLeftBack;
    private Servo wrist;

    public void moveDriveTrain(){
        double vertical;
        double horizontal;
        double pivot;
        vertical = -gamepad1.left_stick_y;
        horizontal = gamepad1.left_stick_x;
        pivot = gamepad1.right_stick_x;

        motorRightFront.setPower(pivot + (vertical + horizontal));
        motorRightBack.setPower(pivot+ (vertical - horizontal));
        motorLeftBack.setPower(pivot + (-vertical - horizontal));
        motorLeftFront.setPower(pivot + (-vertical + horizontal));
    }

    @Override
    public void init() {
    slides = hardwareMap.get(DcMotor.class,"slides");
    arm = hardwareMap.get(DcMotor.class,"arm");
    intake = hardwareMap.get(CRServo.class,"intake");
    motorRightFront = hardwareMap.get(DcMotor.class, "FR");
    motorRightBack = hardwareMap.get(DcMotor.class, "BR");
    motorLeftBack = hardwareMap.get(DcMotor.class, "BL");
    motorLeftFront = hardwareMap.get(DcMotor.class, "FL");
    wrist = hardwareMap.get(Servo.class, "wrist");
    arm.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

    arm.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    arm.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);


    }

    @Override
    public void init_loop() {

    }

    @Override
    public void loop() {
        moveDriveTrain();
        slides.setPower(-gamepad1.left_trigger);
        slides.setPower(gamepad1.right_trigger);
        if (gamepad2.x) {
            arm.setTargetPosition(700);
            arm.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            if (arm.getCurrentPosition() < arm.getTargetPosition()) {
                arm.setPower(0.3);
            } else {
                arm.setPower(0);
            }
        }
        if (gamepad2.y) {
            arm.setTargetPosition(100);
            arm.setMode(DcMotor.RunMode.RUN_TO_POSITION);

            if (arm.getCurrentPosition() > arm.getTargetPosition()) {
                arm.setPower(0.15);
            } else {
                arm.setPower(0);
            }
        }

        if(gamepad2.a){
            intake.setPower(1.0);
        }
        else if (gamepad2.b){
            intake.setPower(-1.0);
        }
        else {
            intake.setPower(0.0);

        }
        telemetry.addData("Arm Position: ", arm.getCurrentPosition());
        telemetry.addData("Arm Target Pos: ", arm.getTargetPosition());
        wrist.setPosition(0.5);
        telemetry.update();
    }

}