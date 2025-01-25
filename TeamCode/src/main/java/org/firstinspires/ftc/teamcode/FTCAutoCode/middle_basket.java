package org.firstinspires.ftc.teamcode.FTCAutoCode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous
public class middle_basket extends TemplateAuto{
    public final static double WRIST_MIN_RANGE = 0.0;
    public final static double WRIST_MAX_RANGE = 0.555;
    public void runOpMode() throws InterruptedException {
        super.runOpMode();
        arm.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        slides.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        waitForStart();

        arm.setTargetPosition(100);
        arm.setPower(0.2);
        arm.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        wrist.setPosition(WRIST_MIN_RANGE);
        wrist.setPosition(WRIST_MAX_RANGE);
        sleep(1000);

        strafeRight(0.5);
        sleep(200);

        moveFront(0.4);
        sleep(1500);

        moveFront(0);
        arm.setTargetPosition(700);
        arm.setPower(0.2);
        arm.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        sleep(3000);

        moveFront(0.3);
        sleep(500);

        strafeRight(0.3);
        sleep(500);

        rotateLeft(0.4);
        sleep(500);

        strafeRight(0.2);
        sleep(500);

        moveFront(0.3);
        sleep(500);
        intake.setPower(1);
        sleep(500);

        moveBack(0.3);
        sleep(500);

        moveFront(0);
        arm.setTargetPosition(0);
        arm.setPower(0.2);
        arm.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        sleep(3000);

        intake.setPower(0);
        rotateLeft(-0.3);
        sleep(700);

        moveBack(0.5);
        sleep(650);

        /*strafeRight(0.3);
        sleep(700);

        rotateRight(0.5);
        sleep(650);

        strafeLeft(0.4);
        sleep(215);

        moveFront(0.4);
        sleep(2000);

        strafeLeft(0.4);
        sleep(415);

        moveBack(0.4);
        sleep(400);

        rotateRight(0.4);
        sleep(300);

        moveBack(0.4);
        sleep(1400);

        rotateLeft(0.4);
        sleep(300);

        moveFront(.25);
        sleep(300);

        rotateRight(0.4);
        sleep(500);

        moveFront(0.4);
        sleep(800);

        rotateLeft(0.5);
        sleep(300);

        moveFront(0.5);
        sleep(850);

        strafeLeft(0.5);
        sleep(570);

        moveBack(0.4);
        sleep( 1700);

        strafeRight(0.4);
        sleep(400);

        moveFront(0.5);
        sleep(1700);

        strafeLeft(0.5);
        sleep(500);

        moveBack(0.3);
        sleep(2700);*/
    }

}

