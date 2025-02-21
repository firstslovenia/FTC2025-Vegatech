package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@com.qualcomm.robotcore.eventloop.opmode.Autonomous
public class Autonomous extends OpMode {
    private DcMotor rokaLeft;
    private DcMotor rokaRight;

    @Override
    public void start() {

        /// ROKA POSITION
        rokaLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        rokaRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        BetterTelemetry.print("roka left", rokaLeft.getCurrentPosition());
        BetterTelemetry.print("rokaright", rokaRight.getCurrentPosition());

        rokaLeft.setTargetPosition(-870); // works
        rokaRight.setTargetPosition(870);

        rokaLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        rokaRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        rokaLeft.setPower(-1);
        rokaRight.setPower(1);

//        Lifter.rokaMinPosition

//
//        /// TURN 180 DEGREES (HOPEFULLY)
//        Hardware.leftFront.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        Hardware.rightFront.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        Hardware.leftBack.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        Hardware.rightBack.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//
//        double power = 0.5;
//
//        Hardware.leftFront.setTargetPosition(30);
//        Hardware.leftBack.setTargetPosition(30);
//        Hardware.rightFront.setTargetPosition(30);
//        Hardware.rightBack.setTargetPosition(30);
//
//        Hardware.leftFront.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        Hardware.leftBack.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        Hardware.rightFront.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//        Hardware.rightBack.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//
//        Hardware.leftFront.setPower(-power);
//        Hardware.leftBack.setPower(-power);
//        Hardware.rightFront.setPower(power);
//        Hardware.rightBack.setPower(power);
//
//
//        /// LIFT LIFTER (HOPEFULLY)
//        int liftMaxPosition = 2860;
//
//        Hardware.lifterLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        Hardware.lifterRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//
//        Hardware.lifterLeft.setTargetPosition(liftMaxPosition);
//        Hardware.lifterRight.setTargetPosition(liftMaxPosition);
//
//        Hardware.lifterLeft.setPower(1);
//        Hardware.lifterRight.setPower(1);
//
//        /// TURN DIFFERENCIAL (HOPEFULLY)
////        for(int i = 0; i )
////        Hardware.leva.setPower(1);
////        Hardware.desna.setPower(1); TODO, use setPosition
//
//        /// DROP SAMPLE (ok to ni tok tezko)
//
//        Hardware.claw.setPosition(1); // alpa 0 nevem kateri je kateri
    }

    @Override
    public void init() {
        BetterTelemetry.init(telemetry);
        Hardware.init(hardwareMap);
        rokaLeft = Hardware.rokaLeft;
        rokaRight = Hardware.rokaRight;

//        rokaLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        rokaRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    }

    @Override
    public void loop() {
        BetterTelemetry.print("roka left", rokaLeft.getCurrentPosition());
        BetterTelemetry.print("rokaright", rokaRight.getCurrentPosition());
//        rokaLeft.setPower(1);
//        rokaLeft.setPower(-1);
    }
}
