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

        motorRightBack.setDirection(DcMotorSimple.Direction.FORWARD);
        motorRightFront.setDirection(DcMotorSimple.Direction.FORWARD);

        waitForStart();






    }
}
