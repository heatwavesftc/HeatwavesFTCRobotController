package org.firstinspires.ftc.teamcode.FTCAutoCode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous
public class SpecStateHang extends TemplateAuto {
    public final static double WRIST_MIN_RANGE = 0.0;
    public final static double WRIST_MAX_RANGE = 0.555;

    public void runOpMode() throws InterruptedException {
        super.runOpMode();
        arm.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        waitForStart();

        arm.setTargetPosition(20);
        arm.setPower(0.3);
        arm.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        wrist.setPosition(WRIST_MAX_RANGE);

        claw.setPosition(1);

        clawslides.setTargetPosition(-2150);
        clawslides.setPower(2.5);
        clawslides.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        strafeLeft(0.6);
        sleep(850);

        moveBack(0.3);
        sleep(450);

        strafeLeft(0.34);
        //original is 0.3
        sleep(400);

        moveFront(0);
        sleep(400);

        clawslides.setTargetPosition(CLAW_SLIDES_LOW);
        clawslides.setPower(1.8);
        clawslides.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        moveBack(0);
        sleep(350);

        claw.setPosition(0);
        //first spec

        strafeRight(0.5);
        sleep(600);

        moveFront(0.6);
        sleep(900);

        rotateLeft(0.6);
        sleep(530);

        moveFront(0.6);
        sleep(950);

        strafeRight(0.5);
        sleep(480);

        moveBack(0.7);
        sleep(1110);
        //first sample in obv

        moveFront(0.63);
        sleep(1310);

        strafeRight(0.55);
        sleep(430);
        //original is 0.5

        moveBack(0.6);
        sleep(1400);
        //second sample in obv

        moveFront(0.7);
        sleep(1070);

        strafeRight(0.55);
        sleep(700);
        //original is 0.5

        moveBack(0.7);
        sleep(1210);
        //third sample in obv

        strafeLeft(0.5);
        sleep(225);

        moveFront(0.6);
        sleep(620);

        rotateLeft(0.5);
        sleep(700);

        moveFront(0.3);
        sleep(90);

        strafeLeft(0.6);
        sleep(1250);

        moveFront(0);
        sleep(600);

        claw.setPosition(1);

        moveFront(0);
        sleep(700);

        clawslides.setTargetPosition(-2150);
        clawslides.setPower(2.5);
        clawslides.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        //pick up spec

        strafeRight(0.8);
        sleep(250);

        rotateRight(0.8);
        sleep(900);

        moveBack(0.85);
        sleep(1090);

        strafeLeft(0.7);
        sleep(675);

        moveFront(0);
        sleep(300);

        clawslides.setTargetPosition(CLAW_SLIDES_LOW);
        clawslides.setPower(1.8);
        clawslides.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        moveBack(0);
        sleep(500);

        claw.setPosition(0);
        //2nd spec hung

        strafeRight(0.8);
        sleep(250);

        rotateRight(0.84);
        sleep(910);

        moveBack(0.85);
        sleep(1090);

        strafeLeft(0.7);
        sleep(866);



        claw.setPosition(1);

        moveFront(0);
        sleep(300);

        moveFront(0);
        sleep(550);

        clawslides.setTargetPosition(-2150);
        clawslides.setPower(2.5);
        clawslides.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        //pick up 3rd spec

        strafeRight(0.8);
        sleep(250);

        rotateRight(0.8);
        sleep(900);

        moveBack(0.85);
        sleep(1050);

        strafeLeft(0.7);
        sleep(740);

        moveBack(0);
        sleep(500);

        clawslides.setTargetPosition(CLAW_SLIDES_LOW);
        clawslides.setPower(1.8);
        clawslides.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        moveBack(0);
        sleep(500);

        claw.setPosition(0);
        //hang third spec

    }
}
