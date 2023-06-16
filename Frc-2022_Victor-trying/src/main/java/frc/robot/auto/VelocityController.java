package frc.robot.auto;

import edu.wpi.first.math.util.Units;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Timer;

// ATTENTION : This class is not tested yet. It is just a draft.
public class VelocityController {
    
    AutoConfigurer autoConfigurer;
    Encoder encoder;
    Timer timer = new Timer();
    double output = 0;

    public VelocityController(AutoConfigurer autoConfigurer, Encoder encoder) {
        this.autoConfigurer = autoConfigurer;
        this.encoder = encoder;
        timer.reset();
        timer.start();
    }

    public double goXVelocity(double setpointVelocity){
        double currentPosition = Units.feetToMeters(encoder.get()*AutoConstants.K_DRIVE_TICK_2_FEET);
        double currentVelocity = currentPosition/timer.get();

        output += autoConfigurer.getEncoderPID().calculate(currentVelocity, setpointVelocity);
        return output;
    }

}