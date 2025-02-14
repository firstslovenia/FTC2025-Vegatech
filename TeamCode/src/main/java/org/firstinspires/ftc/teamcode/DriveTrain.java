package org.firstinspires.ftc.teamcode;

import static org.firstinspires.ftc.teamcode.Differencial.differencialThing;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

//@TeleOp(name = "DriveTrain")
public class DriveTrain {
    public static DcMotor leftFront = Hardware.leftFront;
    public static DcMotor leftBack = Hardware.leftBack;
    public static DcMotor rightFront = Hardware.rightFront;
    public static DcMotor rightBack = Hardware.rightBack;

//    @Override
//    public void loop() {
//        driveTheTrain();
//    }

    static void driveTheTrain() {
        float leftY = InputMapper.leftY;
        float leftX = InputMapper.leftX;
        float rightX = InputMapper.rightX;

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
        leftFront.setPower(0 - powLeftFront);
        leftBack.setPower(0 - powLeftBack);
        rightFront.setPower(powRightFront);
        rightBack.setPower(powRightBack);
    }

}