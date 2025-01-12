package org.firstinspires.ftc.teamcode.FTCAutoCode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.DcMotor;

@Disabled
@Autonomous
public class NewAuto2 extends TemplateAuto { public final static double WRIST_MIN_RANGE = 0.0;
    public final static double WRIST_MAX_RANGE = 0.555;
    public void runOpMode() throws InterruptedException{
        super.runOpMode();
        arm.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        waitForStart();

        arm.setTargetPosition(50);
        arm.setPower(0.3);
        arm.setMode(DcMotor.RunMode.RUN_TO_POSITION);


        strafeRight(0.3);
        sleep(200);

        moveFront(0.4);
        sleep(700);

        sleep(300);
        moveFront(0);
        intake.setPower(1);
        sleep(2000);

        moveBack(0.5);
        sleep(190);

        sleep(200);
        intake.setPower(0);

        moveBack(0.7);
        sleep(1250);

    }
}
