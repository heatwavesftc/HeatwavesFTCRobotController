package org.firstinspires.ftc.teamcode.TeleopCode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

@Disabled
public class hardwareMecanum {
    public DcMotor motorLeftBack = null;
    public DcMotor motorLeftFront = null;
    public DcMotor motorRightBack = null;
    public DcMotor motorRightFront = null;

    // local OpMode members.
    HardwareMap hwMap  = null;
    private ElapsedTime period = new ElapsedTime();

    // Constructor
    public hardwareMecanum(){

    }

    // Initialize standard Hardware interfaces
    public void init(HardwareMap ahwMap) {
        // Save reference to Hardware map
        hwMap = ahwMap;

        // Define and Initialize Motors
        motorLeftBack = hwMap.get(DcMotor.class, "BL");
        motorLeftFront =  hwMap.get(DcMotor.class, "FL");
        motorRightBack =  hwMap.get(DcMotor.class, "BR");
        motorRightFront =  hwMap.get(DcMotor.class, "FR");


        motorLeftBack.setDirection(DcMotorSimple.Direction.REVERSE);
        motorLeftFront.setDirection(DcMotorSimple.Direction.REVERSE);
        motorRightBack.setDirection(DcMotorSimple.Direction.FORWARD);
        motorRightFront.setDirection(DcMotorSimple.Direction.FORWARD);

        // Set encoders
        motorRightFront.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorLeftFront.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorRightBack.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motorLeftBack.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        // Set all motors to zero power
        motorRightFront.setPower(0);
        motorLeftFront.setPower(0);
        motorRightBack.setPower(0);
        motorLeftBack.setPower(0);

    }
    public void stopMotors() {
        motorLeftBack.setPower(0);
        motorLeftFront.setPower(0);
        motorRightBack.setPower(0);
        motorRightFront.setPower(0);
    }
}
