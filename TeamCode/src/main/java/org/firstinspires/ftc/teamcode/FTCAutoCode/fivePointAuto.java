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
         sleep(300);

         sleep(200);
         intake.setPower(0);
         strafeRight(0.5);
         sleep(2500);

         rotateLeft(0.5);
         sleep(1050);

         arm.setTargetPosition(800);
         arm.setPower(0.5);
         arm.setMode(DcMotor.RunMode.RUN_TO_POSITION);
         sleep(1000);

         moveFront(0.5);
         sleep(500);

         telemetry.update();
     }



}
