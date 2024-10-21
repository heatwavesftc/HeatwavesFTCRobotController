package org.firstinspires.ftc.teamcode.sampledata;

import static java.lang.Thread.sleep;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous
public class autoBasic extends LinearOpMode  {
    //private static final int COUNTS_PER_CM = (5 * 91.67);
    ElapsedTime         runtime = new ElapsedTime();

    //Motor
    DcMotor motorRightFront;
    DcMotor motorRightBack;
    DcMotor motorLeftFront;
    DcMotor motorLeftBack;

    static final double HD_COUNTS_PER_REV = 28;
    static final double DRIVE_GEAR_REDUCTION = 20.15293;
    static final double WHEEL_CIRCUMFERENCE_MM = 90 * Math.PI;
    static final double DRIVE_COUNTS_PER_MM = (HD_COUNTS_PER_REV * DRIVE_GEAR_REDUCTION) / WHEEL_CIRCUMFERENCE_MM;
    static final double DRIVE_COUNTS_PER_IN = DRIVE_COUNTS_PER_MM * 25.4;


    @Override
    public void runOpMode() throws InterruptedException {

        motorRightFront = hardwareMap.get(DcMotor.class, "FR");
        motorRightBack = hardwareMap.get(DcMotor.class, "BR");
        motorLeftBack = hardwareMap.get(DcMotor.class, "BL");
        motorLeftFront = hardwareMap.get(DcMotor.class, "FL");
        waitForStart();
        if(opModeIsActive()){
            int targetRightFront = motorRightFront.getCurrentPosition() + (int) (1000 * DRIVE_COUNTS_PER_IN);
            int targetRightBack = motorRightBack.getCurrentPosition() + (int)(1000 * DRIVE_COUNTS_PER_IN);
            int targetLeftBack = motorLeftBack.getCurrentPosition() + (int)(1000 * DRIVE_COUNTS_PER_IN);
            int targetLeftFront = motorLeftFront.getCurrentPosition() + (int)(1000 * DRIVE_COUNTS_PER_IN);

            motorRightFront.setTargetPosition(targetRightFront);
            motorLeftFront.setTargetPosition(targetLeftFront);
            motorRightBack.setTargetPosition(targetRightBack);
            motorLeftBack.setTargetPosition(targetLeftBack);

            telemetry.addData("Status","enter");
            drive(-0.7);

            while(opModeIsActive() && (
                    motorRightFront.isBusy() ||
                            motorLeftFront.isBusy() ||
                            motorRightBack.isBusy() ||
                            motorLeftBack.isBusy())){


            }
            drive(0);
        }

    }
    //Methods
    public void drive(double power){
        motorRightFront.setPower(power);
        motorRightBack.setPower(power);
        motorLeftFront.setPower(-power);
        motorLeftBack.setPower(-power);

    }



}
