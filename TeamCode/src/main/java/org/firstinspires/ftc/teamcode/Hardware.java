package org.firstinspires.ftc.teamcode;

//import static org.firstinspires.ftc.teamcode.drive.DriveConstants.LOGO_FACING_DIR;
//import static org.firstinspires.ftc.teamcode.drive.DriveConstants.USB_FACING_DIR;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.HardwareMap;

import lombok.Getter;

public class Hardware {
    @Getter
    static CRServo levoZgoraj;
    @Getter
    static CRServo levoSpodaj;
    @Getter
    static CRServo desnoZgoraj;
    @Getter
    static CRServo desnoSpodaj;

    public static void init(HardwareMap hardwareMap) {
        // Drive Motors
        levoZgoraj = hardwareMap.get(CRServo.class, "levoZgoraj");
        levoSpodaj = hardwareMap.get(CRServo.class, "levoSpodaj");
        desnoZgoraj = hardwareMap.get(CRServo.class, "desnoZgoraj");
        desnoSpodaj = hardwareMap.get(CRServo.class, "desnoSpodaj");

    }
}