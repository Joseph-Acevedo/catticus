package subsystems.visionSubsystem;

import subsystems.ISubsystem;

public class VisionSubsystem implements ISubsystem{
	
	public VisionSubsystem() {
		nu.pattern.OpenCV.loadShared();
	}
}
