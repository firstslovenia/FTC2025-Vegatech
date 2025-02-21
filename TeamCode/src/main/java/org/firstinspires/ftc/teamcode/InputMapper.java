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
    @Getter
    static boolean dpadLeft;
    @Getter
    static boolean dpadRight;
    @Getter
    static boolean domenLeftBooleanBumper;
    @Getter
    static boolean domenRightBooleanBumper;
    @Getter
    static boolean domenCircle;
    @Getter
    static boolean domenCross;
    @Getter
    static boolean domenSquare;
    @Getter
    static boolean domenTriangle;
    @Getter
    static boolean domenDpadUp;
    @Getter
    static boolean domenDpadDown;
    @Getter
    static boolean domenDpadLeft;
    @Getter
    static boolean domenDpadRight;
    @Getter
    static float domenLeftX;
    @Getter
    static float domenLeftY;
    @Getter
    static float domenRightX;
    @Getter
    static float domenRightY;
    @Getter
    static float domenLeftFloat;
    @Getter
    static float domenRightFloat;


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

        // domen
        domenLeftBooleanBumper = inputMap.readDomenLeftBooleanBumper();
        domenRightBooleanBumper = inputMap.readDomenRightBooleanBumper();
        domenCircle = inputMap.readDomenCircle();
        domenCross = inputMap.readDomenCross();
        domenSquare = inputMap.readDomenSquare();
        domenTriangle = inputMap.readDomenTriangle();
        domenDpadUp = inputMap.readDomenDpadUp();
        domenDpadDown = inputMap.readDomenDpadDown();
        domenDpadLeft = inputMap.readDomenDpadLeft();
        domenDpadRight = inputMap.readDomenDpadRight();
        domenLeftX = inputMap.readDomenLeftX();
        domenLeftY = inputMap.readDomenLeftY();
        domenRightX = inputMap.readDomenRightX();
        domenRightY = inputMap.readDomenRightY();
        domenLeftFloat = inputMap.readDomenLeftFloat();
        domenRightFloat = inputMap.readDomenRightFloat();
        dpadLeft = inputMap.readDpadLeft();
        dpadRight = inputMap.readDpadRight();
    }
}