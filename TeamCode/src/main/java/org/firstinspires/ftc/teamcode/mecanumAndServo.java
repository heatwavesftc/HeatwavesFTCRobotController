package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
public class mecanumAndServo extends OpMode {
    public DcMotor motorRightFront;
    public DcMotor motorRightBack;
    public DcMotor motorLeftFront;
    public DcMotor motorLeftBack;
    public Servo servo;

    public void moveDriveTrain(){
        double vertical;
        double horizontal;
        double pivot;
        vertical = gamepad1.left_stick_y;
        horizontal = gamepad1.left_stick_x;
        pivot = gamepad1.right_stick_x;

        motorRightFront.setPower(-pivot + (-vertical + horizontal));
        motorRightBack.setPower(-pivot + (-vertical - horizontal));
        motorLeftBack.setPower(-pivot + (vertical + horizontal));
        motorLeftFront.setPower(-pivot + (vertical - horizontal));
    }

    @Override
    public void init() {
        //motors
        motorRightFront = hardwareMap.get(DcMotor.class, "FR");
        motorRightBack = hardwareMap.get(DcMotor.class, "BR");
        motorLeftBack = hardwareMap.get(DcMotor.class, "BL");
        motorLeftFront = hardwareMap.get(DcMotor.class, "FL");
        //servo
        servo = hardwareMap.get(Servo.class, "servo");
    }

    @Override
    public void init_loop() {

    }

    @Override
    public void loop() {
        moveDriveTrain();






        if (gamepad1.a){
            servo.setPosition(1);
        } else if (gamepad1.b) {
            servo.setPosition(0.2);
        }
    }
}
