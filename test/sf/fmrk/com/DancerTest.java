package sf.fmrk.com;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DancerTest {

	private Dancer d1;

	@Before
	public void setup() {
		d1 = new Dancer("tap", 772);

	}

	@Test
	public void testPerform() {
		String output = d1.perform();
		Assert.assertEquals("tap - 772 - dancer", output);
	}

}
