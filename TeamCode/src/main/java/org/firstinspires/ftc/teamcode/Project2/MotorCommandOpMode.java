package org.firstinspires.ftc.teamcode.Project2;

import com.seattlesolvers.solverslib.command.CommandOpMode;
import com.seattlesolvers.solverslib.gamepad.GamepadEx;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "MotorCommandOpMode")
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
