package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
public class servoThor extends OpMode {
    public Servo servo;
    @Override
    public void init(){
        servo = hardwareMap.get(Servo.class, "servo");
    }

    @Override
    public void loop(){
        if (gamepad1.y){
            servo.setPosition(1);
        } else if (gamepad1.x) {
            servo.setPosition(0.2);
        }
    }

}
