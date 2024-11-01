package org.firstinspires.ftc.teamcode.TeleopCode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
public class viperSlides extends OpMode {

    private DcMotor slides = null;
    private Servo wrist = null;
    private DcMotor arm = null;

    @Override
    public void init() {
    slides = hardwareMap.get(DcMotor.class,"liftMotor");
    arm = hardwareMap.get(DcMotor.class,"hangMotor");

    }

    @Override
    public void loop() {

        slides.setPower(-gamepad2.left_trigger);
        slides.setPower(gamepad2.right_trigger);

        arm.setPower(gamepad2.left_stick_y);
        arm.setPower(-gamepad2.left_stick_x);
    }
}
