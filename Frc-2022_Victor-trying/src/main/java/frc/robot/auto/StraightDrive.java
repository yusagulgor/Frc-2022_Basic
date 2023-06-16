package frc.robot.auto;

import edu.wpi.first.math.util.Units;
import edu.wpi.first.wpilibj.Encoder;

public class StraightDrive{

    private AutoConfigurer autoConfigurer;

    private Encoder leftEncoder;
    private Encoder rightEncoder;

    public StraightDrive(AutoConfigurer autoConfigurer, Encoder leftEncoder, Encoder rightEncoder){
        this.autoConfigurer = autoConfigurer;
        this.leftEncoder = leftEncoder;
        this.rightEncoder = rightEncoder;
    }

    // Use this methods for PID calculation
    public double goXmeter(double meterSetpoint){       
        return calculate(Units.feetToMeters(getEncodersFeetAverage()), meterSetpoint);
    }

    public double goXfeet(double feetSetpoint){
       return calculate(getEncodersFeetAverage(), feetSetpoint);
    }

    // PID Controller
    public double calculate(double currentDistance, double setpoint){
        return autoConfigurer.getEncoderPID().calculate(currentDistance, setpoint);
    }

    // Use this methods for measurement informations
    public double getEncodersFeetAverage(){
        return (leftEncoder.get()*AutoConstants.K_DRIVE_TICK_2_FEET + rightEncoder.get()*AutoConstants.K_DRIVE_TICK_2_FEET)/2;
    }

    public double getLeftEncoderFeet(){
        return leftEncoder.get()*AutoConstants.K_DRIVE_TICK_2_FEET;
    }

    public double getRightEncoderFeet(){
        return rightEncoder.get()*AutoConstants.K_DRIVE_TICK_2_FEET;
    }
}