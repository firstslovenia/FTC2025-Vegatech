package org.firstinspires.ftc.teamcode;

import static org.firstinspires.ftc.teamcode.Claw.clawThing;
import static org.firstinspires.ftc.teamcode.Differencial.differencialThing;
import static org.firstinspires.ftc.teamcode.DriveTrain.driveTheTrain;
import static org.firstinspires.ftc.teamcode.Lifter.lift;
import static org.firstinspires.ftc.teamcode.Lifter.rokaTilt;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Robot", group = "Robot")
public class Robot extends OpMode {

    @Override
    public void init() {
        BetterTelemetry.init(telemetry);
        Hardware.init(hardwareMap);
        InputMapper.init(new PrimaryInputMap(gamepad1, gamepad2));
    }

    @Override
    public void loop() {
        InputMapper.update();
        driveTheTrain();
        rokaTilt();
        lift();
        differencialThing();
        clawThing();
        telemetry.update();
    }
}
