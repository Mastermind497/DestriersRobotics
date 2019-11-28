
/*
 * The Auton code for the Destriers
 * Created by Team Member Josh Faber
 */

package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.hardware.ColorSensor;

import static org.firstinspires.ftc.teamcode.Mech.Driving;
/*import static org.firstinspires.ftc.teamcode.Mech.FLBR;
import static org.firstinspires.ftc.teamcode.Mech.FR BL;*/
import static org.firstinspires.ftc.teamcode.Mech.Turning;
import static org.firstinspires.ftc.teamcode.RobotGeneral.*;

@Autonomous(name="MechAut", group="Auton")

public class MechAut extends LinearOpMode {

    /* Declare OpMode members. */
    public static final double SERVO_INIT_POS = 0.5;//This is the initial position of a servo and what you will send it back to
    private ElapsedTime runtime = new ElapsedTime();

    private DcMotor frontLeftMotor;
    private DcMotor backLeftMotor;
    private DcMotor frontRightMotor;
    private DcMotor backRightMotor;

    RobotGeneral Robot = new RobotGeneral(frontRightMotor, frontLeftMotor, backRightMotor, backLeftMotor);


    @Override
    public void runOpMode() throws InterruptedException {


        Robot.init(hardwareMap);
        telemetry.addData("Status", "Auton has been Initialized");
        telemetry.update();

        // Wait for the game to start (driver presses PLAY)
        waitForStart();

        while (opModeIsActive() && (runtime.seconds() < 2)) {
            Robot.set(0.8, 0.8);
        }

        Robot.set(0,0);
    }
}






//