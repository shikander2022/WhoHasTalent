package sf.fmrk.com;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class VocalistTest {

	private Vocalist v1;

	@Before
	public void setup() {
		v1 = new Vocalist(1191);
	}

	@Test
	public void vocalistTest() {
		String output = v1.perform("G");
		assertEquals("I sing in the key of - G - 1191", output);
	}

	@Test
	public void vocalistWithVolTest() {
		String output = v1.perform("G", 5);
		assertEquals("I sing in the key of - G - at the volume 5 - 1191",
				output);
	}
}
