package org.firstinspires.ftc.teamcode.TeleopCode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp

public class IntakeSystem extends OpMode {
    public CRServo intake = null;

    @Override
    public void init() {
        intake = hardwareMap.get(CRServo.class, "intake");
    }

    @Override
    public void loop() {
        intake.setPower(gamepad1.left_trigger);

    }



}
