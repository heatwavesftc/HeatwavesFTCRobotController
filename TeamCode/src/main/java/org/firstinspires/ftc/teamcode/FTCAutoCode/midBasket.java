package org.firstinspires.ftc.teamcode.FTCAutoCode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous
public class midBasket extends TemplateAuto {

    public final static double WRIST_MIN_RANGE = 0.0;
    public final static double WRIST_MAX_RANGE = 0.555;

    public void runOpMode() throws InterruptedException {
        super.runOpMode();
        arm.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        slides.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        waitForStart();

        wrist.setPosition(WRIST_MIN_RANGE);
        wrist.setPosition(WRIST_MAX_RANGE);

        strafeRight(0.4);
        sleep(300);

        moveFront(0.4);
        sleep(700);

        rotateLeft(0.4);
        sleep(500);

        strafeRight(0.4);
        sleep(400);

        moveBack(0.3);
        sleep(100);

        strafeRight(0.3);
        sleep(100);

        rotateRight(0);
        sleep(400);

        arm.setTargetPosition(650);
        arm.setPower(0.4);
        arm.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        wrist.setPosition(WRIST_MIN_RANGE);
        wrist.setPosition(WRIST_MAX_RANGE);
        sleep(1000);

        moveFront(0.4);
        sleep(100);

        intake.setPower(1);
        sleep(700);

        moveBack(0.1);

        arm.setTargetPosition(5);
        arm.setPower(0.2);
        arm.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        wrist.setPosition(WRIST_MIN_RANGE);
        wrist.setPosition(WRIST_MAX_RANGE);
        sleep(1000);
        //mid basket

        rotateLeft(0.3);
        sleep(700);

        strafeLeft(0.4);
        sleep(1100);

        rotateRight(0.5);
        sleep(900);

        strafeRight(0.5);
        sleep(500);

        moveBack(0.2);
        sleep(100);

        strafeRight(0.5);
        sleep(550);

        moveFront(0.2);
        sleep(50);

        intake.setPower(1);
        sleep(600);

    }
}
