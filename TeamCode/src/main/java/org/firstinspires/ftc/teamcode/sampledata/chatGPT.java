package org.firstinspires.ftc.teamcode.sampledata;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name = "MoveForward5cm", group = "Autonomous")
public class chatGPT extends LinearOpMode {

    // Declare motors
    private DcMotor frontLeftMotor;
    private DcMotor frontRightMotor;
    private DcMotor backLeftMotor;
    private DcMotor backRightMotor;

    // Constants
    static final double COUNTS_PER_MOTOR_REV = 1440;  // Example: TETRIX Motor Encoder
    static final double WHEEL_DIAMETER_CM = 10.0;     // Wheel diameter in cm
    static final double COUNTS_PER_CM = (COUNTS_PER_MOTOR_REV) / (WHEEL_DIAMETER_CM * Math.PI);

    @Override
    public void runOpMode() {
        // Initialize the hardware variables
        frontLeftMotor = hardwareMap.get(DcMotor.class, "FL");
        frontRightMotor = hardwareMap.get(DcMotor.class, "FR");
        backLeftMotor = hardwareMap.get(DcMotor.class, "BL");
        backRightMotor = hardwareMap.get(DcMotor.class, "BR");

        // Set motor directions
        frontLeftMotor.setDirection(DcMotor.Direction.FORWARD);
        frontRightMotor.setDirection(DcMotor.Direction.REVERSE);
        backLeftMotor.setDirection(DcMotor.Direction.FORWARD);
        backRightMotor.setDirection(DcMotor.Direction.REVERSE);

        // Reset encoders
        resetEncoders();

        // Wait for the game to start (driver presses PLAY)
        waitForStart();

        // Move forward for 5 cm
        moveForward(1);

        // Stop the robot
        stopMotors();
    }

    // Function to reset motor encoders
    public void resetEncoders() {
        frontLeftMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontRightMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backLeftMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backRightMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        frontLeftMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        frontRightMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        backLeftMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        backRightMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    }

    // Function to move forward for a certain distance in cm
    public void moveForward(double distanceInCm) {
        int targetPosition = (int) (distanceInCm * COUNTS_PER_CM);

        // Set target positions for all motors
        frontLeftMotor.setTargetPosition(targetPosition);
        frontRightMotor.setTargetPosition(targetPosition);
        backLeftMotor.setTargetPosition(targetPosition);
        backRightMotor.setTargetPosition(targetPosition);

        // Set all motors to run to position mode
        frontLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        // Set the power to move the motors
        frontLeftMotor.setPower(0.5);
        frontRightMotor.setPower(0.5);
        backLeftMotor.setPower(0.5);
        backRightMotor.setPower(0.5);

        // Wait until all motors reach their target position
        while (opModeIsActive() &&
                (frontLeftMotor.isBusy() && frontRightMotor.isBusy() &&
                        backLeftMotor.isBusy() && backRightMotor.isBusy())) {
            telemetry.addData("Path", "Driving to %7d : %7d", targetPosition, frontLeftMotor.getCurrentPosition());
            telemetry.update();
        }

        // Stop all motion once the target is reached
        stopMotors();
    }

    // Function to stop all motors
    public void stopMotors() {
        frontLeftMotor.setPower(0);
        frontRightMotor.setPower(0);
        backLeftMotor.setPower(0);
        backRightMotor.setPower(0);
    }
}
