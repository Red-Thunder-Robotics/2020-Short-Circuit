/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.IntakeSubsystem;
import frc.robot.subsystems.Shooter.FlyWheelSubsystem;

public class Intake extends CommandBase {
  private final IntakeSubsystem intakeSubsystem;
  private final DoubleSupplier moveMotor;
  /**
   * Creates a new Intake.
   */
  public Intake(IntakeSubsystem subsystem, DoubleSupplier output) {
    intakeSubsystem = subsystem;
    moveMotor = output;
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
    intakeSubsystem.setIntakeSpeed(moveMotor.getAsDouble());
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
