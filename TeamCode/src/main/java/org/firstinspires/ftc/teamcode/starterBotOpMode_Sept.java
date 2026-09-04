package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import com.qualcomm.robotcore.util.ElapsedTime;

@TeleOp
public class starterBotOpMode_Sept extends OpMode {
    ProgrammingBoard board = new ProgrammingBoard();

    @Override
    public void init() {
        board.init(hardwareMap);
    }

    @Override
    public void loop() {
        boolean speed = gamepad1.dpad_up;
        boolean intake = gamepad1.a;
        boolean stopRobot = gamepad1.b;

        if (speed) {
            board.setMotorSpeed(0.1);
        }
        if (intake) {
            board.intake();
        }
        if (stopRobot) {
            board.setMotorSpeed(0);
        }
    }
}