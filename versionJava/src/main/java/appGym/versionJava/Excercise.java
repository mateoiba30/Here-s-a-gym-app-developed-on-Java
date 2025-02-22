package appGym.versionJava;
import java.util.List;
import java.util.stream.Collectors;

public class Excercise {
	private ExcerciseType type;
	private List<ExcerciseSet> setsToDo;
	private List<ExcerciseSet> setsRecord;

	public Excercise(ExcerciseType type, List<ExcerciseSet> setsToDo) {
		this.type = type;
		this.setsToDo = setsToDo;
	}
	
	public void addSet() {
		this.type.addSet(setsToDo);
	}
	
	public List<Double> graphic(){ //volume or time
		return this.setsRecord.stream().map(s -> s.getGraphicValue()).collect(Collectors.toList());
	}
	
	public void removeSet(ExcerciseSet set) { //borrar con un índice y agregar el índice en la calse ExcersiceSet? o ponerle un id
		this.setsToDo.remove(set);
	}
	
	public void completeSet(ExcerciseSet set) {
		set.markAsCompleted();
		this.setsRecord.add(set);
	}
	
	public void unmarkSet(ExcerciseSet set) {
		set.markAsUncompleted();
		this.setsRecord.remove(set);
	}
	
	public void finishSets() {
		this.setsToDo.stream().forEach(s -> s.markAsUncompleted());
	}
	
	public void editSet(ExcerciseSet set) {
		this.type.editSet(set);
	}
	
}