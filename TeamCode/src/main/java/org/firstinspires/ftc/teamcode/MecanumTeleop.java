
package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.Range;



@TeleOp(name="Mecanum: Teleop", group="Mecanum")
public class MecanumTeleop extends LinearOpMode {

    /* Declare OpMode members. */
   HardwareMecanum robot = new HardwareMecanum(); //Use a Mecanum's hardware

    @Override
    public void runOpMode() {
        double x1; // left/Right
        double y1; // front/back

        double fortyFiveInRads = -Math.PI/4;
        double cosine45 = Math.cos(fortyFiveInRads);
        double sine45 = Math.sin(fortyFiveInRads);

        double x2;
        double y2;

        // Define and Initialize Motors
        robot.init(hardwareMap);

        // Send telemetry message to signify robot waiting;
        telemetry.addData(">", "Robot Ready.  Press START.");    //
        telemetry.update();

        // Wait for the game to start (driver presses START)
        waitForStart();

        // run until the end of the match (driver presses STOP)
        while (opModeIsActive()) {

            //left joystick
            y1 = -gamepad1.left_stick_y;
            x1 =  gamepad1.right_stick_x;

            //need to rotate 45 degrees
            y2 = y1*cosine45 + x1*sine45;
            x2 = x1*cosine45 - y1*sine45;


            // Output the safe vales to the motor drives.
            robot.motorLeftFront.setPower(x2);
            robot.motorLeftBack.setPower(x2);

            robot.motorRightFront.setPower(y2);
            robot.motorRightBack.setPower(y2);

            // Send telemetry message to signify robot running;
            telemetry.addData("x1",  "%.2f", x1);
            telemetry.addData("y1", "%.2f", y1);
            telemetry.update();

            // Pace this loop
            sleep(50);
        }
    }
}
