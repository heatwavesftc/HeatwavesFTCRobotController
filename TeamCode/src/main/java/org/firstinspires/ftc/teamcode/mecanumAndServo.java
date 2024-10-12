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

        motorRightFront.setPower(pivot + (-vertical + horizontal));
        motorRightBack.setPower(pivot + (-vertical - horizontal));
        motorLeftBack.setPower(pivot + (-vertical + horizontal));
        motorLeftFront.setPower(pivot + (-vertical - horizontal));
    }

    @Override
    public void init() {
        //motors
        motorRightFront = hardwareMap.get(DcMotor.class, "motorRightFront");
        motorRightBack = hardwareMap.get(DcMotor.class, "MotorRightBack");
        motorLeftBack = hardwareMap.get(DcMotor.class, "motorLeftBack");
        motorLeftFront = hardwareMap.get(DcMotor.class, "motorLeftFront");
        //servo
        servo = hardwareMap.get(Servo.class, "servo");
    }

    @Override
    public void init_loop() {

    }

    @Override
    public void loop() {
        if (gamepad1.y){
            servo.setPosition(1);
        } else if (gamepad1.x) {
            servo.setPosition(0.2);
        }
    }
}
