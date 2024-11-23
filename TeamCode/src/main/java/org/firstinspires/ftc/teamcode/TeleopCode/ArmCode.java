package org.firstinspires.ftc.teamcode.TeleopCode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
@Disabled
public class ArmCode extends OpMode {
    public DcMotor motorRightFront;
    public DcMotor motorRightBack;
    public DcMotor motorLeftFront;
    public DcMotor motorLeftBack;
    public DcMotor armMotor;

    public void moveDriveTrain(){
        double vertical;
        double horizontal;
        double pivot;
        vertical = -gamepad1.left_stick_y;
        horizontal = gamepad1.left_stick_x;
        pivot = gamepad1.right_stick_x;

        motorRightFront.setPower(pivot + (-vertical + horizontal));
        motorRightBack.setPower(pivot+ (-vertical - horizontal));
        motorLeftBack.setPower(pivot + (vertical - horizontal));
        motorLeftFront.setPower(pivot + (vertical + horizontal));
    }

    @Override
    public void init() {
        motorRightFront = hardwareMap.get(DcMotor.class, "FR");
        motorRightBack = hardwareMap.get(DcMotor.class, "BR");
        motorLeftBack = hardwareMap.get(DcMotor.class, "BL");
        motorLeftFront = hardwareMap.get(DcMotor.class, "FL");
        armMotor = hardwareMap.get(DcMotor.class,"ArmMotor");
    }

    @Override
    public void loop() {
        moveDriveTrain();
        armMotor.setPower(gamepad2.left_stick_x / 2);
        armMotor.setPower(gamepad2.left_stick_y / 2);
    }


}
