package org.firstinspires.ftc.teamcode.FTCAutoCode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous
public class SpecStatePark extends TemplateAuto { public final static double WRIST_MIN_RANGE = 0.0;
    public final static double WRIST_MAX_RANGE = 0.555;
    public void runOpMode() throws InterruptedException{
        super.runOpMode();
        arm.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        waitForStart();

        arm.setTargetPosition(50);
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

        strafeLeft(0.3);
        sleep(390);

        moveFront(0);
        sleep(400);

        clawslides.setTargetPosition(CLAW_SLIDES_LOW);
        clawslides.setPower(1.8);
        clawslides.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        moveBack(0);
        sleep(350);

        claw.setPosition(0);

        strafeRight(0.5);
        sleep(600);

        moveFront(0.6);
        sleep(700);

        strafeRight(0.5);
        sleep(800);

        moveFront(0.5);
        sleep(900);

    }
}
