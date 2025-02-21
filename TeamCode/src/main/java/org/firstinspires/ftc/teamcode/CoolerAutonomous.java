package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous
public class CoolerAutonomous extends OpMode {

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

        /// TURN 180 DEGREES (HOPEFULLY)
        Hardware.leftFront.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        Hardware.rightFront.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        Hardware.leftBack.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        Hardware.rightBack.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        double power = 0.5;

        Hardware.leftFront.setTargetPosition(-1300);
        Hardware.leftBack.setTargetPosition(1300);
        Hardware.rightFront.setTargetPosition(1300);
        Hardware.rightBack.setTargetPosition(-1300);

        Hardware.leftFront.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        Hardware.leftBack.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        Hardware.rightFront.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        Hardware.rightBack.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        Hardware.leftFront.setPower(-power);
        Hardware.leftBack.setPower(-power);
        Hardware.rightFront.setPower(power);
        Hardware.rightBack.setPower(power);

//        /// voznja naprej
//
//        Hardware.leftFront.setTargetPosition(3000);
//        Hardware.leftBack.setTargetPosition(3000);
//        Hardware.rightFront.setTargetPosition(3000);
//        Hardware.rightBack.setTargetPosition(3000);
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


    }

    @Override
    public void init() {
        BetterTelemetry.init(telemetry);
        Hardware.init(hardwareMap);
        rokaLeft = Hardware.rokaLeft;
        rokaRight = Hardware.rokaRight;
    }

    @Override
    public void loop() {
        // nothing
    }
}
