package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.Servo;

public class Claw {

    private static double clawWantedPosition;
//    private static final double clawMaxPosition = 1;

    public static void handleClaw() {
        clawWantedPosition += (-InputMapper.domenLeftFloat + InputMapper.domenRightFloat) / 360;
        if (!InputMapper.domenRightBooleanBumper)
            clawWantedPosition = Math.max(0, Math.min(clawWantedPosition, 1));
//        BetterTelemetry.print("claw wantd position", clawWantedPosition);
//        BetterTelemetry.print("curent position", claw.getPosition());
        Hardware.claw.setPosition(clawWantedPosition);

    }
}
