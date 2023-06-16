// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.SPI.Port;

public final class Constants {
  public static final int JOYSTICK_PIN = 0;
  public static class DriveConstants {
    public static final int FRONT_LEFT_VICTOR_ID = 1;
    public static final int MID_LEFT_VICTOR_ID = 2;
    public static final int REAR_LEFT_VICTOR_ID = 3;
    public static final int FRONT_RIGHT_VICTOR_ID = 4;
    public static final int MID_RIGHT_VICTOR_ID = 5;
    public static final int REAR_RIGHT_VICTOR_ID = 6;
    public static final Port NAVX_PORT = SPI.Port.kMXP;
    public static final int LEFT_ENCODER_CHANNEL_A = 1;
    public static final int LEFT_ENCODER_CHANNEL_B = 2;
    public static final int RIGHT_ENCODER_CHANNEL_A = 3;
    public static final int RIGHT_ENCODER_CHANNEL_B = 4;
  }
}
