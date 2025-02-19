package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;

public class Lifter {

    private static double rokaWantedLocation;
    private static final int rokaMaxPosition = 250;
//    private static boolean rokaPressed = false;
    private static final double liftMaxPosition = 3200;
    private static double lifterWantedLocation;


    public static void rokaTilt() {
//        double currentLocation = (double) (-Hardware.rokaLeft.getCurrentPosition() + Hardware.rokaRight.getCurrentPosition()) / 2;
        BetterTelemetry.print("rokaLeft", Hardware.rokaLeft.getCurrentPosition());
        BetterTelemetry.print("rokaRight", Hardware.rokaRight.getCurrentPosition());
//        BetterTelemetry.print("currentLocation", currentLocation);

        if (InputMapper.crossPressed || (InputMapper.domenRightBooleanBumper && InputMapper.domenDpadUp)) {
            Hardware.rokaLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            Hardware.rokaRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            rokaWantedLocation = 0;
        } else {
            float wantedLocationDifference = (-boolToInt(InputMapper.leftBumperPressed) + boolToInt(InputMapper.rightBumperPressed)) * 20;
            if (wantedLocationDifference == 0) {
                wantedLocationDifference = InputMapper.domenLeftX;
            }
            rokaWantedLocation += wantedLocationDifference;
            rokaWantedLocation = Math.max(0, Math.min(rokaMaxPosition, rokaWantedLocation));
        }
        BetterTelemetry.print("rokaWantedLocation", rokaWantedLocation);
        Hardware.rokaLeft.setTargetPosition((int) Math.round(lifterWantedLocation));
        Hardware.rokaRight.setTargetPosition((int) Math.round(rokaWantedLocation));

        Hardware.rokaLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        Hardware.rokaRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        Hardware.rokaLeft.setPower(1);
        Hardware.rokaRight.setPower(-1);
    }

    private static int boolToInt(boolean b) {
        return b ? 1 : 0;
    }

    public static void lift() {
//        double currentLocation = (double) (Hardware.lifterLeft.getCurrentPosition() + Hardware.lifterRight.getCurrentPosition()) / 2;
//        BetterTelemetry.print("curentLocationBefore", currentLocation);
        float wantedLocationDifference = (-InputMapper.leftTrigger + InputMapper.rightTrigger);
        if (wantedLocationDifference == 0) {
            wantedLocationDifference = InputMapper.domenLeftY;
        }
        lifterWantedLocation += wantedLocationDifference;
        lifterWantedLocation = Math.max(0, Math.min(lifterWantedLocation, liftMaxPosition));


        Hardware.lifterLeft.setTargetPosition((int) Math.round(lifterWantedLocation));
        Hardware.lifterRight.setTargetPosition((int) Math.round(lifterWantedLocation));

        BetterTelemetry.print("left position", Hardware.lifterLeft.getCurrentPosition());

        Hardware.lifterLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        Hardware.lifterRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);


        BetterTelemetry.print("lifterLeft", Hardware.lifterLeft.getCurrentPosition());
        BetterTelemetry.print("lifterRight", Hardware.lifterRight.getCurrentPosition());
//        BetterTelemetry.print("currentLocation", currentLocation);
        BetterTelemetry.print("wantedlocation", lifterWantedLocation);
        Hardware.lifterLeft.setPower(1);
        Hardware.lifterRight.setPower(1);

        // TODO premade positions

        if (InputMapper.dpadDown || (InputMapper.domenRightBooleanBumper && InputMapper.domenDpadDown)) {
            Hardware.lifterLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            Hardware.lifterRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
            lifterWantedLocation = 0;
        }
    }
}
