package org.firstinspires.ftc.teamcode.FTCAutoCode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@Autonomous
public class runALap extends LinearOpMode {
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

        /*motorRightFront.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorLeftFront.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorRightBack.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorLeftBack.setMode(DcMotor.RunMode.RUN_USING_ENCODER);*/

        motorRightBack.setDirection(DcMotorSimple.Direction.REVERSE);
        motorRightFront.setDirection(DcMotorSimple.Direction.REVERSE);

        waitForStart();


//        motorRightFront.setTargetPosition(100);
//        motorLeftFront.setTargetPosition(-100);
//        motorRightBack.setTargetPosition(100);
//        motorLeftBack.setTargetPosition(-100);
//
//        motorRightFront.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        motorLeftFront.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        motorRightBack.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        motorLeftBack.setMode(DcMotor.RunMode.RUN_TO_POSITION);


        motorRightFront.setPower(0.3);
        motorLeftFront.setPower(0.3);
        motorRightBack.setPower(0.3);
        motorLeftBack.setPower(0.3);

        sleep(6500);

        motorRightBack.setPower(0.3);
        motorRightFront.setPower(-0.3);
        motorLeftBack.setPower(-0.3);
        motorLeftFront.setPower(0.3);

        sleep(6500);

        motorRightBack.setPower(-0.3);
        motorRightFront.setPower(-0.3);
        motorLeftBack.setPower(-0.3);
        motorLeftFront.setPower(-0.3);

        sleep(6500);

        motorRightBack.setPower(-0.3);
        motorRightFront.setPower(0.3);
        motorLeftBack.setPower(0.3);
        motorLeftFront.setPower(-0.3);

        sleep(6500);



    }
}
