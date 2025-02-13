package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.Gamepad;

public abstract class InputMap {
    final protected Gamepad gamepad1;
    final protected Gamepad gamepad2;

    InputMap(Gamepad gamepad1, Gamepad gamepad2) {
        this.gamepad1 = gamepad1;
        this.gamepad2 = gamepad2;
    }

    abstract public double readDriveX();
    abstract public double readDriveY();
    abstract public double readDriveRot();
    abstract public boolean readImuReset();

    abstract public double readLifterY();
}