package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.Gamepad;

public abstract class InputMap {
    final protected Gamepad gamepad1;
    final protected Gamepad gamepad2;

    InputMap(Gamepad gamepad1, Gamepad gamepad2) {
        this.gamepad1 = gamepad1;
        this.gamepad2 = gamepad2;
    }

    abstract public float readLeftX();
    abstract public float readLeftY();
    abstract public float readRightX();
//    abstract public boolean readImuReset();

    abstract public float readRightY();

    abstract public float readLeftTrigger();

    abstract public float readRightTrigger();
    abstract public boolean readLeftBumper();
    abstract public boolean readRightBumper();
    abstract public boolean readCross();
    abstract public boolean readTriangle();
    abstract public boolean readDpadUp();
    abstract public boolean readDpadDown();
    abstract public boolean readDomenLeftBooleanBumper();
    abstract public boolean readDomenRightBooleanBumper();
    abstract public boolean readDomenDpadUp();
    abstract public boolean readDomenDpadDown();
    abstract public boolean readDomenDpadLeft();
    abstract public boolean readDomenDpadRight();
    abstract public float readDomenLeftX();
    abstract public float readDomenLeftY();
    abstract public float readDomenRightX();
    abstract public float readDomenRightY();
    abstract public boolean readDomenCross();
    abstract public boolean readDomenTriangle();
    abstract public boolean readDomenSquare();
    abstract public boolean readDomenCircle();
    abstract public float readDomenLeftFloat();
    abstract public float readDomenRightFloat();
}