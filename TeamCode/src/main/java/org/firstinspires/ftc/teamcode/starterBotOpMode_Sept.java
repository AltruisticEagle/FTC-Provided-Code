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
        float speed = gamepad1.left_stick_y;

        boolean intake = gamepad1.a;
        boolean stopRobot = gamepad1.b;

        if (speed != 0) {
            board.setMotorSpeed(speed);
            telemetry.addData("FL", board.getFrontLeftVelocity());
            telemetry.addData("FR", board.getFrontRightVelocity());
            telemetry.addData("RL", board.getRearLeftVelocity());
            telemetry.addData("RR", board.getRearRightVelocity());
        }
        if (intake) {
            board.intake();
        }
        if (stopRobot) {
            board.setMotorSpeed(0);
        }
    }
}