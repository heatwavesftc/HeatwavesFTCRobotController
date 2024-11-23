package org.firstinspires.ftc.teamcode.TeleopCode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
@Disabled
public class mecanumDrive extends OpMode {

    DcMotor motorRightFront;
    DcMotor motorRightBack;
    DcMotor motorLeftFront;
    DcMotor motorLeftBack;

    public void moveDriveTrain(){
        double vertical;
        double horizontal;
        double pivot;
        vertical = -gamepad1.left_stick_y;
        horizontal = gamepad1.left_stick_x;
        pivot = gamepad1.right_stick_x;

        motorRightFront.setPower(-pivot + (-vertical + horizontal));
        motorRightBack.setPower(-pivot+ (-vertical - horizontal));
        motorLeftBack.setPower(-pivot + (vertical - horizontal));
        motorLeftFront.setPower(-pivot + (vertical + horizontal));
    }

    @Override
    public void init() {
        motorRightFront = hardwareMap.get(DcMotor.class, "FR");
        motorRightBack = hardwareMap.get(DcMotor.class, "BR");
        motorLeftBack = hardwareMap.get(DcMotor.class, "BL");
        motorLeftFront = hardwareMap.get(DcMotor.class, "FL");
    }

    @Override
    public void init_loop() {

    }

    @Override
    public void loop() {
        moveDriveTrain();
    }
}
