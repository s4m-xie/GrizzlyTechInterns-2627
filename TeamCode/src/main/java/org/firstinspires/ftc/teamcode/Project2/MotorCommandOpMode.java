package org.firstinspires.ftc.teamcode.Project2;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.seattlesolvers.solverslib.command.CommandOpMode;
import com.seattlesolvers.solverslib.command.InstantCommand;
import com.seattlesolvers.solverslib.hardware.gamepad.GamepadEx;
import com.seattlesolvers.solverslib.hardware.gamepad.GamepadKeys;
@TeleOp (name = "MotorCommandOpMode", group = "CommandOpMode")
public class MotorCommandOpMode extends CommandOpMode{
    private MotorSubsystem motorSubsystem;
    private GamepadEx player1;

    @Override
    public void initialize(){
        motorSubsystem= new MotorSubsystem(hardwareMap, "moveitmoveit");
        player1=new GamepadEx(gamepad1);
        player1.getGamepadButton(GamepadKeys.Button.A).whenPressed(new InstantCommand(() -> motorSubsystem.setSpeed(0.5), motorSubsystem));
        player1.getGamepadButton(GamepadKeys.Button.B).whenPressed(new InstantCommand(() -> motorSubsystem.stopMotor(), motorSubsystem));
    }
}
