package org.firstinspires.ftc.teamcode;

public class Lifter {

    private static double rokaWantedLocation;
    private static final int rokaMaxPosition = 250;
    private static double rokaZero = 0;
    private static boolean rokaPressed = false;


    public static void rokaTilt() {
//        float powerToSet = InputMapper.leftTrigger - InputMapper.rightTrigger;
        double currentLocation = -((-Hardware.rokaLeft.getCurrentPosition() + Hardware.rokaRight.getCurrentPosition()) * 0.625) - rokaZero;
        BetterTelemetry.print("rokaLeft", Hardware.rokaLeft.getCurrentPosition());
        BetterTelemetry.print("rokaRight", Hardware.rokaRight.getCurrentPosition());
        BetterTelemetry.print("currentLocation", currentLocation);
        double powerToSet = 0;

        if (InputMapper.leftBumperPressed) {
            rokaZero += currentLocation;
            rokaWantedLocation = 0;
        } else if (InputMapper.rightBumperPressed && !rokaPressed) {
            rokaZero -= 10;
            rokaWantedLocation += 10;
            rokaPressed = true;
        } else {
            rokaWantedLocation += (InputMapper.leftTrigger - InputMapper.rightTrigger);
            rokaWantedLocation = Math.max(0, Math.min(rokaMaxPosition, rokaWantedLocation));
            powerToSet = Math.pow((rokaWantedLocation - currentLocation) / 10, 3);
        }

        if (!InputMapper.rightBumperPressed) {
            rokaPressed = false;
        }
        //        double powerToSet = ;
        BetterTelemetry.print("rokaWantedLocation", rokaWantedLocation);
        BetterTelemetry.print("powertoset", powerToSet);
//        float powerToSet =
        Hardware.rokaLeft.setPower(powerToSet);
        Hardware.rokaRight.setPower(-powerToSet);
    }

    private static int boolToInt(boolean b) {
        return b ? 1 : 0;
    }

    public static void lift() {
        float powerToSet = -boolToInt(InputMapper.crossPressed) + boolToInt(InputMapper.trianglePressed);
        double currentLocation = -((Hardware.lifterLeft.getCurrentPosition() + Hardware.lifterRight.getCurrentPosition()) * 0.200892857);

        //lifterWantedLocation += -boolToInt(InputMapper.crossPressed) + boolToInt(InputMapper.trianglePressed);
        //lifterWantedLocation = Math.max(0, Math.min(lifterMaxPosition, lifterWantedLocation));

        //double powerToSet = Math.pow((rokaWantedLocation - currentLocation) / 10, 3);
        BetterTelemetry.print("lifterLeft",Hardware.lifterLeft.getCurrentPosition());
        BetterTelemetry.print("lifterRight",Hardware.lifterRight.getCurrentPosition());
        BetterTelemetry.print("currentLocation", currentLocation);
        Hardware.lifterLeft.setPower(powerToSet);
        Hardware.lifterRight.setPower(powerToSet);
    }

}
