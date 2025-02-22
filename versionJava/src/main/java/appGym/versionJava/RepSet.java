package appGym.versionJava;

public class RepSet implements SetDuration{
	private int reps;
	private double weight;
	
	public RepSet(int reps, double weight) {
		this.reps = reps;
		this.weight = weight;
	}
	
	@Override
	public double getInitialVolume() {
		return this.reps * this.weight;
	}
	
	@Override
	public double getGraphicValue() {
		return this.getInitialVolume();
	}
}
