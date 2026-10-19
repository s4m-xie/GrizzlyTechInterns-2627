package org.firstinspires.ftc.teamcode.Project2;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.seattlesolvers.solverslib.command.CommandOpMode;
import com.seattlesolvers.solverslib.command.InstantCommand;
import com.seattlesolvers.solverslib.gamepad.GamepadEx;
import com.seattlesolvers.solverslib.gamepad.GamepadKeys;

@TeleOp
public class MotorCommandOpMode extends CommandOpMode {

    private MotorSubsystem m_motorSubsystem;
    private GamepadEx gp1;

    @Override
    public void initialize() {

        m_motorSubsystem = new MotorSubsystem(hardwareMap);
        gp1 = new GamepadEx(gamepad1);

        register(m_motorSubsystem);

        gp1.getGamepadButton(GamepadKeys.Button.DPAD_UP)
                .whenPressed(new InstantCommand(m_motorSubsystem::forward));

        gp1.getGamepadButton(GamepadKeys.Button.DPAD_DOWN)
                .whenPressed(new InstantCommand(m_motorSubsystem::reverse));

    }
}
