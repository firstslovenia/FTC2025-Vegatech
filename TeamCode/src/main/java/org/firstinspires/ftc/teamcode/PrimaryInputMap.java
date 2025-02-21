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

    @Override
    public boolean readDpadUp() {
        return gamepad1.dpad_up;
    }

    @Override
    public boolean readDpadDown() {
        return gamepad1.dpad_down;
    }

    @Override
    public boolean readDomenDpadUp() {
        return gamepad2.dpad_up;
    }

    @Override
    public boolean readDomenDpadDown() {
        return gamepad2.dpad_down;
    }

    @Override
    public boolean readDomenDpadRight() {
        return gamepad2.dpad_right;
    }

    @Override
    public boolean readDomenDpadLeft() {
        return gamepad2.dpad_left;
    }

    @Override
    public boolean readDomenCircle() {
        return gamepad2.circle;
    }

    @Override
    public boolean readDomenSquare() {
        return gamepad2.square;
    }

    @Override
    public boolean readDomenCross() {
        return gamepad2.cross;
    }

    @Override
    public boolean readDomenTriangle() {
        return gamepad2.triangle;
    }

    @Override
    public float readDomenLeftX() {
        return gamepad2.left_stick_x;
    }

    @Override
    public float readDomenLeftY() {
        return gamepad2.left_stick_y;
    }

    @Override
    public float readDomenRightX() {
        return gamepad2.right_stick_x;
    }

    @Override
    public float readDomenRightY() {
        return gamepad2.right_stick_y;
    }

    @Override
    public boolean readDomenLeftBooleanBumper() {
        return gamepad2.left_bumper;
    }

    @Override
    public boolean readDomenRightBooleanBumper() {
        return gamepad2.right_bumper;
    }

    @Override
    public float readDomenLeftFloat() {
        return gamepad2.left_trigger;
    }

    @Override
    public float readDomenRightFloat() {
        return gamepad2.right_trigger;
    }

    @Override
    public boolean readDpadLeft() {
        return gamepad1.dpad_left;
    }

    @Override
    public boolean readDpadRight() {
        return gamepad1.dpad_right;
    }
}