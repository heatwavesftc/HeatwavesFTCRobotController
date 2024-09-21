package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
// This code brings the base class for OpMode and declares the class as Auto

@Autonomous(name = "turningTeleOp")
public class turningAuto extends LinearOpMode {

    hardwareMecanum robot = new hardwareMecanum(); //Creates an instance of hardwareMecanum

    @Override
    public void runOpMode() throws InterruptedException {

        robot.init(hardwareMap);

        waitForStart();

        turn360Clockwise(0.5); //Half Power

        robot.stopMotors();
    }

    public void turn360Clockwise(double power) {
        robot.motorLeftBack.setPower(power);
        robot.motorLeftFront.setPower(power);
        robot.motorRightBack.setPower(power);
        robot.motorRightFront.setPower(power);

        sleep(2000);

        robot.stopMotors();
    }



}
