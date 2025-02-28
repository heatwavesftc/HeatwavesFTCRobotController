package org.firstinspires.ftc.teamcode.FTCAutoCode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@Autonomous
@Disabled
public class TemplateAuto extends LinearOpMode {
    //Motors
    protected DcMotor motorRightFront = null;
    protected DcMotor motorRightBack = null;
    protected DcMotor motorLeftFront = null;
    protected DcMotor motorLeftBack = null;
    protected DcMotor arm;
    protected DcMotor slides = null;
    protected DcMotor clawslides = null;
    //servo
    protected Servo wrist;
    protected CRServo intake;
    protected Servo claw;

    int CLAW_SLIDES_LOW = 0;
    int CLAW_SLIDES_HIGH = -2150;

    @Override
    public void runOpMode() throws InterruptedException {
        motorRightFront = hardwareMap.get(DcMotor.class, "FR");
        motorRightBack = hardwareMap.get(DcMotor.class, "BR");
        motorLeftBack = hardwareMap.get(DcMotor.class, "BL");
        motorLeftFront = hardwareMap.get(DcMotor.class, "FL");
        arm = hardwareMap.get(DcMotor.class, "arm");
        slides = hardwareMap.get(DcMotor.class, "Slide");
        wrist = hardwareMap.get(Servo.class, "wrist");
        intake = hardwareMap.get(CRServo.class, "intake");
        claw = hardwareMap.get(Servo.class, "claw");
        clawslides = hardwareMap.get(DcMotor.class, "clawSlides");

        arm.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        slides.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        clawslides.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        motorLeftBack.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE );
        motorLeftFront.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE );
        motorRightFront.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE );
        motorRightBack.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE );


    }

    public void strafeLeft(double speed){
        motorLeftFront.setPower(-speed);
        motorRightFront.setPower(-speed);
        motorRightBack.setPower(speed);
        motorLeftBack.setPower(speed);
    }

    public void strafeRight(double speed){
        motorRightBack.setPower(-speed);
        motorRightFront.setPower(speed);
        motorLeftBack.setPower(-speed);
        motorLeftFront.setPower(speed);
    }

    public void moveFront(double speed){
        motorRightBack.setPower(-speed);
        motorRightFront.setPower(-speed);
        motorLeftFront.setPower(speed);
        motorLeftBack.setPower(speed);
    }

    public void moveBack(double speed){
        motorLeftBack.setPower(-speed);
        motorLeftFront.setPower(-speed);
        motorRightFront.setPower(speed);
        motorRightBack.setPower(speed);

    }

    public void rotateRight(double speed){
        motorRightBack.setPower(speed);
        motorRightFront.setPower(speed);
        motorLeftFront.setPower(speed);
        motorLeftBack.setPower(speed);
    }

    public void rotateLeft(double speed){
        motorRightBack.setPower(-speed);
        motorRightFront.setPower(-speed);
        motorLeftFront.setPower(-speed);
        motorLeftBack.setPower(-speed);
    }

}
