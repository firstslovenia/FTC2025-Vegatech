package org.firstinspires.ftc.teamcode;

//import static org.firstinspires.ftc.teamcode.drive.DriveConstants.LOGO_FACING_DIR;
//import static org.firstinspires.ftc.teamcode.drive.DriveConstants.USB_FACING_DIR;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
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
    @Getter
    static DcMotor leftFront;
    @Getter
    static DcMotor leftBack;
    @Getter
    static DcMotor rightFront;
    @Getter
    static DcMotor rightBack;

    public static void init(HardwareMap hardwareMap) {
        // Drive Motors
        levoZgoraj = hardwareMap.get(CRServo.class, "levoZgoraj");
        levoSpodaj = hardwareMap.get(CRServo.class, "levoSpodaj");
        desnoZgoraj = hardwareMap.get(CRServo.class, "desnoZgoraj");
        desnoSpodaj = hardwareMap.get(CRServo.class, "desnoSpodaj");

        leftFront = hardwareMap.get(DcMotor.class, "DrivetranLeftFront");
        leftBack = hardwareMap.get(DcMotor.class, "DrivetranLeftBack");
        rightFront = hardwareMap.get(DcMotor.class, "DrivetranRightFront");
        rightBack = hardwareMap.get(DcMotor.class, "DrivetranRightBack");
    }
}