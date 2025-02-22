package appGym.versionJava;
import java.util.List;
import java.util.Scanner;
import javax.swing.ImageIcon;

public class RepType extends TypeDuration{

	public RepType() {

	}
	
//	private void getInfo(Integer reps, Double weight) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Ingrese la cantidad de repeticiones del set: ");
//		reps = scanner.nextInt(); 
//		System.out.print("Ingrese el peso del set: ");
//		weight = scanner.nextDouble(); 
//		scanner.close();
//	}
	
	private int getReps() {
		return 5;
	}
	
	private double getWeight() {
		return 5.0;
	}
	
	@Override
	public SetDuration createDuration() {
//		Integer reps = null; //we need to initialize the variables
//		Double weight = null;
//		this.getInfo(reps, weight);
		int reps = this.getReps();
		double weight = this.getWeight();
		return new RepSet(reps, weight);
	}
	
}
