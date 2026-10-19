package org.firstinspires.ftc.teamcode.Project2;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.seattlesolvers.solverslib.hardware.motors.Motor;

public class MotorSubsystem extends SubsystemBase {

    private Motor m_motor;
    private double motorSpeed;

    public MotorSubsystem(HardwareMap hwMap) {
        m_motor = new Motor(hwMap, "motor");
        m_motor.setRunMode(Motor.RunMode.RawPower);

        m_motor.setInverted(false);
        motorSpeed = 1;
    }

    public void forward() {
        m_motor.setInverted(false);
    }

    public void reverse() {
        m_motor.setInverted(true);
    }


    @Override
    public void periodic() {
        m_motor.set(motorSpeed);
    }
}
