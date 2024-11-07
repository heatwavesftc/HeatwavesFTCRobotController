package org.firstinspires.ftc.teamcode.FTCAutoCode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

@Autonomous
public class autoLeftFirstMeet extends TemplateAuto {
    private DcMotor liftMotor = null;
    private Servo wrist = null;
    private CRServo intake = null;
    private DcMotor armMotor = null;

    @Override
    public void runOpMode() throws InterruptedException {

        super.runOpMode();

        wrist = hardwareMap.get(Servo.class, "wrist");
        intake = hardwareMap.get(CRServo.class, "intake");
        armMotor = hardwareMap.get(DcMotor.class, "arm");

        armMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        armMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motorRightBack.setDirection(DcMotorSimple.Direction.FORWARD);
        motorRightFront.setDirection(DcMotorSimple.Direction.FORWARD);

        waitForStart();

        moveFront(0.6);
        sleep(400);

        strafeLeft(0.6);
        sleep(400);

        rotateLeft(0.6);
        sleep(800);

        armMotor.setTargetPosition(900);
        armMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);





    }
}
