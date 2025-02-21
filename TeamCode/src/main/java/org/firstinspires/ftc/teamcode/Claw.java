package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.Servo;

public class Claw {

    private static double clawWantedPosition = 0;
//    private static final double clawMaxPosition = 1;

    public static void handleClaw() {
        clawWantedPosition += (-InputMapper.domenLeftFloat + InputMapper.domenRightFloat) / 2; // TODO check if 2 is right
        if (!InputMapper.domenRightBooleanBumper)
            clawWantedPosition = Math.max(0, Math.min(clawWantedPosition, 1));
        BetterTelemetry.print("claw wanted position", clawWantedPosition);
        BetterTelemetry.print("curent position", Hardware.claw.getPosition());
        Hardware.claw.setPosition(clawWantedPosition);

    }
}
