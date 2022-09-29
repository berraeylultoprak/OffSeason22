package Storage;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import com.ctre.phoenix.motorcontrol.ControlMode;

public class Storage extends SubsystemBase {
  /** Creates a new Storage. */
  public WPI_TalonFX storageRight = new WPI_TalonFX(2);
  public WPI_TalonFX storageLeft = new WPI_TalonFX(2);
  public Storage() {
    storageLeft.setInverted(false);
    storageRight.setInverted(true);
  }

  public void bothForward(){
    storageLeft.set(ControlMode.PercentOutput, Constants.STORAGE_SPEED);
    storageRight.set(ControlMode.PercentOutput, Constants.STORAGE_SPEED);
  }

  public void bothBackward(){
    storageLeft.set(ControlMode.PercentOutput, -1 * Constants.STORAGE_SPEED);
    storageRight.set(ControlMode.PercentOutput, -1 * Constants.STORAGE_SPEED);
  }

  public void rightForward(){
    storageRight.set(ControlMode.PercentOutput, Constants.STORAGE_SPEED);
    storageLeft.set(ControlMode.PercentOutput, -1 * Constants.STORAGE_SPEED);
  }

  public void leftForward(){
    storageRight.set(ControlMode.PercentOutput, -1 * Constants.STORAGE_SPEED);
    storageLeft.set(ControlMode.PercentOutput, Constants.STORAGE_SPEED);
  }

  public void stop(){
    storageLeft.set(0.0);
    storageRight.set(0.0);
  }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
