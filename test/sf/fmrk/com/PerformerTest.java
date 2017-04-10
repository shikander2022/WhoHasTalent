package sf.fmrk.com;


import org.junit.Assert;
import org.junit.Test;

public class PerformerTest {



	@Test
	public void performTest() {
		Performer p1 = new Performer(123);
		String output = p1.perform();
		Assert.assertEquals("123 - performer", output);

	}

}
