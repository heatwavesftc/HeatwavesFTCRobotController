package org.firstinspires.ftc.teamcode.FTCAutoCode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

@Autonomous
public class minimumAutoRight extends LinearOpMode {

        //Motors
        private DcMotor motorRightFront = null;
        private DcMotor motorRightBack = null;
        private DcMotor motorLeftFront = null;
        private DcMotor motorLeftBack = null;
        public Servo servo;

        @Override
        public void runOpMode() throws InterruptedException {

            motorRightFront = hardwareMap.get(DcMotor.class, "FR");
            motorRightBack = hardwareMap.get(DcMotor.class, "BR");
            motorLeftBack = hardwareMap.get(DcMotor.class, "BL");
            motorLeftFront = hardwareMap.get(DcMotor.class, "FL");
            servo = hardwareMap.get(Servo.class, "servo");

            motorRightBack.setDirection(DcMotorSimple.Direction.FORWARD);
            motorRightFront.setDirection(DcMotorSimple.Direction.FORWARD);

            waitForStart();

            motorRightBack.setPower(-0.3);
            motorRightFront.setPower(0.3);
            motorLeftBack.setPower(-0.3);
            motorLeftFront.setPower(0.3);

            sleep(811);
            //strafe right

            servo.setPosition(0);
            servo.setPosition(0.7);
            //simple arm

            motorRightBack.setPower(-0.3);
            motorRightFront.setPower(-0.3);
            motorLeftBack.setPower(0.3);
            motorLeftFront.setPower(0.3);
            sleep(2000);
            //move forward

            servo.setPosition(0.3);
            //simple arm

            motorRightBack.setPower(0.3);
            motorRightFront.setPower(0.3);
            motorLeftBack.setPower(-0.3);
            motorLeftFront.setPower(-0.3);
            sleep(1500);
            //backwards

            motorRightBack.setPower(-0.3);
            motorRightFront.setPower(-0.3);
            motorLeftBack.setPower(-0.3);
            motorLeftFront.setPower(-0.3);
            sleep(1250);
            //turn

            motorRightBack.setPower(-0.6);
            motorRightFront.setPower(-0.6);
            motorLeftBack.setPower(0.6);
            motorLeftFront.setPower(0.6);
            sleep(3500);
            //go forward


        }
    }

