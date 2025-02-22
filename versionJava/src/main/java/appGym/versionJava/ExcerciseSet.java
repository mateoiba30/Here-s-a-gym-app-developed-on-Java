package appGym.versionJava;

public class ExcerciseSet {
	private State state;
	private Concept concept;
	private SetDuration duration;
	
	public ExcerciseSet(SetDuration duration, Concept concept) {	
		this.duration = duration;
		this.concept = concept;
		this.state = new Uncompleted();
	}
	
	public void markAsCompleted() {
		this.state.markAsCompleted(this);
	}
	
	public void markAsUncompleted() {
		this.state.markAsUncompleted(this);
	}
	
	public double getVolume() {
		return this.state.getVolumeProduct() * this.getInitialVolume();
	}
	
	private double getInitialVolume() {
		return this.duration.getInitialVolume();
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public String getLogo() {
		return this.concept.getLogo();
	}
	
	public double getGraphicValue() {
		return this.duration.getGraphicValue();
	}
}
