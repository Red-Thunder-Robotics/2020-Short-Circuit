/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.Conveyor;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Conveyor.ConveyorSubsystem;

public class Intake extends CommandBase {
  private final ConveyorSubsystem conveyorSubsystem;
  private final DoubleSupplier intake;
  /**
   * Creates a new Intake.
   */
  public Intake(ConveyorSubsystem subsystem, DoubleSupplier opjoystick) {
    conveyorSubsystem = subsystem;
    intake = opjoystick;
    // Use addRequirements() here to declare subsystem dependencies.
    // addRequirements(RobotContainer.intakeSubsystem);
    addRequirements(subsystem);
  }


  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    conveyorSubsystem.fullIntake(intake.getAsDouble());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
