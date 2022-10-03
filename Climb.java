// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

import edu.wpi.first.wpilibj2.command.SubsystemBase;
package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj.WPI_TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Climb extends SubsystemBase {
  /** Creates a new Climb. */
  public WPI_TalonFX climb = new WPI_TalonFX(0);

  /** Creates a new Climb. */
  public Climb() {
    climb.setInverted(false);
  }

  public void climbUp(){
    climb.set(0.84);
  }

  public void climbDown(){
    climb.set(-0.84);
  }

  public void stop(){
    climb.set(0);
  }
  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
