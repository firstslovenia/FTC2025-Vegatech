package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;

public class Preset {
    public static void preset() {
        if (InputMapper.domenCross) {
            Hardware.lifterLeft.setTargetPosition(0);
            Hardware.lifterRight.setTargetPosition(0);

            Hardware.lifterLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            Hardware.lifterRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);

            Hardware.lifterLeft.setPower(1);
            Hardware.lifterRight.setPower(1);

            ///

            Hardware.rokaLeft.setTargetPosition(-1750);
            Hardware.rokaRight.setTargetPosition(1750);

            Hardware.rokaLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            Hardware.rokaRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);

            Hardware.rokaLeft.setPower(-1);
            Hardware.rokaLeft.setPower(1);

        }

        if (InputMapper.domenTriangle) {
            Hardware.rokaLeft.setTargetPosition(-8080);
            Hardware.rokaRight.setTargetPosition(8080);

            Hardware.rokaLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            Hardware.rokaRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);

            Hardware.rokaLeft.setPower(-1);
            Hardware.rokaLeft.setPower(1);
        }
    }
}
