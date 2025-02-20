package org.firstinspires.ftc.teamcode.FTCAutoCode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous
public class netZone2 extends TemplateAuto {
    public final static double WRIST_MIN_RANGE = 0.0;
    public final static double WRIST_MAX_RANGE = 0.555;

    public void runOpMode() throws InterruptedException {
        super.runOpMode();
        arm.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        slides.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        motorLeftBack.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        motorLeftFront.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        motorRightFront.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        motorRightBack.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        waitForStart();

        arm.setTargetPosition(50);
        arm.setPower(0.2);
        arm.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        wrist.setPosition(WRIST_MIN_RANGE);
        wrist.setPosition(WRIST_MAX_RANGE);
        sleep(1000);
        telemetry.addData("Wrist Position: ", wrist.getPosition());
        arm.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        strafeRight(0.3);
        sleep(200);

        moveFront(0.4);
        sleep(810);


        //richard is the goat and so is krish
        sleep(300);
        moveFront(0);
        intake.setPower(1);
        sleep(2000);
        //first sample

        moveBack(0.4);
        sleep(40);

        sleep(200);
        intake.setPower(0);

        moveBack(0.2);
        sleep(390);

        strafeRight(0.2);
        sleep(200);

        rotateRight(0.5);
        sleep(750);

        moveFront(0.4);
        sleep(1900);

        rotateRight(0.3);
        sleep(300);

        moveBack(0.5);
        sleep(1600);
        //second sample

        moveFront(0.5);
        sleep(1650);

        rotateLeft(0.3);
        sleep(190);

        strafeLeft(0.4);
        sleep(1000);

        moveBack(0.5);
        sleep(1700);
        //third

        moveFront(0.5);
        sleep(1600);

        strafeLeft(0.4);
        sleep(600);

        moveBack(0.5);
        sleep(1550);
        //fourth

        strafeRight(0.4);
        sleep(400);

        moveFront(0.5);
        sleep(1520);

        strafeLeft(0);

        rotateRight(0.5);
        sleep(650);

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