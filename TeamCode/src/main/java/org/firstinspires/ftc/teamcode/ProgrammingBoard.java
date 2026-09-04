package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

public class ProgrammingBoard {
    private DcMotorEx frontLeftMotor;
    private DcMotorEx frontRightMotor;
    private DcMotorEx rearLeftMotor;
    private DcMotorEx rearRightMotor;
    private DcMotorEx intakeMotor;
    private Servo leftIntakeServo;
    private Servo rightIntakeServo;


    public void init(HardwareMap hardwareMap) {
        // There are 7 devices on the starter bot at the moment
        // 5 DC Motors
        // 4 of them for wheels and 1 for the intake
        // 2 Servos, one on either side of the intake

        // Initialising wheel motors
        frontLeftMotor = hardwareMap.get(DcMotorEx.class, "frontLeftMotor");
        frontLeftMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        frontLeftMotor.setDirection(DcMotor.Direction.REVERSE);

        frontRightMotor = hardwareMap.get(DcMotorEx.class, "frontRightMotor");
        frontRightMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        frontRightMotor.setDirection(DcMotor.Direction.FORWARD);

        rearLeftMotor = hardwareMap.get(DcMotorEx.class, "rearLeftMotor");
        rearLeftMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        rearLeftMotor.setDirection(DcMotor.Direction.REVERSE);

        rearRightMotor = hardwareMap.get(DcMotorEx.class, "rearRightMotor");
        rearRightMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        rearRightMotor.setDirection(DcMotor.Direction.FORWARD);

        // Initialising intake motor
        intakeMotor = hardwareMap.get(DcMotorEx.class, "intakeMotor");
        intakeMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        // Initialising intake servos
        leftIntakeServo = hardwareMap.get(Servo.class, "leftIntakeServo");

        rightIntakeServo = hardwareMap.get(Servo.class, "rightIntakeServo");
    }

    public void setMotorSpeed(double speed) {
        frontLeftMotor.setPower(speed);
        frontRightMotor.setPower(speed);
        rearLeftMotor.setPower(speed);
        rearRightMotor.setPower(speed);
    }

    public void intake() {
        intakeMotor.setPower(0.5);
        leftIntakeServo.setPosition(0);
        rightIntakeServo.setPosition(0);
    }
}

