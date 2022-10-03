// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

import edu.wpi.first.wpilibj2.command.SubsystemBase;
package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Climb extends SubsystemBase {
  /** Creates a new Climb. */
  public WPI_TalonFX climb1 = new WPI_TalonFX(0);
  public WPI_TalonFX climb2 = new WPI_TalonFX(1);

  /** Creates a new Climb. */
  public Climb() {
    climb1.setInverted(false);
    climb2.setInverted(false);
  }

  public void climbUp(){
    climb1.set(0.84);
    climb2.set(0.84);
  }

  public void climbDown(){
    climb1.set(-0.84);
    climb2.set(-0.84);
  }

  public void rightUp(){
    climb2.set(0.84); // degerler tune lanacak
  }

  public void rightDown(){
    climb2.set(-0.84);
  }

  public void leftUp(){
    climb1.set(0.84);
  }

  public void leftDown(){
    climb1.set(-0.84);
  }

  public void stop(){
    climb1.set(0);
    climb2.set(0);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
