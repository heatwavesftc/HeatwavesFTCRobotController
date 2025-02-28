package org.firstinspires.ftc.teamcode.FTCAutoCode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.DcMotor;

@Disabled
@Autonomous
public class midBasketNet extends TemplateAuto {

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

        wrist.setPosition(WRIST_MIN_RANGE);
        wrist.setPosition(WRIST_MAX_RANGE);

        strafeRight(0.4);
        sleep(300);

        moveFront(0.4);
        sleep(700);

        rotateLeft(0.4);
        sleep(500);

        strafeRight(0.4);
        sleep(500);

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
        sleep(1100);

        moveFront(0.4);
        sleep(200);

        intake.setPower(1);
        sleep(700);

        moveBack(0.1);

        arm.setTargetPosition(50);
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

        rotateLeft(0.5);
        sleep(1350);
    }
}
