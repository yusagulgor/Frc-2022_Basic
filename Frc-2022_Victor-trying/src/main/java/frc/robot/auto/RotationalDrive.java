package frc.robot.auto;

import com.kauailabs.navx.frc.AHRS;

public class RotationalDrive {
    
    private AutoConfigurer autoConfigurer;
    private AHRS gyro;

    public RotationalDrive(AutoConfigurer autoConfigurer, AHRS gyro) {
        this.autoConfigurer = autoConfigurer;
        this.gyro = gyro;
    }

    public double turnXDegrees(double degreesSetpoint){
        double output = autoConfigurer.getGyroPID().calculate(gyro.getYaw(), degreesSetpoint);
        return output;
    }

}
