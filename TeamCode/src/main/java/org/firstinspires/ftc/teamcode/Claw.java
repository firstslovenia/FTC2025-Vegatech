package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.CRServo;

public class Claw {

    private static final CRServo claw = Hardware.claw;

    public static void clawThing() {
        if (!InputMapper.domenLeftBooleanBumper) {
            if (InputMapper.domenDpadUp) {
                claw.setPower(-1);
            } else if (InputMapper.domenDpadDown) {
                claw.setPower(1);
            }
        }

    }
}
