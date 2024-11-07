package org.firstinspires.ftc.teamcode.FTCAutoCode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

@Autonomous
public class RightSideStarterBotSimple extends TemplateAuto {

        //Motors
        private DcMotor liftMotor = null;
        private Servo wrist = null;
        private CRServo intake = null;
        private DcMotor armMotor = null;

        @Override
        public void runOpMode() throws InterruptedException {
            super.runOpMode();
            wrist = hardwareMap.get(Servo.class, "wrist");
            intake = hardwareMap.get(CRServo.class, "intake");
            armMotor = hardwareMap.get(DcMotor.class, "arm");

            motorRightBack.setDirection(DcMotorSimple.Direction.FORWARD);
            motorRightFront.setDirection(DcMotorSimple.Direction.FORWARD);

            waitForStart();

            moveFront(0.6);
            sleep(200);

            strafeLeft(0.6);
            sleep(200);

            liftMotor.setPower(0.5);
            sleep(1000);

            armMotor.setPower(1);
            sleep(2000);

            wrist.setPosition(0);
            wrist.setPosition(0.7);
            wrist.setPosition(0.5);
            //hangs the specimen at the beginning of auto

            strafeRight(0.6);
            sleep(300);


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

            moveBack(0.6);
            sleep(250);

            strafeLeft(0.6);
            sleep(1000);


            motorRightFront.setPower(-0.6);
            motorLeftFront.setPower(-0.6);
            motorRightBack.setPower(-0.6);
            motorLeftBack.setPower(-0.6);
            sleep(800);
            //rotate right








        }
    }

