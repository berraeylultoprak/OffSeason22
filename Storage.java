package Storage;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import com.ctre.phoenix.motorcontrol.ControlMode;

public class Storage extends SubsystemBase {
  /** Creates a new Storage. */
  public WPI_TalonFX storage = new WPI_TalonFX(2);
  public Storage() {
    storage.setInverted(false);
  }

  public void storageForward(){
    storage.set(ControlMode.PercentOutput, Constants.STORAGE_SPEED);
  }

  public void storageBackwards(){
    storageLeft.set(ControlMode.PercentOutput, -1 * Constants.STORAGE_SPEED);
    storageRight.set(ControlMode.PercentOutput, -1 * Constants.STORAGE_SPEED);
  }

  public void stop(){
    storage.set(0.0);
  }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
