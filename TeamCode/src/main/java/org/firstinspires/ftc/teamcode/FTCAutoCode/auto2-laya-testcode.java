package org.firstinspires.ftc.teamcode.FTCAutoCode;

import

@Autonomous
public class auto1 extends LinearOpMode {

    //Motors
        private DcMotor motorRightFront = null;
        private DcMotor motorRightBack = null;
        private DcMotor motorLeftFront = null;
        private DcMotor motorLeftBack = null;

       @Override
        public void runOpMode() throws InterruptedException {

            motorRightFront = hardwareMap.get(DcMotor.class, "FR")
            motorRightBack = hardwareMap.get(DcMotor.class, "BR")
            motorLeftBack = hardwareMap.get(DcMotor.class, "BL")
            motorLeftFront = hardware.get(DcMotor.class, "FL")


            motorRightBack.setDirection(DcMotorSimple.Direction.FORWARD)
            motorRightFront.setDirection(DcMotorSimple.Direction.FORWARD)

            waitForStart();

            motorRightFront.setPower(-0.6);
            motorLeftFront.setPower(0.6);
            motorRightBack.setPower(-0.6);
            motorLeftBack.setPower(0.6);
        //move forward

            motorRightBack.setPower(-0.6);
            motorRightFront.setPower(0.6);
            motorLeftBack.setPower(-0.6);
            motorLeftFront.setPower(0.6);
            sleep(400)
         //strafe right

           motorRightBack.setPower(-0.6);
           motorRightFront.setPower(0.6);
           motorRightFront.setPower(0.6);
           motorLeftBack.setPower(-0.6);
           motorLeftFront.setPower(0.6);
           sleep(1600);
       //strafe right

           motorRightBack.setPower(-0.3);
           motorRightFront.setPower(-0.3);
           motorLeftBack.setPower(0.3);
           motorLeftFront.setPower(0.3);
           sleep(50)
       //move forward

           motorRightBack.setPower(-0.6);
           motorRightFront.setPower(-0.6);
           motorLeftBack.setPower(-0.6);
           motorLeftFront.setPower(-0.6)
           sleep(650)
       //turn left

           motorRightBack.setPower(0.6);
           motorRightFront.setPower(-0.6);
           motorLeftBack.setPower(0.6);
           motorLeftFront.setPower(-0.6);
           sleep(75)
           //strafe left

           motorRightBack.setPower(-0.6);
           motorRightFront.setPower(-0.6);
           motorLeftBack.setPower(0.6);
           motorLeftFront.setPower(0.6);
           sleep (2850)
           //move forward


       }
}