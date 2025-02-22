package appGym.versionJava;
import java.util.List;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExcerciseTypeTest {
	
	ExcerciseType repType;
	ExcerciseType timeType;
	List<ExcerciseSet> setsToDo;

	@BeforeEach
	void setUp() {
		this.repType = new RepType("tipo con repeticiones", null, "ejercicio de prueba 1");
		this.timeType = new TimeType("tipo con tiempo", null, "ejercicio de prueba 2");
		this.setsToDo = new ArrayList<ExcerciseSet>();
	}
	
	@Test
	void testAddSet() {
		this.repType.addSet(setsToDo);
		this.timeType.addSet(setsToDo);
		assertNotEquals(this.setsToDo.get(0).getInitialVolume(), 0);
		assertEquals(this.setsToDo.get(1).getInitialVolume(), 0);
	}
}
