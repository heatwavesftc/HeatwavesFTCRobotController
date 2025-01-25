package org.firstinspires.ftc.teamcode.FTCAutoCode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous
public class specimenNetAuto extends TemplateAuto {
    public final static double WRIST_MIN_RANGE = 0.0;
    public final static double WRIST_MAX_RANGE = 0.555;

    public void runOpMode() throws InterruptedException {
        super.runOpMode();
        arm.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        slides.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        waitForStart();

        arm.setTargetPosition(700);
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
        sleep(1000);
        //first specimen

        strafeLeft(0.5);
        sleep(950);

    }
}
