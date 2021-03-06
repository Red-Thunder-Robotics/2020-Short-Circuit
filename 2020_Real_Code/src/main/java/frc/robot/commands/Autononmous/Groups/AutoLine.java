/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.Autononmous.Groups;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.commands.Autononmous.Commands.MoveDistance;
import frc.robot.commands.Shooter.ShootCenter;
import frc.robot.subsystems.Conveyor.ConveyorSubsystem;
import frc.robot.subsystems.Drive.DriveSubsystem;
import frc.robot.subsystems.Shooter.FlyWheelSubsystem;
import frc.robot.subsystems.Shooter.TurretSubsystem;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/latest/docs/software/commandbased/convenience-features.html
public class AutoLine extends SequentialCommandGroup {
  /**
   * Creates a new AutoLine.
   */
  public AutoLine(DriveSubsystem driveSubsystem, TurretSubsystem turretSubsystem, ConveyorSubsystem conveyorSubsystem, FlyWheelSubsystem flywheelSubsystem) {
    // Add your commands in the super() call, e.g.
    // super(new FooCommand(), new BarCommand());
    addCommands(new ShootCenter(turretSubsystem, flywheelSubsystem, conveyorSubsystem, 3),
                new MoveDistance(driveSubsystem, .50, -48)
    );
  }
}
