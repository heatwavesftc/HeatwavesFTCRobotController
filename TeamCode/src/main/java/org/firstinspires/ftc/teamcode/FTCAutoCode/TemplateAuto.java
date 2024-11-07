package org.firstinspires.ftc.teamcode.FTCAutoCode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class TemplateAuto extends LinearOpMode {
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

    public void forward(double speed){
        motorRightBack.setPower(-speed);
        motorRightFront.setPower(-speed);
        motorLeftFront.setPower(speed);
        motorLeftBack.setPower(speed);
    }

    public void back(double speed){
        motorLeftBack.setPower(-speed);
        motorLeftFront.setPower(-speed);
        motorRightFront.setPower(speed);
        motorRightBack.setPower(speed);
    }
}
