package org.firstinspires.ftc.teamcode.FTCAutoCode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@Autonomous
public class minimumAutoRight extends LinearOpMode {

        //Motors
        private DcMotor motorRightFront = null;
        private DcMotor motorRightBack = null;
        private DcMotor motorLeftFront = null;
        private DcMotor motorLeftBack = null;

        @Override
        public void runOpMode() throws InterruptedException {

            motorRightFront = hardwareMap.get(DcMotor.class, "FR");
            motorRightBack = hardwareMap.get(DcMotor.class, "BR");
            motorLeftBack = hardwareMap.get(DcMotor.class, "BL");
            motorLeftFront = hardwareMap.get(DcMotor.class, "FL");



            motorRightBack.setDirection(DcMotorSimple.Direction.FORWARD);
            motorRightFront.setDirection(DcMotorSimple.Direction.FORWARD);

            waitForStart();

            motorRightBack.setPower(-0.3);
            motorRightFront.setPower(0.3);
            motorLeftBack.setPower(-0.3);
            motorLeftFront.setPower(0.3);
            sleep(2500);
            //strafe right

            motorRightBack.setPower(-0.3);
            motorRightFront.setPower(-0.3);
            motorLeftBack.setPower(0.3);
            motorLeftFront.setPower(0.3);
            sleep(1700);
        //move forward


        }
    }
