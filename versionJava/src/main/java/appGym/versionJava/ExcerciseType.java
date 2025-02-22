package appGym.versionJava;
import java.util.List;

import javax.swing.ImageIcon;

public abstract class ExcerciseType {
	private String name;
	private ImageIcon img;
	private String description;
	private TypeDuration duration;
	private Equipment equipment;
	
	public ExcerciseType(String name, ImageIcon img, String description, TypeDuration duration, Equipment equipment) {
		this.name = name;
		this.img = img;
		this.description = description;
		this.duration = duration;
		this.equipment = equipment;
	}
	
	private ExcerciseSet createSet() {
		return this.duration.createSet();
	}
	
	public void addSet(List<ExcerciseSet> setsToDo) {
		ExcerciseSet set = this.createSet();
		setsToDo.add(set);
	}
	
	public void editSet(ExcerciseSet set) {
		set = this.createSet();
	}
}
