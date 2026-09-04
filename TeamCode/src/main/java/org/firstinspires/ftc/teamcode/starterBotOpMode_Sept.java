package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import com.qualcomm.robotcore.util.ElapsedTime;

@TeleOp
public class starterBotOpMode_Sept extends OpMode {
    ProgrammingBoard board = new ProgrammingBoard();
    // private ElapsedTime runtime = new ElapsedTime(); // Not sure if we need to use time

    @Override
    public void init() {
        board.init(hardwareMap);
    }

    @Override
    public void loop() {
        double speed = gamepad1.left_stick_y;
        boolean intake = gamepad1.a;

        if (speed != 0) {
            board.setRobotSpeed(speed);
        }
        if (intake) {
            board.intake();
        }
    }
}