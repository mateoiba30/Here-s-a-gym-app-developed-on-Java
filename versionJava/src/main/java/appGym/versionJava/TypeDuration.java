package appGym.versionJava;

public abstract class TypeDuration {

	public ExcerciseSet createSet() {
		SetDuration duration = this.createDuration();
		Concept concept = this.getConcept();
		return new ExcerciseSet(duration, concept);
	}
	
	private Concept getConcept(){
		return  new Normal();
	}
	
	protected abstract SetDuration createDuration();
}
