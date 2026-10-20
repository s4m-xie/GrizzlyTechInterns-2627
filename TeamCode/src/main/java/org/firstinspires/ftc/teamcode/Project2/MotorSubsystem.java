package org.firstinspires.ftc.teamcode.Project2;
import com.seattlesolvers.solverslib.hardware.motors.Motor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class MotorSubsystem extends SubsystemBase{
    private final Motor moveitmoveit;
    public MotorSubsystem(HardwareMap hardwaremap, String motorname){
        moveitmoveit = new Motor(hardwaremap, motorname);
    }

    @Override
    public void periodic(){

    }
    public void setSpeed(double speed){
        moveitmoveit.set(speed);
    }
    public void stopMotor(){
        moveitmoveit.stopMotor();
    }
}
