package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;

public class Lifter {

    private static double rokaWantedLocation;
    private static final int rokaMaxPosition = 250;
    private static double rokaZero = 0;
    private static boolean rokaPressed = false;
    private static double liftMaxPosition = 3000;
    private static double liftMinPosition = 0;
    private static double lifterWantedLocation;


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
        double currentLocation = (double) (Hardware.lifterLeft.getCurrentPosition() + Hardware.lifterRight.getCurrentPosition()) / 2;
        BetterTelemetry.print("curentLocationBefore", currentLocation);
        currentLocation = Math.max(liftMinPosition, Math.min(currentLocation, liftMaxPosition));
        lifterWantedLocation = Math.max(liftMinPosition, Math.min((lifterWantedLocation + (-boolToInt(InputMapper.crossPressed) + boolToInt(InputMapper.trianglePressed)) * 3), liftMaxPosition));
        double powerToSet = Math.pow((lifterWantedLocation - currentLocation) / 10, 3);
        ; // Math.pow((wantedLocation - currentLocation) / 20, 3);



        Hardware.lifterLeft.setTargetPosition((int) Math.round(lifterWantedLocation));
        Hardware.lifterRight.setTargetPosition((int) Math.round(lifterWantedLocation));

        BetterTelemetry.print("left position", Hardware.lifterLeft.getCurrentPosition());

        Hardware.lifterLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        Hardware.lifterRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);


        //lifterWantedLocation += -boolToInt(InputMapper.crossPressed) + boolToInt(InputMapper.trianglePressed);
        //lifterWantedLocation = Math.max(0, Math.min(lifterMaxPosition, lifterWantedLocation));

        //double powerToSet = Math.pow((rokaWantedLocation - currentLocation) / 10, 3);
        BetterTelemetry.print("lifterLeft", Hardware.lifterLeft.getCurrentPosition());
        BetterTelemetry.print("lifterRight", Hardware.lifterRight.getCurrentPosition());
        BetterTelemetry.print("currentLocation", currentLocation);
        BetterTelemetry.print("wantedlocation", lifterWantedLocation);
        BetterTelemetry.print("powerTOset", powerToSet);
        Hardware.lifterLeft.setPower(0.1);
        Hardware.lifterRight.setPower(0.1);
        //Hardware.lifterLeft.setPower(powerToSet);
        //Hardware.lifterRight.setPower(powerToSet);

//        Hardware.lifterLeft.setTargetPosition(20);
//        Hardware.lifterRight.setTargetPosition(20);


        if (InputMapper.dpadUp) {
            liftMaxPosition = currentLocation;
        }

        if (InputMapper.dpadDown) {
            liftMinPosition = currentLocation;
        }
    }
}
