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


    static double powLeftFront;
    static double powLeftBack;
    static double powRightFront;
    static double powRightBack;


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

        powLeftFront = leftY - leftX - rightX;
        powLeftBack = leftY + leftX - rightX;
        powRightFront = leftY + leftX + rightX;
        powRightBack = leftY - leftX + rightX;

        leftFront.setPower(0 - powLeftFront);
        leftBack.setPower(0 - powLeftBack);
        rightFront.setPower(powRightFront);
        rightBack.setPower(powRightBack);
    }

}