package frc.robot.auto;

public class AutoConstants {

    // PID values for gyro and encoder

    public static final double REDUCTION_GEAR = 1;
    public static final double WHEEL_DIAMETER_INCHES = 6;
    public static final double ENCODER_PPR = 1024;

    public static final double K_DRIVE_TICK_2_FEET = REDUCTION_GEAR / Math.PI * WHEEL_DIAMETER_INCHES * ENCODER_PPR / 12;

    public static final double K_ENCODER_P = 0.0;
    public static final double K_ENCODER_I = 0.0;
    public static final double K_ENCODER_D = 0.0;

    public static final double K_GYRO_P = 0.0;
    public static final double K_GYRO_I = 0.0;
    public static final double K_GYRO_D = 0.0;
    
    public static final double DISTANCE_BETWEEN_WHEELS_CM = 27;
}