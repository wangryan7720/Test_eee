import lejos.hardware.ev3.LocalEV3;
import lejos.hardware.motor.EV3LargeRegulatedMotor;

public class test {
	private static final EV3LargeRegulatedMotor leftMotor = new EV3LargeRegulatedMotor(LocalEV3.get().getPort("A"));
	private static final EV3LargeRegulatedMotor rightMotor = new EV3LargeRegulatedMotor(LocalEV3.get().getPort("D"));
	public static final double WHEEL_RADIUS = 2.1;
	public static final double TRACK = 15.8;
	
	public static void main(String[] args){
		
		double difference=-Math.PI/2;
		double wheelRotation=(difference*TRACK/WHEEL_RADIUS)/2;
		int rotationDegrees=(int) Math.round(Math.toDegrees(wheelRotation));
		rightMotor.rotate(-rotationDegrees,true);
		leftMotor.rotate(rotationDegrees,false);
	
	}
}
