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

    @Override
    public boolean readImuReset() {
        return gamepad1.options;
    }

    @Override
    public float readRightY() {
        return gamepad2.right_stick_y;
    }
}