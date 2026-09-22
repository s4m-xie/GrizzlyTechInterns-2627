package org.firstinspires.ftc.teamcode.Lecture1;
//what was lectured during sept 15

//sample subsystem 
public class SampleClass() extends SubsystemBase {
    
    
    private int x;
    
    public SampleClass() {
        //sample constructor
        x = 5;
    }

    public void method() {
        //sample method
    }

    @Override
    public void periodic() {
        //sample periodic 
        // remember this is cycled again and again when ran through the robot
    }
}