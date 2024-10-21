package org.firstinspires.ftc.teamcode.sampledata;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class BasicAuto extends LinearOpMode {

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

        motorRightBack.setDirection(DcMotorSimple.Direction.REVERSE);
        motorRightFront.setDirection(DcMotorSimple.Direction.REVERSE);

        waitForStart();
        while(opModeIsActive()){
            forwardOrBackwards(1);
            Thread.sleep(4000);
            forwardOrBackwards(0);

        }

    }
    private void forwardOrBackwards(double power){
        motorRightFront.setPower(power);
        motorLeftFront.setPower(power);
        motorRightBack.setPower(power);
        motorLeftBack.setPower(power);
    }

    private void strafe(double power){
        motorRightFront.setPower(-power);
        motorLeftFront.setPower(power);
        motorRightBack.setPower(-power);
        motorLeftBack.setPower(power);
    }
}
