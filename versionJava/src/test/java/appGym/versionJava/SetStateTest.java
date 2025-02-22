package appGym.versionJava;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SetStateTest {

	private ExcerciseSet repSet;
	private ExcerciseSet timeSet;
	private int reps = 5;
	private double weight = 5.0;
	private int time = 60;
	
	@BeforeEach
	void setUp() {
		this.repSet = new RepSet(reps, weight);
		this.timeSet = new TimeSet(time);
	}
	
	@Test
	void testGetVolumeAndMark() {
		assertEquals(this.repSet.getVolume(), 0);
		assertEquals(this.timeSet.getVolume(), 0);
		this.repSet.markAsCompleted();
		this.timeSet.markAsCompleted();
		assertEquals(this.repSet.getVolume(), reps*weight);
		assertEquals(this.timeSet.getVolume(), 0);
	}
}
