package org.firstinspires.ftc.teamcode;

import static org.firstinspires.ftc.teamcode.Claw.handleClaw;
import static org.firstinspires.ftc.teamcode.Differencial.handleDifferencial;
import static org.firstinspires.ftc.teamcode.DriveTrain.driveTheTrain;
import static org.firstinspires.ftc.teamcode.Lifter.liftTheLifter;
import static org.firstinspires.ftc.teamcode.Lifter.tiltTheArm;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "Robot", group = "Robot")
public class Robot extends OpMode {

    @Override
    public void init() {
        BetterTelemetry.init(telemetry);
        Hardware.init(hardwareMap);
        InputMapper.init(new PrimaryInputMap(gamepad1, gamepad2));

//        Hardware.rokaLeft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        Hardware.rokaRight.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        // TODO reset encoders of drivetrain motors

//        Hardware.leftFront.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        Hardware.leftBack.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        Hardware.rightFront.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
//        Hardware.rightBack.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    }

    @Override
    public void loop() {
        InputMapper.update();
        driveTheTrain();
        tiltTheArm();
        liftTheLifter();
        handleDifferencial();
        handleClaw();
        telemetry.update();
    }

    static int boolToInt(boolean b) {
        return b ? 1 : 0;
    }
}
