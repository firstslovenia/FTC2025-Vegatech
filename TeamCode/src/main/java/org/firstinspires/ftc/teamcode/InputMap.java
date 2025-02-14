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
}