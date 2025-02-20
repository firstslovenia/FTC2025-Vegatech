package org.firstinspires.ftc.teamcode;

//import static org.firstinspires.ftc.teamcode.drive.DriveConstants.LOGO_FACING_DIR;
//import static org.firstinspires.ftc.teamcode.drive.DriveConstants.USB_FACING_DIR;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import lombok.Getter;

public class Hardware {
    @Getter
    static CRServo leva;
    @Getter
    static CRServo desna;
    @Getter
    static DcMotor leftFront;
    @Getter
    static DcMotor leftBack;
    @Getter
    static DcMotor rightFront;
    @Getter
    static DcMotor rightBack;
    @Getter
    static DcMotor rokaLeft;
    @Getter
    static DcMotor rokaRight;
    @Getter
    static DcMotor lifterLeft;
    @Getter
    static DcMotor lifterRight;
    @Getter
    static Servo claw;

    public static void init(HardwareMap hardwareMap) {
        // Drive Motors
        leva = hardwareMap.get(CRServo.class, "differencial-Left");
        desna = hardwareMap.get(CRServo.class, "differencial-Right");
//        levoZgoraj = hardwareMap.get(CRServo.class, "levoZgoraj");
//        levoSpodaj = hardwareMap.get(CRServo.class, "levoSpodaj");
//        desnoZgoraj = hardwareMap.get(CRServo.class, "desnoZgoraj");
//        desnoSpodaj = hardwareMap.get(CRServo.class, "desnoSpodaj");

        leftFront = hardwareMap.get(DcMotor.class, "drivetranLeftFront");
        leftBack = hardwareMap.get(DcMotor.class, "drivetranLeftBack");
        rightFront = hardwareMap.get(DcMotor.class, "drivetranRightFront");
        rightBack = hardwareMap.get(DcMotor.class, "drivetranRightBack");
        rokaLeft = hardwareMap.get(DcMotor.class, "lifterTilt-Left");
        rokaRight = hardwareMap.get(DcMotor.class, "lifterTilt-Right");
        lifterLeft = hardwareMap.get(DcMotor.class, "lifterUpDown-Left");
        lifterRight = hardwareMap.get(DcMotor.class, "lifterUpDown-Right");
        claw = hardwareMap.get(Servo.class, "claw");

    }
}