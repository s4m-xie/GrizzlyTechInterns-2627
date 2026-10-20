package org.firstinspires.ftc.teamcode.Project2;

import com.seattlesolvers.solverslib.command.CommandOpMode;
import com.seattlesolvers.solverslib.gamepad.GamepadEx;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.seattlesolvers.solverslib.command.RunCommand;

@TeleOp(name = "MotorCommandOpMode")
public class MotorCommandOpMode extends CommandOpMode {

    private MotorSubsystem motorsubsystem;
    private GamepadEx gpad1;

    @Override
    public void initialize() {
        motorsubsystem = new MotorSubsystem(hardwareMap, "motor");
        gpad1 = new GamepadEx(gamepad1);
        
        motorsubsystem.setDefaultCommand(
            new RunCommand(() -> motorsubsystem.setpower(gpad1.getLeftY()), motorsubsystem)
        );

        register(motorsubsystem);
    }
}
