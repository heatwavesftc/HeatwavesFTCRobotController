package org.firstinspires.ftc.teamcode.FTCAutoCode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class TemplateAuto extends LinearOpMode {
    //Motors
    protected DcMotor motorRightFront = null;
    protected DcMotor motorRightBack = null;
    protected DcMotor motorLeftFront = null;
    protected DcMotor motorLeftBack = null;


    @Override
    public void runOpMode() throws InterruptedException {
        motorRightFront = hardwareMap.get(DcMotor.class, "FR");
        motorRightBack = hardwareMap.get(DcMotor.class, "BR");
        motorLeftBack = hardwareMap.get(DcMotor.class, "BL");
        motorLeftFront = hardwareMap.get(DcMotor.class, "FL");
    }

    public void strafeLeft(double speed){
        motorLeftFront.setPower(-speed);
        motorRightFront.setPower(-speed);
        motorRightBack.setPower(speed);
        motorLeftBack.setPower(speed);
    }

    public void strafeRight(double speed){
        motorRightBack.setPower(-speed);
        motorRightFront.setPower(speed);
        motorLeftBack.setPower(-speed);
        motorLeftFront.setPower(speed);
    }

    public void moveFront(double speed){
        motorRightBack.setPower(-speed);
        motorRightFront.setPower(-speed);
        motorLeftFront.setPower(speed);
        motorLeftBack.setPower(speed);
    }

    public void moveBack(double speed){
        motorLeftBack.setPower(-speed);
        motorLeftFront.setPower(-speed);
        motorRightFront.setPower(speed);
        motorRightBack.setPower(speed);

    }

    public void rotateRight(double speed){
        motorRightBack.setPower(speed);
        motorRightFront.setPower(speed);
        motorLeftFront.setPower(speed);
        motorLeftBack.setPower(speed);
    }

    public void rotateLeft(double speed){
        motorRightBack.setPower(-speed);
        motorRightFront.setPower(-speed);
        motorLeftFront.setPower(-speed);
        motorLeftBack.setPower(-speed);
    }

}
