package appGym.versionJava;
import java.util.List;
import java.util.Scanner;
import javax.swing.ImageIcon;

public class TimeType extends TypeDuration{

	public TimeType() {
		super();
	}
	
	private int getSecs(){
//		int mins;
//		int secs;
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Ingrese la cantidad de minutos del set: ");
//		mins = scanner.nextInt(); 
//		System.out.print("Ingrese la cantidad de saegundos del set: ");
//		secs = scanner.nextInt(); 
//		scanner.close();
//		return mins*60 + secs;
		return 60;
	}
	
	@Override
	public SetDuration createDuration() {
		int secs = this.getSecs();
		return new TimeSet(secs);
	}
}
