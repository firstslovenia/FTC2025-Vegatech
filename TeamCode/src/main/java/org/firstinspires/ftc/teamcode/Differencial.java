package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.CRServo;

public class Differencial {

    private static float powerDesnaStran;
    private static float powerLevaStran;
    private static final CRServo levoZgoraj = Hardware.levoZgoraj;
    private static final CRServo levoSpodaj = Hardware.levoSpodaj;
    private static final CRServo desnoZgoraj = Hardware.desnoZgoraj;
    private static final CRServo desnoSpodaj = Hardware.desnoSpodaj;

    public static void differencialThing() {
        float maxPowerDifferencial;
        powerLevaStran = InputMapper.leftY - InputMapper.leftX;
        powerDesnaStran = -InputMapper.leftY - InputMapper.leftX;
        maxPowerDifferencial = Math.max(powerLevaStran, powerDesnaStran);
        if (Math.abs(maxPowerDifferencial) > 1) {
            powerLevaStran /= maxPowerDifferencial;
            powerDesnaStran /= maxPowerDifferencial;
        }
        levaStran(powerLevaStran);
        desnaStran(powerDesnaStran);
        BetterTelemetry.print("L: ", powerLevaStran);
        BetterTelemetry.print("D: ", powerDesnaStran);
    }

    private static void levaStran(float power) {
        levoZgoraj.setPower(power);
        levoSpodaj.setPower(power);
    }

    private static void desnaStran(float power) {
        desnoZgoraj.setPower(power);
        desnoSpodaj.setPower(power);
    }

}
