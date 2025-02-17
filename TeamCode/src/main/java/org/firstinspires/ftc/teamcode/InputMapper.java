package org.firstinspires.ftc.teamcode;

import lombok.Getter;

public class InputMapper {
    private static InputMap inputMap;

    @Getter
    static float leftX;
    @Getter
    static float leftY;
    @Getter
    private static double driveRot;
//    @Getter
//    private static boolean imuReset;

    @Getter
    static float rightX;
    @Getter
    private static float rightY;
    @Getter
    static float leftTrigger;
    @Getter
    static float rightTrigger;
    @Getter
    static boolean leftBumperPressed;
    @Getter
    static boolean rightBumperPressed;
    @Getter
    static boolean crossPressed;
    @Getter
    static boolean trianglePressed;
    @Getter
    static boolean dpadUp;
    @Getter
    static boolean dpadDown;
//    @Getter
//    static boolean dpadLeft;
//    @Getter
//    static boolean dpadRight;

    public static void init(InputMap inputMapToSet) {
        inputMap = inputMapToSet;
    }

    public static void update() {
        leftX = inputMap.readLeftX();
        leftY = inputMap.readLeftY();
        driveRot = inputMap.readRightX();
//        imuReset = inputMap.readImuReset();

        rightX = inputMap.readRightX();
        rightY = inputMap.readRightY();
        leftTrigger = inputMap.readLeftTrigger();
        rightTrigger = inputMap.readRightTrigger();
        leftBumperPressed = inputMap.readLeftBumper();
        rightBumperPressed = inputMap.readRightBumper();
        crossPressed = inputMap.readCross();
        trianglePressed = inputMap.readTriangle();
        dpadUp = inputMap.readDpadUp();
        dpadDown = inputMap.readDpadDown();
    }
}