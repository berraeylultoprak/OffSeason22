package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {
    public WPI_TalonFX Intake = new WPI_TalonFX(2);
    public Intake() {
        intake.setInverted(true);
    }

    @Override
    public void periodic() {
        //arranged to be called oncer per scheduler run
    }

    public void intakeForward() {
        intake.set(ControlMode.PercentOutput, 0.5);
    }

    public void intakeBackwards() {
        intake.set(ControlMode.PercentOutput, -0.5);
    }

    public void stop() {
        intake.set(ControlMode.PercentOutput, 0);
    }
}
