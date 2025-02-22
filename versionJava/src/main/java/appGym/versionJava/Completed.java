package appGym.versionJava;

public class Completed implements State {
	
	public Completed() {
		
	}
	
	public void markAsUncompleted(ExcerciseSet set) {
		set.setState(new Uncompleted());
	}
	
	public void markAsCompleted(ExcerciseSet set) {
		
	}
	
	public double getVolumeProduct() {
		return 1;
	}
}
