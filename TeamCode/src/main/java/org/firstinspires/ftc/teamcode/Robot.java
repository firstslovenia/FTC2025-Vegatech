package org.firstinspires.ftc.teamcode;

import static org.firstinspires.ftc.teamcode.DriveTrain.driveTheTrain;
import static org.firstinspires.ftc.teamcode.Lifter.lift;
import static org.firstinspires.ftc.teamcode.Lifter.rokaTilt;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Robot", group = "Robot")
public class Robot extends LinearOpMode {

    public void runOpMode() {
        BetterTelemetry.init(telemetry);
        Hardware.init(hardwareMap);
        InputMapper.init(new PrimaryInputMap(gamepad1, gamepad2));
        waitForStart();
        while (opModeIsActive()) {
            InputMapper.update();
            driveTheTrain();
            rokaTilt();
            lift();
            telemetry.update();
//           differencialThing();
        }
    }

//    @Override
//    public void init() {
//        BetterTelemetry.init(telemetry);
//        Hardware.init(hardwareMap);
//    }
//
//    @Override
//    public void loop() {
//        driveTheTrain();
//    }
}
