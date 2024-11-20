package org.firstinspires.ftc.teamcode.FTCAutoCode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous
public class fivePointAuto extends TemplateAuto{
     public void runOpMode() throws InterruptedException{
         super.runOpMode();

         waitForStart();

         wrist.setPosition(0);
         wrist.setPosition(0.5);
         sleep(1000);

         arm.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        /* moveFront(0.6);
         sleep(1000);


         intake.setPower(-1);
         intake.setPower(0);

         rotateLeft(0.3);
         sleep(1000);*/
     }



}
