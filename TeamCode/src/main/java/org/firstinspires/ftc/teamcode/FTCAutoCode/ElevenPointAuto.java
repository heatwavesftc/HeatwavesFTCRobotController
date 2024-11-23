package org.firstinspires.ftc.teamcode.FTCAutoCode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous
public class ElevenPointAuto extends TemplateAuto {

    public final static double WRIST_MIN_RANGE = 0.0;
    public final static double WRIST_MAX_RANGE = 0.555;
    public void runOpMode() throws InterruptedException{
        super.runOpMode();
        arm.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        waitForStart();

        arm.setTargetPosition(50);
        arm.setPower(0.3);
        arm.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        wrist.setPosition(WRIST_MIN_RANGE);
        wrist.setPosition(WRIST_MAX_RANGE);
        sleep(1000);
        telemetry.addData("Wrist Position: ",wrist.getPosition());
        arm.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        strafeRight(0.4);
        sleep(500);

        moveBack(0);
        sleep(900);

        moveFront(0.5);
        sleep(580);

        rotateLeft(0.3);
        sleep(430);

        moveBack(0.3);
        sleep(400);

        strafeRight(0.3);
        sleep(830);

        moveFront(0);

        arm.setTargetPosition(350);
        arm.setPower(0.5);
        arm.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        sleep(3000);

        slides.setPower(0.5);
        sleep(1000);

        moveFront(0.2);
        sleep(400);


        moveBack(0.3);
        sleep(100);

        moveFront(0.2);
        sleep(190);

        sleep(100);
        moveFront(0);
        intake.setPower(1);
        sleep(1700);



} }
