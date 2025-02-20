package org.firstinspires.ftc.teamcode;


public class DriveTrain {
    static void driveTheTrain() {
        float leftY = InputMapper.leftY;
        float leftX = InputMapper.leftX;
        float rightX = InputMapper.rightX;

        if (leftX == 0 && InputMapper.domenDpadLeft) {
            leftX += 0.5F;
        }
        if (leftX == 0 && InputMapper.domenDpadRight) {
            leftX -= 0.5F;
        }
        if (leftY == 0 && InputMapper.domenDpadUp) {
            leftY += 0.5F;
        }
        if (leftY == 0 && InputMapper.domenDpadDown) {
            leftY -= 0.5F;
        }

        BetterTelemetry.print("leftY", leftY);
        BetterTelemetry.print("leftX", leftX);
        BetterTelemetry.print("rightX", rightX);

        double powLeftFront = leftY - leftX - rightX;
        double powLeftBack = leftY + leftX - rightX;
        double powRightFront = leftY + leftX + rightX;
        double powRightBack = leftY - leftX + rightX;

        double powMax = Math.max(Math.max(Math.abs(powLeftFront), Math.abs(powLeftBack)), Math.max(Math.abs(powRightFront), Math.abs(powRightBack)));

        if (powMax > 1) {
            powLeftFront /= powMax;
            powLeftBack /= powMax;
            powRightFront /= powMax;
            powRightBack /= powMax;
        }
        Hardware.leftFront.setPower(0 - powLeftFront);
        Hardware.leftBack.setPower(0 - powLeftBack);
        Hardware.rightFront.setPower(powRightFront);
        Hardware.rightBack.setPower(powRightBack);
    }

}