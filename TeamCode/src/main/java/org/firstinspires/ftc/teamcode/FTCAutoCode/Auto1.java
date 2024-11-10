package org.firstinspires.ftc.teamcode.FTCAutoCode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@Autonomous
public class Auto1 extends TemplateAuto {

    //Motors
    private DcMotor motorRightFront = null;
    private DcMotor motorRightBack = null;
    private DcMotor motorLeftFront = null;
    private DcMotor motorLeftBack = null;
    //arm
    private DcMotor arm ;
    private DcMotor slides = null;
    //intake
    private Servo wrist;
    private CRServo intake;
    @Override
    public void runOpMode() throws InterruptedException {

        super.runOpMode();

        arm = hardwareMap.get(DcMotor.class, "arm");
        slides = hardwareMap.get(DcMotor.class, "Slide");
        wrist = hardwareMap.get(Servo.class, "wrist");
        intake = hardwareMap.get(CRServo.class, "intake");
        arm.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        waitForStart();
        arm.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        /*//right
        strafeRight(0.6);
        sleep(250);
        //forward
        moveFront(-0.6);
        sleep(800);
        //rotate
        rotateLeft(0.3);
        sleep(500);
        //backward
        moveBack(-0.3);
        sleep(85);
        //arm*/
        arm.setTargetPosition(750);
        arm.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        arm.setPower(0.5);

    }
}
