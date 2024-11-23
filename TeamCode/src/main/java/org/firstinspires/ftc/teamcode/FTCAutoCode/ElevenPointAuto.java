package org.firstinspires.ftc.teamcode.FTCAutoCode;

import com.qualcomm.robotcore.hardware.DcMotor;

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

        moveFront(0.4);
        sleep(350);

        strafeLeft(0.5);
        sleep(350);

        rotateRight(0.5);
        sleep(150);
} }