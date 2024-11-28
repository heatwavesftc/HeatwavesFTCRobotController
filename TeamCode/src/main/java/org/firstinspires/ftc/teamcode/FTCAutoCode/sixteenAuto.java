package org.firstinspires.ftc.teamcode.FTCAutoCode;

import com.qualcomm.robotcore.hardware.DcMotor;

public class sixteenAuto extends TemplateAuto {

    public void runOpMode() throws InterruptedException{
        super.runOpMode();
        arm.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        waitForStart();

        arm.setTargetPosition(50);
        arm.setPower(0.3);
        arm.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        strafeRight(0.2);
        sleep(100);

         moveFront(0.3);
         sleep(500);

         strafeRight(0.4);
         sleep(600);

         moveFront(0.4);
         sleep(400);

         rotateLeft(0.5);
         sleep(900);

         arm.setTargetPosition(750);
         arm.setPower(0.5);
         arm.setMode(DcMotor.RunMode.RUN_TO_POSITION);

         slides.setPower(0.5);
         sleep(550);

         intake.setPower(1);
         sleep(1000);



}
 }
