package org.firstinspires.ftc.teamcode.TeleopCode;
import static java.lang.Thread.sleep;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
public class newRobot extends OpMode {
    private DcMotor motorRightFront;
    private DcMotor motorRightBack;
    private DcMotor motorLeftFront;
    private DcMotor motorLeftBack;
    private DcMotor verticalSlides;

    private Servo horizontalSlidesLeft;
    private Servo horizontalSlidesRight;
    private Servo outtakeWristLeft;
    private Servo outtakeWristRight;
    private Servo outtakeClaw;
    private Servo intakeWristLeft;
    private Servo intakeWristRight;
    private Servo intakeWheelRight;
    private Servo intakeWheelLeft;

    public void moveDriveTrain() {
        double vertical;
        double horizontal;
        double pivot;
        vertical = 0.6 * gamepad1.left_stick_y;
        horizontal = 0.6 * -gamepad1.left_stick_x;
        pivot = 0.6 * -gamepad1.right_stick_x;

        motorRightFront.setPower(-pivot + (vertical - horizontal));
        motorRightBack.setPower(-pivot + (vertical + horizontal));
        motorLeftBack.setPower(-pivot + (-vertical + horizontal));
        motorLeftFront.setPower(-pivot + (-vertical - horizontal));
    }

    @Override
    public void init() {
      motorRightBack = hardwareMap.get(DcMotor.class, "RB");
      motorRightFront = hardwareMap.get(DcMotor.class, "RF");
      motorLeftBack = hardwareMap.get(DcMotor.class, "LB");
      motorLeftFront = hardwareMap.get(DcMotor.class, "LF");
      //drive motors

      verticalSlides = hardwareMap.get(DcMotor.class, "VerticalSlides");
      horizontalSlidesLeft = hardwareMap.get(Servo.class, "HorizontalSlidesLeft");
      horizontalSlidesRight = hardwareMap.get(Servo.class, "HorizontalSlidesLeft");
      //slides

      outtakeWristLeft = hardwareMap.get(Servo.class, "OuttakeLeft");
      outtakeWristRight = hardwareMap.get(Servo.class, "OuttakeRight");
      outtakeClaw = hardwareMap.get(Servo.class, "OuttakeClaw");
      //outtake

      intakeWheelLeft = hardwareMap.get(Servo.class, "WheelLeft");
      intakeWheelRight = hardwareMap.get(Servo.class, "WheelRight");
      intakeWristLeft = hardwareMap.get(Servo.class, "WristLeft");
      intakeWristRight = hardwareMap.get(Servo.class, "WristRight");
      //intake

        motorLeftBack.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        motorLeftFront.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        motorRightBack.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        motorRightFront.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        verticalSlides.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

    }
}