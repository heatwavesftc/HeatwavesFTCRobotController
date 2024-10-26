package org.firstinspires.ftc.teamcode.FTCAutoCode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@Autonomous
public class ObstacleCourse extends LinearOpMode {
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

        /*motorRightFront.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorLeftFront.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorRightBack.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorLeftBack.setMode(DcMotor.RunMode.RUN_USING_ENCODER);*/

        motorRightBack.setDirection(DcMotorSimple.Direction.REVERSE);
        motorRightFront.setDirection(DcMotorSimple.Direction.REVERSE);

        waitForStart();

        motorRightFront.setPower(-0.5);
        motorLeftFront.setPower(0.5);
        motorRightBack.setPower(0.5);
        motorLeftBack.setPower(-0.5);

        sleep(800);

        motorRightBack.setPower(0.5);
        motorRightFront.setPower(0.5);
        motorLeftBack.setPower(0.5);
        motorLeftFront.setPower(0.5);

        sleep(1500);

        motorRightFront.setPower(0.5);
        motorLeftFront.setPower(-0.5);
        motorRightBack.setPower(-0.5);
        motorLeftBack.setPower(0.5);

        sleep(800);


    }

}


