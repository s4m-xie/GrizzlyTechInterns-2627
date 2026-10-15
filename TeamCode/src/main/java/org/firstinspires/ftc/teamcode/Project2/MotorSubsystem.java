package org.firstinspires.ftc.teamcode.Project2;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.seattlesolvers.solverslib.hardware.motors.MotorEx;


public class MotorSubsystem extends SubsystemBase {

    private MotorEx motor;
    private double motor_power = 0.0;

    public MotorSubsystem(HardwareMap hmap, String name) {
        motor = new MotorEx(hmap, name);
        // motor = hmap.get(MotorEx.class, name);
    }

    public void setpower(double power) {
        motor_power = power;
    }

    public void reverse() {
        motor_power = -motor_power;
    }
    
    public void stop() {
        motor_power = 0.0;
    }

    @Override
    public void periodic() {
        motor.set(motor_power);
    }
}
