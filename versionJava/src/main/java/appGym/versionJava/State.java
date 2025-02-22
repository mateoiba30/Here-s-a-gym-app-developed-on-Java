package appGym.versionJava;

public interface State {
	
	public abstract void markAsCompleted(ExcerciseSet set);
	
	public abstract void markAsUncompleted(ExcerciseSet set);

	public abstract double getVolumeProduct();
}
