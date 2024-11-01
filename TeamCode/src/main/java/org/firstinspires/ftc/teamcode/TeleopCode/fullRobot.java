package org.firstinspires.ftc.teamcode.TeleopCode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
public class fullRobot extends OpMode {

    private DcMotor slides = null;
    private CRServo intake = null;
    private DcMotor arm = null;

    @Override
    public void init() {
    slides = hardwareMap.get(DcMotor.class,"slides" );
    arm = hardwareMap.get(DcMotor.class,"arm");
    intake = hardwareMap.get(CRServo.class,"intake");

    }

    @Override
    public void loop() {

        slides.setPower(-gamepad1.left_trigger);
        slides.setPower(gamepad1.right_trigger);

        arm.setPower(gamepad2.left_stick_y);
        arm.setPower(-gamepad2.left_stick_x);
        arm.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        if(gamepad2.a){
            intake.setPower(1.0);
        }
        else if (gamepad2.b){
            intake.setPower(-1.0);
        }
        else {
            intake.setPower(0.0);
        }
    }
}
