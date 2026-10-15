package org.firstinspires.ftc.teamcode.Project2;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.seattlesolvers.solverslib.hardware.motors.MotorEx;


public class MotorSubsystem extends SubsystemBase {

    private MotorEx motor;
    private double motor_power = 0.0;

    public MotorSubsystem(HardwareMap hmap, String name) {
        motor = new hmap.get(MotorEx.class, name);
    }

    @Override
    public void periodic() {
        
    }
}
