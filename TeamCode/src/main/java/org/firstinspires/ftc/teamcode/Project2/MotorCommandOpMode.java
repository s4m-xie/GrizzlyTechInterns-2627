package org.firstinspires.ftc.teamcode.Project2;

import com.seattlesolvers.solverslib.command.CommandOpMode;
import com.seattlesolvers.solverslib.gamepad.GamepadEx;


public class MotorCommandOpMode extends CommandOpMode {

    private MotorSubsystem motorsubsystem;
    private GamepadEx gpad1;

    @Override
    public void initialize() {
        motorsubsystem = new MotorSubsystem(hardwareMap, "motor");
        gpad1 = new GamepadEx(gamepad1);
    }

    @Override
    public void run() {
        super.run();

        double power = gpad1.getLeftY();
        motorsubsystem.setpower(power);
    }
}
