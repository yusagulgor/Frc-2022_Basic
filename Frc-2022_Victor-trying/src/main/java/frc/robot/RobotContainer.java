// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.commands.ArcadeDrive;
import frc.robot.subsystems.DriveSubsystem;

public class RobotContainer {
  DriveSubsystem driveSubsystem;
  public RobotContainer() {
    driveSubsystem = new DriveSubsystem();
    driveSubsystem.setDefaultCommand(new ArcadeDrive(driveSubsystem, 0.8));
    configureBindings();
  }

  private void configureBindings() {
  }

  public Command getAutonomousCommand() {
    //return new GoXSecond(driveSubsystem, 0.7, 3);
    //return new TurnXSecond(driveSubsystem, 0.5, 1);
    //return new TurnXDegrees(driveSubsystem, 180, 0.5);
    //return new GoXMeter(driveSubsystem, 1);
    return null;
  }
}
