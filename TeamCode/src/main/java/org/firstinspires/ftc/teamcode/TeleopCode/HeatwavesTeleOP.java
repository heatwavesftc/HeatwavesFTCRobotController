package org.firstinspires.ftc.teamcode.TeleopCode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

public class HeatwavesTeleOP extends OpMode {

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
        vertical =  0.8 * gamepad1.left_stick_y;
        horizontal = 0.8 * -gamepad1.left_stick_x;
        pivot = 0.8 * -gamepad1.right_stick_x;

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

        arm.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        arm.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

    }

    public static final DcMotor.ZeroPowerBehavior BRAKE = null;
    @Override
    public void loop() {
        wrist.setPosition(0.555);

        moveDriveTrain();
        int position = arm.getCurrentPosition();

        slides.setPower(gamepad2.left_stick_x);
        slides.setPower(-gamepad2.left_stick_y);

        final int ARM_TARGET_POSITION_MAX = 1500;
        final int ARM_TARGET_POSITION = 750;
        final int ARM_LOWER_POSITION = 100;

        if(gamepad1.x){
            arm.setPower(0.5);
        } else {
            arm.setZeroPowerBehavior(BRAKE);
        }

        if(gamepad1.y){
            arm.setPower(-0.2);
        } else {
            arm.setZeroPowerBehavior(BRAKE);
        }

        telemetry.addData("Arm Position: ", arm.getCurrentPosition());
        telemetry.addData("Arm Target Pos: ", arm.getTargetPosition());
        telemetry.update();
    }
}

