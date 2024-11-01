package org.firstinspires.ftc.teamcode.FTCAutoCode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

@Autonomous()
public class LeftMininumPoints extends LinearOpMode {

    //Motors
    private DcMotor motorRightFront = null;
    private DcMotor motorRightBack = null;
    private DcMotor motorLeftFront = null;
    private DcMotor motorLeftBack = null;
    private Servo servo;

    @Override
    public void runOpMode() throws InterruptedException {
        motorRightFront = hardwareMap.get(DcMotor.class, "FR");
        motorRightBack = hardwareMap.get(DcMotor.class, "BR");
        motorLeftBack = hardwareMap.get(DcMotor.class, "BL");
        motorLeftFront = hardwareMap.get(DcMotor.class, "FL");
        servo = hardwareMap.get(Servo.class,"servo");


        motorRightBack.setDirection(DcMotorSimple.Direction.FORWARD);
        motorRightFront.setDirection(DcMotorSimple.Direction.FORWARD);

        waitForStart();

        //strafe left
        motorRightFront.setPower(-0.3);
        motorRightBack.setPower(0.3);
        motorLeftFront.setPower(-0.3);
        motorLeftBack.setPower(0.3);
        sleep(800);

        //servo
        servo.setPosition(0);
        servo.setPosition(0.7);

        //forward
        motorRightFront.setPower(-0.3);
        motorRightBack.setPower(-0.3);
        motorLeftFront.setPower(0.3);
        motorLeftBack.setPower(0.3);
        sleep(2020);

        servo.setPosition(0.3);


        //backwards
        motorRightFront.setPower(0.3);
        motorRightBack.setPower(0.3);
        motorLeftFront.setPower(-0.3);
        motorLeftBack.setPower(-0.3);
        sleep(1500);

        //rotation
        motorRightFront.setPower(-0.3);
        motorRightBack.setPower(-0.3);
        motorLeftFront.setPower(-0.3);
        motorLeftBack.setPower(-0.3);
        sleep(1600);

        //forward
        motorRightFront.setPower(-0.3);
        motorRightBack.setPower(-0.3);
        motorLeftFront.setPower(0.3);
        motorLeftBack.setPower(0.3);
        sleep(500);

        servo.setPosition(0.7);
        //backward

        motorRightFront.setPower(0.3);
        motorRightBack.setPower(0.3);
        motorLeftFront.setPower(-0.3);
        motorLeftBack.setPower(-0.3);
        sleep(1000);


    }
}
