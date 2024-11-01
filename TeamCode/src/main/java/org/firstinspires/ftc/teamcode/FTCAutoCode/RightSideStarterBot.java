package org.firstinspires.ftc.teamcode.FTCAutoCode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

@Autonomous
public class RightSideStarterBot extends LinearOpMode {

        //Motors
        private DcMotor motorRightFront = null;
        private DcMotor motorRightBack = null;
        private DcMotor motorLeftFront = null;
        private DcMotor motorLeftBack = null;
        private DcMotor liftMotor = null;
        private Servo wrist = null;
        private CRServo intake = null;
        private DcMotor armMotor = null;

        @Override
        public void runOpMode() throws InterruptedException {

            motorRightFront = hardwareMap.get(DcMotor.class, "FR");
            motorRightBack = hardwareMap.get(DcMotor.class, "BR");
            motorLeftBack = hardwareMap.get(DcMotor.class, "BL");
            motorLeftFront = hardwareMap.get(DcMotor.class, "FL");
            wrist = hardwareMap.get(Servo.class, "wrist");
            intake = hardwareMap.get(CRServo.class, "intake");
            armMotor = hardwareMap.get(DcMotor.class, "arm");

            motorRightBack.setDirection(DcMotorSimple.Direction.FORWARD);
            motorRightFront.setDirection(DcMotorSimple.Direction.FORWARD);

            waitForStart();

            motorRightFront.setPower(-0.6);
            motorLeftFront.setPower(0.6);
            motorRightBack.setPower(-0.6);
            motorLeftBack.setPower(0.6);
            sleep(200);
            //move forward

            motorRightFront.setPower(0.6);
            motorLeftFront.setPower(-0.6);
            motorRightBack.setPower(-0.6);
            motorLeftBack.setPower(0.6);
            sleep(200);
            //strafe left

            liftMotor.setPower(0.5);
            sleep(1000);

            armMotor.setPower(1);
            sleep(2000);

            wrist.setPosition(0);
            wrist.setPosition(0.7);
            wrist.setPosition(0.5);
            //hangs the specimen at the beginning of auto

            motorRightFront.setPower(0.6);
            motorLeftFront.setPower(-0.6);
            motorRightBack.setPower(0.6);
            motorLeftBack.setPower(-0.6);
            sleep(300);
            //strafe right

            armMotor.setPower(-0.4);
            sleep(1000);

            intake.setPower(0.5);
            sleep(600);
            //intakes the samples

            armMotor.setPower(1);
            sleep(1000);

            liftMotor.setPower(-0.5);
            sleep(650);
            //lifts up the arm and withdraws it

            motorRightFront.setPower(0.6);
            motorLeftFront.setPower(-0.6);
            motorRightBack.setPower(0.6);
            motorLeftBack.setPower(-0.6);
            sleep(250);
            //move backwards

            motorRightFront.setPower(0.6);
            motorLeftFront.setPower(-0.6);
            motorRightBack.setPower(-0.6);
            motorLeftBack.setPower(0.6);
            sleep(1000);
            //strafe left

            motorRightFront.setPower(-0.6);
            motorLeftFront.setPower(-0.6);
            motorRightBack.setPower(-0.6);
            motorLeftBack.setPower(-0.6);
            sleep(800);
            //rotate right








        }
    }

