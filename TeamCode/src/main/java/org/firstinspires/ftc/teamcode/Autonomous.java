package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@com.qualcomm.robotcore.eventloop.opmode.Autonomous
public class Autonomous extends OpMode {
    private DcMotor rokaLeft;
    private DcMotor rokaRight;

    @Override
    public void start() {

        rokaLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        rokaRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        BetterTelemetry.print("roka left", rokaLeft.getCurrentPosition());
        BetterTelemetry.print("rokaright", rokaRight.getCurrentPosition());

//        rokaLeft.setTargetPosition(72); // TODO
//        rokaRight.setTargetPosition(-72);

        rokaLeft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        rokaRight.setMode(DcMotor.RunMode.RUN_TO_POSITION);

//        rokaLeft.setPower(1);
//        rokaRight.setPower(-1);

    }

    @Override
    public void init() {
        BetterTelemetry.init(telemetry);
        Hardware.init(hardwareMap);
        rokaLeft = Hardware.rokaLeft;
        rokaRight = Hardware.rokaRight;

//        rokaLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        rokaRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

//        InputMapper.init(new PrimaryInputMap(gamepad1, gamepad2));
    }

    @Override
    public void loop() {
        BetterTelemetry.print("roka left", rokaLeft.getCurrentPosition());
        BetterTelemetry.print("rokaright", rokaRight.getCurrentPosition());
//        rokaLeft.setPower(1);
//        rokaLeft.setPower(-1);
    }
}
