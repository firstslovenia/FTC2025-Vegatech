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
    @Getter
    private static boolean imuReset;

    @Getter
    static float rightX;
    @Getter
    private static float rightY;

    public static void init(InputMap inputMapToSet) {
        inputMap = inputMapToSet;
    }

    public static void update() {
        leftX = inputMap.readLeftX();
        leftY = inputMap.readLeftY();
        driveRot = inputMap.readRightX();
        imuReset = inputMap.readImuReset();

        rightX = inputMap.readRightX();
        rightY = inputMap.readRightY();
    }
}