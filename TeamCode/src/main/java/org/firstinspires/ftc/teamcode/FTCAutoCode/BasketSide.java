package org.firstinspires.ftc.teamcode.FTCAutoCode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous
public class BasketSide extends TemplateAuto{
    public final static double WRIST_MIN_RANGE = 0.0;
    public final static double WRIST_MAX_RANGE = 0.555;
     public void runOpMode() throws InterruptedException{
         super.runOpMode();
         arm.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
         slides.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
         waitForStart();


         arm.setTargetPosition(50);
         arm.setPower(0.2);
         arm.setMode(DcMotor.RunMode.RUN_TO_POSITION);

         wrist.setPosition(WRIST_MIN_RANGE);
         wrist.setPosition(WRIST_MAX_RANGE);
         sleep(1000);
         telemetry.addData("Wrist Position: ",wrist.getPosition());
         arm.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

         strafeRight(0.3);
         sleep(200);

         moveFront(0.4);
         sleep(810);


         //richard is the goat and so is krish
         sleep(300);
         moveFront(0);
         intake.setPower(1);
         sleep(2000);

         moveBack(0.5);
         sleep(190);

         sleep(200);
         intake.setPower(0);

         moveBack(0.2);
         sleep(390);

         strafeRight(0.3);
         sleep(350);

         rotateRight(0.5);
         sleep(650);

         strafeLeft(0.4);
         sleep(215);

         moveFront(0.4);
         sleep(2000);

         strafeLeft(0.4);
         sleep(415);

         moveBack(0.4);
         sleep(400);

         rotateRight(0.4);
         sleep(300);

         moveBack(0.4);
         sleep(1400);

         rotateLeft(0.4);
         sleep(300);

         moveFront(.25);
         sleep(300);

         rotateRight(0.4);
         sleep(500);

         moveFront(0.4);
         sleep(800);

         rotateLeft(0.5);
         sleep(300);

         moveFront(0.5);
         sleep(850);

         strafeLeft(0.5);
         sleep(570);

         moveBack(0.4);
         sleep( 1700);

        strafeRight(0.4);
        sleep(400);

        moveFront(0.5);
        sleep(1700);

        strafeLeft(0.5);
        sleep(500);

        moveBack(0.3);
        sleep(2700);
     }



}
