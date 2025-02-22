package appGym.versionJava;

public class Uncompleted implements State {
	
	public Uncompleted() {
		
	}
	
	public void markAsCompleted(ExcerciseSet set) {
		set.setState(new Completed());
	}
	
	public void markAsUncompleted(ExcerciseSet set) {
		
	}
	
	public double getVolumeProduct() {
		return 0;
	}
}
