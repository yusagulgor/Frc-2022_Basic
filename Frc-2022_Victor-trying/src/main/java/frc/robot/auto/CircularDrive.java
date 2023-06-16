package frc.robot.auto;

import edu.wpi.first.math.util.Units;
import edu.wpi.first.wpilibj.Encoder;

// ATTENTION : This class is not tested yet. It is just a draft.
public class CircularDrive{

    AutoConfigurer autoConfigurer;

    double leftArcSetpoint;
    double rightArcSetpoint;

    double leftOutput;
    double rightOutput;

    Encoder leftEncoder;
    Encoder rightEncoder;

    double [] arcOutputs = new double [] {0, 0};


    public CircularDrive(AutoConfigurer autoConfigurer, Encoder leftEncoder, Encoder rightEncoder){
        this.autoConfigurer = autoConfigurer;
        this.leftEncoder = leftEncoder;
        this.rightEncoder = rightEncoder;
    }

    public double [] calculateArcSetpoints(double degrees, double meterSetpoint){
        double temp = 2 * Math.PI * (degrees/360);

        double radius = meterSetpoint / temp;

        if(degrees < 0){
        leftArcSetpoint = 2 * Math.PI * (radius-AutoConstants.DISTANCE_BETWEEN_WHEELS_CM) * (degrees/360);
        rightArcSetpoint = 2 * Math.PI * (radius+AutoConstants.DISTANCE_BETWEEN_WHEELS_CM) * (degrees/360);
        } else{
        leftArcSetpoint = 2 * Math.PI * (radius+AutoConstants.DISTANCE_BETWEEN_WHEELS_CM) * (degrees/360);
        rightArcSetpoint = 2 * Math.PI * (radius-AutoConstants.DISTANCE_BETWEEN_WHEELS_CM) * (degrees/360);    
        }

        rightOutput = autoConfigurer.getEncoderPID().calculate(Units.feetToMeters(rightEncoder.getDistance()*AutoConstants.K_DRIVE_TICK_2_FEET), rightArcSetpoint);
        leftOutput = autoConfigurer.getEncoderPID().calculate(Units.feetToMeters(leftEncoder.getDistance()*AutoConstants.K_DRIVE_TICK_2_FEET), leftArcSetpoint);

        arcOutputs[0] = rightOutput;
        arcOutputs[1] = leftOutput;

        return arcOutputs;
    }

}
