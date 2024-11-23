package org.firstinspires.ftc.teamcode.FTCAutoCode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous
public class fivePointAuto extends TemplateAuto{
    public final static double WRIST_MIN_RANGE = 0.0;
    public final static double WRIST_MAX_RANGE = 0.555;
     public void runOpMode() throws InterruptedException{
         super.runOpMode();
         arm.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
         waitForStart();

         arm.setTargetPosition(50);
         arm.setPower(0.3);
         arm.setMode(DcMotor.RunMode.RUN_TO_POSITION);

         wrist.setPosition(WRIST_MIN_RANGE);
         wrist.setPosition(WRIST_MAX_RANGE);
         sleep(1000);
         telemetry.addData("Wrist Position: ",wrist.getPosition());
         arm.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

         strafeRight(0.3);
         sleep(200);

         moveFront(0.4);
         sleep(700);


         //richard is the goat and so is krish
         sleep(300);
         moveFront(0);
         intake.setPower(1);
         sleep(2000);

         moveBack(0.5);
         sleep(190);

         sleep(200);
         intake.setPower(0);

         moveFront(0);
         sleep(1000);
         //stops the robot for a bit to reduce drifting

         strafeRight(0.5);
         sleep(2500);

         rotateLeft(0.5);
         sleep(1300);

         moveFront(0);
         sleep(1000);
         //stops to reduce drift

         arm.setTargetPosition(450);
         arm.setPower(1);
         arm.setMode(DcMotor.RunMode.RUN_TO_POSITION);
         sleep(8000);

         moveFront(0.5);
         sleep(320);























































































































































         telemetry.update();
     }



}
