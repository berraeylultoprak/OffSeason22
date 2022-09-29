package Storage;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import com.ctre.phoenix.motorcontrol.ControlMode;

public class Storage extends SubsystemBase {
  /** Creates a new Storage. */
  public WPI_TalonFX Storage = new WPI_TalonFX(2);
  public Storage() {
    storage.setInverted(true);
  }

  public void storageForward() {
    storage.set(ControlMode.PercentOutput, 0.5);
  }

  public void stop() {
    storage.set(ControlMode.PercentOutput, 0.0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
