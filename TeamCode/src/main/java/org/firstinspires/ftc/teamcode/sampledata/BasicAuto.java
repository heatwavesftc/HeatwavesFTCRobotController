package org.firstinspires.ftc.teamcode.sampledata;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@Autonomous
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

        motorRightFront.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorLeftFront.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorRightBack.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorLeftBack.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        motorLeftBack.setPower(0.2);
        motorLeftFront.setPower(0.2);
        motorRightFront.setPower(0.2);
        motorRightBack.setPower(0.2);

        sleep(3000);

        motorRightBack.setDirection(DcMotorSimple.Direction.FORWARD);
        motorRightFront.setDirection(DcMotorSimple.Direction.FORWARD);

        waitForStart();


        motorRightFront.setTargetPosition(300);
        motorLeftFront.setTargetPosition(300);
        motorRightBack.setTargetPosition(300);
        motorLeftBack.setTargetPosition(300);

        motorRightFront.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motorLeftFront.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motorRightBack.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        motorLeftBack.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        motorRightFront.setPower(.2);
        motorLeftFront.setPower(.2);
        motorRightBack.setPower(.2);
        motorLeftBack.setPower(.2);

        sleep(3000);

    }
    private void TravelDistance(int travel){
        motorRightFront.setTargetPosition(travel);
        motorLeftFront.setTargetPosition(travel);
        motorRightBack.setTargetPosition(travel);
        motorLeftBack.setTargetPosition(travel);
    }

    private void MotorPower(double motor){
        motorRightFront.setPower(motor);
        motorLeftFront.setPower(motor);
        motorRightBack.setPower(motor);
        motorLeftBack.setPower(motor);
    }
}
