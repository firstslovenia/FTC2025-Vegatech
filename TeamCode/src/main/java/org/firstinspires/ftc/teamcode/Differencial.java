package org.firstinspires.ftc.teamcode;


public class Differencial {

    public static void handleDifferencial() {
        float powerLevaStran = InputMapper.domenLeftY - InputMapper.domenLeftX;
        float powerDesnaStran = -InputMapper.domenLeftY - InputMapper.domenLeftX;
        float maxPowerDifferencial = Math.max(powerLevaStran, powerDesnaStran);

        if (Math.abs(maxPowerDifferencial) > 1) {
            powerLevaStran /= maxPowerDifferencial;
            powerDesnaStran /= maxPowerDifferencial;
        }

        Hardware.leva.setPower(powerLevaStran);
        Hardware.desna.setPower(powerDesnaStran);

        BetterTelemetry.print("L: ", powerLevaStran);
        BetterTelemetry.print("D: ", powerDesnaStran);
    }
}
