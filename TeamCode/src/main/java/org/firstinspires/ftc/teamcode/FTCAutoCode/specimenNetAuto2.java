package org.firstinspires.ftc.teamcode.FTCAutoCode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.DcMotor;

@Disabled
@Autonomous
public class specimenNetAuto2 extends TemplateAuto {
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

        arm.setTargetPosition(750);
        arm.setPower(0.4);
        arm.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        wrist.setPosition(WRIST_MIN_RANGE);
        wrist.setPosition(WRIST_MAX_RANGE);
        sleep(2500);

        moveFront(0.4);
        sleep(1400);

        arm.setTargetPosition(400);
        arm.setPower(0.1);
        arm.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        wrist.setPosition(WRIST_MIN_RANGE);
        wrist.setPosition(WRIST_MAX_RANGE);
        sleep(1000);

        moveBack(0.2);
        sleep(10005);
        //first specimen

        arm.setTargetPosition(0);
        arm.setPower(0.2);
        arm.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        sleep(200);

        strafeLeft(-0.5);
        sleep(1010);

        moveFront(0.5);
        sleep(1300);

        rotateRight(0.4);
        sleep(250);

        moveBack(0.4);
        sleep(2000);
        //first sample in net zone

        moveFront(0.4);
        sleep(2000);

        rotateLeft(0.4);
        sleep(250);

        strafeLeft(0.4);
        sleep(850);

        moveBack(0.5);
        sleep(1800);
        //second sample

        moveFront(0.5);
        sleep(1800);

        strafeLeft(0.4);
        sleep(900);

        moveBack(0.5);
        sleep(1700);
        //last sample in net zone

        strafeRight(0.4);
        sleep(200);

        moveFront(0.5);
        sleep(1600);

        strafeLeft(0);

        rotateRight(0.5);
        sleep(600);

        rotateRight(0);

        arm.setTargetPosition(620);
        arm.setPower(0.4);
        arm.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        sleep(1500);

        moveFront(0.4);
        sleep(1400);
        //ascent
    }
}
