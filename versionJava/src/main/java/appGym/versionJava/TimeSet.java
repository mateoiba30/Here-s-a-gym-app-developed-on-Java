package appGym.versionJava;

public class TimeSet implements SetDuration {
	private int secs;
	
	public TimeSet(int secs) {
		this.secs = secs;
	}
	
	@Override
	public double getInitialVolume() {
		return 0;
	}
	
	@Override
	public double getGraphicValue() {
		return (double) this.secs;
	}
}
