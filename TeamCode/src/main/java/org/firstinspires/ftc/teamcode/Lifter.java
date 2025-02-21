package org.firstinspires.ftc.teamcode;

import static org.firstinspires.ftc.teamcode.Robot.boolToInt;

import com.qualcomm.robotcore.hardware.DcMotor;

public class Lifter {

    private static double rokaWantedLocation;
    private static final int rokaMaxPosition = 1000;
    //    private static boolean rokaPressed = false;
    private static final double liftMaxPosition = 2860;
    static final double rokaMinPosition = 0; // TODO
    private static double lifterWantedLocation;

//    public static void setRokaAngleTo(double rokaWantedLocation) {
//        double currentLocation = -((-Hardware.rokaLeft.getCurrentPosition() + Hardware.rokaRight.getCurrentPosition()) * 0.625);
//        BetterTelemetry.print("rokaLeft", Hardware.rokaLeft.getCurrentPosition());
//        BetterTelemetry.print("rokaRight", Hardware.rokaRight.getCurrentPosition());
//        BetterTelemetry.print("currentLocation", currentLocation);
//
//        rokaWantedLocation = Math.max(0, Math.min(200, rokaWantedLocation));
//        double powerToSet = Math.pow((rokaWantedLocation - currentLocation) / 10, 3);
//
//        //        double powerToSet = ;
//        BetterTelemetry.print("rokaWantedLocation", rokaWantedLocation);
//        BetterTelemetry.print("powertoset", powerToSet);
////        float powerToSet =
//        Hardware.rokaLeft.setPower(powerToSet);
//        Hardware.rokaRight.setPower(-powerToSet);
//    }

    public static void tiltTheArm() {
//        double currentLocation = -((-Hardware.rokaLeft.getCurrentPosition() + Hardware.rokaRight.getCurrentPosition()) * 0.625);
//        BetterTelemetry.print("rokaLeft", Hardware.rokaLeft.getCurrentPosition());
//        BetterTelemetry.print("rokaRight", Hardware.rokaRight.getCurrentPosition());
//        BetterTelemetry.print("currentLocation", currentLocation);
////        double powerToSet = 0;
//
////        if (InputMapper.leftBumperPressed) {
//////            rokaZero += currentLocation; vt
////            rokaWantedLocation = 0;
////        } else if (InputMapper.rightBumperPressed && !rokaPressed) {
//////            rokaZero -= 10;
////            rokaWantedLocation += 10;
////            rokaPressed = true;
////        } else {
//            rokaWantedLocation += InputMapper.leftX; // (InputMapper.leftTrigger - InputMapper.rightTrigger);
//            rokaWantedLocation = Math.max(rokaMinPosition, Math.min(rokaMaxPosition, rokaWantedLocation));
//            double powerToSet = Math.pow((rokaWantedLocation - currentLocation) / 10, 3);
////        }
//
////        if (!InputMapper.rightBumperPressed) {
////            rokaPressed = false;
////        }
//        //        double powerToSet = ;
//        BetterTelemetry.print("rokaWantedLocation", rokaWantedLocation);
//        BetterTelemetry.print("powertoset", powerToSet);
////        float powerToSet =
//        Hardware.rokaLeft.setPower(powerToSet);
//        Hardware.rokaRight.setPower(-powerToSet);
//        double currentLocation = (double) (-Hardware.rokaLeft.getCurrentPosition() + Hardware.rokaRight.getCurrentPosition()) / 2;
        BetterTelemetry.print("rokaLeft", Hardware.rokaLeft.getCurrentPosition());
        BetterTelemetry.print("rokaRight", Hardware.rokaRight.getCurrentPosition());
        BetterTelemetry.print("wanted location before", rokaWantedLocation);
//        BetterTelemetry.print("currentLocation", currentLocation);

//        if (InputMapper.crossPressed || (InputMapper.domenRightBooleanBumper && InputMapper.domenDpadUp)) {
//            Hardware.rokaLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//            Hardware.rokaRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//            rokaWantedLocation = 0;
//        } else {


        // RUN TO POSITION
//        rokaWantedLocation += ((-boolToInt(InputMapper.leftBumperPressed) + boolToInt(InputMapper.rightBumperPressed)) * 20) + (-InputMapper.domenLeftX * 30); // + InputMapper.domenRightX;
//        if (!InputMapper.domenRightBooleanBumper)
//            rokaWantedLocation = Math.max(0, Math.min(rokaMaxPosition, rokaWantedLocation));
//        BetterTelemetry.print("rokaWantedLocation", rokaWantedLocation);
//        BetterTelemetry.print("domen left x negated", -InputMapper.domenLeftX);
//        BetterTelemetry.print("left bumper pressed", boolToInt(InputMapper.leftBumperPressed));
//        BetterTelemetry.print("right bumper pressed", boolToInt(InputMapper.rightBumperPressed));
//        Hardware.rokaLeft.setTargetPosition(-((int) Math.round(rokaWantedLocation)));
//        Hardware.rokaRight.setTargetPosition((int) Math.round(rokaWantedLocation));
//
//        Hardware.rokaLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        Hardware.rokaRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//
//        Hardware.rokaLeft.setPower(-1);
//        Hardware.rokaRight.setPower(1);

        double position = (double) (-Hardware.rokaLeft.getCurrentPosition() + Hardware.rokaRight.getCurrentPosition()) / 2;

        float powerToSet = -boolToInt(InputMapper.domenDpadUp && position > 0) + boolToInt(InputMapper.domenDpadDown); // - InputMapper.domenLeftX; // + InputMapper.domenRightX;

//        powerToSet = Math.max(0, Math.min(powerToSet, rokaMaxPosition));

        BetterTelemetry.print("power to set", powerToSet);

        Hardware.rokaLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        Hardware.rokaLeft.setPower(-powerToSet);
        Hardware.rokaRight.setPower(powerToSet);

    }

    public static void liftTheLifter() {
//        double currentLocation = (double) (Hardware.lifterLeft.getCurrentPosition() + Hardware.lifterRight.getCurrentPosition()) / 2;
//        BetterTelemetry.print("curentLocationBefore", currentLocation);
        lifterWantedLocation += ((-InputMapper.leftTrigger + InputMapper.rightTrigger) * 30) + (-InputMapper.domenLeftY * 30);
        if (!InputMapper.domenRightBooleanBumper)
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

//        if (InputMapper.dpadDown || (InputMapper.domenRightBooleanBumper && InputMapper.domenDpadDown)) {
//            Hardware.lifterLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//            Hardware.lifterRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//            lifterWantedLocation = 0;
//        }
    }
}
