package org.firstinspires.ftc.teamcode;

import static org.firstinspires.ftc.teamcode.DriveTrain.driveTheTrain;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Robot", group = "Robot")
public class Robot extends LinearOpMode {
    @Override
    public void runOpMode() {
        BetterTelemetry.init(telemetry);
        Hardware.init(hardwareMap);
        waitForStart();
        while (opModeIsActive()) {
            driveTheTrain();
//            differencialThing();
        }
    }
}
