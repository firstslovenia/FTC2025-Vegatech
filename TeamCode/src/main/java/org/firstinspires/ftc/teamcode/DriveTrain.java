package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.hardware.DcMotor;

public class DriveTrain {
    static void driveTheTrain() {

//        if (InputMapper.domenSquare) {
//            Hardware.leftFront.setPower(-100);
//            Hardware.leftBack.setPower(-100);
//            Hardware.rightFront.setPower(100);
//            Hardware.rightBack.setPower(100);
//        } else {

        float leftY = InputMapper.leftY;
        float leftX = InputMapper.leftX;
        float rightX = InputMapper.rightX;

        if (leftX == 0 && InputMapper.dpadRight) {
            leftX += 0.5F;
        }
        if (leftX == 0 && InputMapper.dpadLeft) {
            leftX -= 0.5F;
        }
        if (leftY == 0 && InputMapper.dpadDown) {
            leftY += 0.3F;
        }
        if (leftY == 0 && InputMapper.dpadUp) {
            leftY -= 0.3F;
        }

        BetterTelemetry.print("leftY", leftY);
        BetterTelemetry.print("leftX", leftX);
        BetterTelemetry.print("rightX", rightX);

        double powLeftFront = (leftY - leftX - rightX) / 1.5;
        double powLeftBack = (leftY + leftX - rightX) / 1.5;
        double powRightFront = (leftY + leftX + rightX) / 1.5;
        double powRightBack = (leftY - leftX + rightX) / 1.5;

        double powMax = Math.max(Math.max(Math.abs(powLeftFront), Math.abs(powLeftBack)), Math.max(Math.abs(powRightFront), Math.abs(powRightBack)));

        if (powMax > 1) {
            powLeftFront /= powMax;
            powLeftBack /= powMax;
            powRightFront /= powMax;
            powRightBack /= powMax;
        }

//        Hardware.leftFront.getCurrentPosition();
//        Hardware.leftFront.setTargetPosition(123);
//
//        Hardware.leftFront.setMode(DcMotor.RunMode.RUN_TO_POSITION);


        Hardware.leftFront.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        Hardware.leftBack.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        Hardware.rightFront.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        Hardware.rightBack.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        Hardware.leftFront.setPower(0 - powLeftFront);
        Hardware.leftBack.setPower(0 - powLeftBack);
        Hardware.rightFront.setPower(powRightFront);
        Hardware.rightBack.setPower(powRightBack);
//        }
        BetterTelemetry.print("left front", Hardware.leftFront.getCurrentPosition());
        BetterTelemetry.print("left back", Hardware.leftBack.getCurrentPosition());
        BetterTelemetry.print("right front", Hardware.rightFront.getCurrentPosition());
        BetterTelemetry.print("right back", Hardware.rightBack.getCurrentPosition());

    }

}