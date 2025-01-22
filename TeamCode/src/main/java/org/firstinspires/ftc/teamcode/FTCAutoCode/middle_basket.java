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

        moveBack(0.3);
        sleep(1500);

       /* rotateRight(0.4);
        sleep(1000);

        moveFront(0.5);
        sleep(1000);*/

        intake.setPower(-1);
//        rotateLeft(0.3);
//        sleep(700);
//
//        moveFront(0.1);
//        sleep(200);
        strafeRight(0.3);
        sleep(3910);

        moveFront(0.1);
        sleep(900);

    }
}
