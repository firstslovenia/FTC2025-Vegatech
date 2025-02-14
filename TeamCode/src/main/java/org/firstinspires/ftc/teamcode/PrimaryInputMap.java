package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.Gamepad;

public class PrimaryInputMap extends InputMap {
    public PrimaryInputMap(Gamepad gamepad1, Gamepad gamepad2) {
        super(gamepad1, gamepad2);
    }

    @Override
    public float readLeftX() {
        return gamepad1.left_stick_x;
    }

    @Override
    public float readLeftY() {
        return gamepad1.left_stick_y;
    }

    @Override
    public float readRightX() {
        return gamepad1.right_stick_x;
    }

//    @Override
//    public boolean readImuReset() {
//        return gamepad1.options;
//    }

    @Override
    public float readRightY() {
        return gamepad1.right_stick_y;
    }

    public float readLeftTrigger() {
        return gamepad1.left_trigger;
    }

    @Override
    public float readRightTrigger() {
        return gamepad1.right_trigger;
    }

    @Override
    public boolean readLeftBumper() {
        return gamepad1.left_bumper;
    }

    @Override
    public boolean readRightBumper() {
        return gamepad1.right_bumper;
    }

    @Override
    public boolean readTriangle() {
        return gamepad1.triangle;
    }

    @Override
    public boolean readCross() {
        return gamepad1.cross;
    }
}