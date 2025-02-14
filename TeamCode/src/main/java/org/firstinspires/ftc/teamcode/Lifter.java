package org.firstinspires.ftc.teamcode;

public class Lifter {

    private static double wantedLocation;
    private static final int maxPosition = 250;
    private static double zero = 0;

    public static void lift() {
//        float powerToSet = InputMapper.leftTrigger - InputMapper.rightTrigger;
        double currentLocation = -((-Hardware.rokaLeft.getCurrentPosition() + Hardware.rokaRight.getCurrentPosition()) * 0.625) - zero;
        BetterTelemetry.print("rokaLeft", Hardware.rokaLeft.getCurrentPosition());
        BetterTelemetry.print("rokaRight", Hardware.rokaRight.getCurrentPosition());
        BetterTelemetry.print("currentLocation", currentLocation);
        double powerToSet = 0;

        if (InputMapper.leftBumperPressed) {
            zero += currentLocation;
            wantedLocation = 0;
        } else {
            wantedLocation += (InputMapper.leftTrigger - InputMapper.rightTrigger);
            wantedLocation = Math.max(0, Math.min(maxPosition, wantedLocation));
            powerToSet = Math.pow((wantedLocation - currentLocation) / 10, 3);
        }
        //        double powerToSet = ;
        BetterTelemetry.print("wantedLocation", wantedLocation);
        BetterTelemetry.print("powertoset", powerToSet);
//        float powerToSet =
        Hardware.rokaLeft.setPower(powerToSet);
        Hardware.rokaRight.setPower(-powerToSet);


    }
}
