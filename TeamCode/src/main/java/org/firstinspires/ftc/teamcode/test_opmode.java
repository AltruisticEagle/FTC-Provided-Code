package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class test_opmode extends OpMode {
    ProgrammingBoard board = new ProgrammingBoard();

    boolean a_button = gamepad1.a;


    @Override
    public void init() {
        board.init(hardwareMap);
    }

    @Override
    public void loop() {
        if (a_button) {
            board.setMotorSpeed(0.5);
        }
    }
}