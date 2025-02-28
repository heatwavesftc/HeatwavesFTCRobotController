package org.firstinspires.ftc.teamcode.FTCAutoCode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.DcMotor;

@Disabled
@Autonomous
public class observatonSide extends TemplateAuto {
    public final static double WRIST_MIN_RANGE = 0.0;
    public final static double WRIST_MAX_RANGE = 0.555;

    public void runOpMode() throws InterruptedException {
        super.runOpMode();
        arm.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        slides.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        motorLeftBack.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE );
        motorLeftFront.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE );
        motorRightFront.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE );
        motorRightBack.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE );
        waitForStart();

        arm.setTargetPosition(800);
        arm.setPower(0.4);
        arm.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        wrist.setPosition(WRIST_MIN_RANGE);
        wrist.setPosition(WRIST_MAX_RANGE);
        sleep(2900);

        moveFront(0.4);
        sleep(1200);

        strafeLeft(0.3);
        sleep(500);

        moveFront(0.4);
        sleep(200);

        arm.setTargetPosition(400);
        arm.setPower(0.1);
        arm.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        wrist.setPosition(WRIST_MIN_RANGE);
        wrist.setPosition(WRIST_MAX_RANGE);
        sleep(1000);

        moveBack(0.2);
        sleep(1000);
        //first specimen

        arm.setTargetPosition(0);
        arm.setPower(0.2);
        arm.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        sleep(200);

        strafeLeft(-0.5);
        sleep(1360);

        moveFront(0.5);
        sleep(1300);

        rotateRight(-0.4);
        sleep(270);

        moveBack(0.4);
        sleep(2100);
        //first sample in zone

        moveFront(0.4);
        sleep(2100);

        rotateLeft(-0.4);
        sleep(270);

        strafeLeft(-0.4);
        sleep(1300);

        moveBack(0.5);
        sleep(1800);
        //second sample

        moveFront(0.5);
        sleep(1800);

        strafeLeft(-0.4);
        sleep(800);

        moveBack(0.5);
        sleep(1800);
        //last sample in zone



    }
}
