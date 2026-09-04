package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import com.qualcomm.robotcore.util.ElapsedTime;

@TeleOp
public class starterBotOpMode_Sept extends OpMode {
    ProgrammingBoard board = new ProgrammingBoard();
    double frontLeftVelocity = 0;
    double frontRightVelocity = 0;
    double rearLeftVelocity = 0;
    double rearRightVelocity = 0;

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
            telemetry.addData("FL", frontLeftVelocity);
            telemetry.addData("FR", frontRightVelocity);
            telemetry.addData("RL", rearLeftVelocity);
            telemetry.addData("RR", rearRightVelocity);
        }
        if (intake) {
            board.intake();
        }
        if (stopRobot) {
            board.setMotorSpeed(0);
        }
    }
}