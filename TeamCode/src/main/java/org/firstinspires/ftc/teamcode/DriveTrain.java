package org.firstinspires.ftc.teamcode;

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
    private CRServo levoZgoraj;
    private CRServo levoSpodaj;
    private CRServo desnoZgoraj;
    private CRServo desnoSpodaj;

    double powLeftFront;
    double powLeftBack;
    double powRightFront;
    double powRightBack;
    private float powerDesnaStran;
    private float powerLevaStran;

    @Override
    public void runOpMode() {
        levoZgoraj = hardwareMap.get(CRServo.class, "levoZgoraj");
        levoSpodaj = hardwareMap.get(CRServo.class, "levoSpodaj");
        desnoZgoraj = hardwareMap.get(CRServo.class, "desnoZgoraj");
        desnoSpodaj = hardwareMap.get(CRServo.class, "desnoSpodaj");
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

    public void differencialThing() {
        float maxPowerDifferencial;
        powerLevaStran = gamepad1.left_stick_y - gamepad1.left_stick_x;
        powerDesnaStran = -gamepad1.left_stick_y - gamepad1.left_stick_x;
        maxPowerDifferencial = Math.max(powerLevaStran, powerDesnaStran);
        if (Math.abs(maxPowerDifferencial) > 1) {
            powerLevaStran /= maxPowerDifferencial;
            powerDesnaStran /= maxPowerDifferencial;
        }
        levaStran(powerLevaStran);
        desnaStran(powerDesnaStran);
        telemetry.addData("L: ", powerLevaStran);
        telemetry.addData("D: ", powerDesnaStran);
        telemetry.update();
    }

    private void levaStran(float power) {
        levoZgoraj.setPower(power);
        levoSpodaj.setPower(power);
    }

    private void desnaStran(float power) {
        desnoZgoraj.setPower(power);
        desnoSpodaj.setPower(power);

    }
}