package frc.robot.auto;

import edu.wpi.first.math.controller.PIDController;

public class AutoConfigurer {
    
    PIDController gyroPidController = new PIDController(AutoConstants.K_GYRO_P, AutoConstants.K_GYRO_I, AutoConstants.K_GYRO_D);
    PIDController encoderPidController = new PIDController(AutoConstants.K_ENCODER_P, AutoConstants.K_ENCODER_I, AutoConstants.K_ENCODER_D);

    // getter-setters for PID values
    public void setGyroPID(double p, double i, double d){
        gyroPidController.setP(p);
        gyroPidController.setI(i);
        gyroPidController.setD(d);
    }

    public void setEncoderPID(double p, double i, double d){
        encoderPidController.setP(p);
        encoderPidController.setI(i);
        encoderPidController.setD(d);
    }

    public PIDController getGyroPID(){
        return gyroPidController;
    }

    public PIDController getEncoderPID(){
        return encoderPidController;
    }    
}
