package org.firstinspires.ftc.teamcode;

import static org.firstinspires.ftc.teamcode.Differencial.differencialThing;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "DriveTrain")
public class DriveTrain extends LinearOpMode {
    public DcMotor leftFront;
    public DcMotor leftBack;
    public DcMotor rightFront;
    public DcMotor rightBack;


    double powLeftFront;
    double powLeftBack;
    double powRightFront;
    double powRightBack;

    @Override
    public void runOpMode() {
        BetterTelemetry.init(telemetry);
        Hardware.init(hardwareMap);
        leftFront = hardwareMap.get(DcMotor.class, "DrivetranLeftFront");
        leftBack = hardwareMap.get(DcMotor.class, "DrivetranLeftBack");
        rightFront = hardwareMap.get(DcMotor.class, "DrivetranRightFront");
        rightBack = hardwareMap.get(DcMotor.class, "DrivetranRightBack");
        waitForStart();
        while (opModeIsActive()) {
            driveTheTrain();
            differencialThing();
        }
    }

//    @Override
//    public void loop() {
//        driveTheTrain();
//    }

    private void driveTheTrain() {
        powLeftFront = gamepad1.left_stick_y - gamepad1.left_stick_x - gamepad1.right_stick_x;
        powLeftBack = gamepad1.left_stick_y + gamepad1.left_stick_x - gamepad1.right_stick_x;
        powRightFront = gamepad1.left_stick_y + gamepad1.left_stick_x + gamepad1.right_stick_x;
        powRightBack = gamepad1.left_stick_y - gamepad1.left_stick_x + gamepad1.right_stick_x;

        leftFront.setPower(0 - powLeftFront);
        leftBack.setPower(0 - powLeftBack);
        rightFront.setPower(powRightFront);
        rightBack.setPower(powRightBack);
    }

}