package F3_JunitTest;

import org.junit.Test;
import org.junit.Assert;

public class LaengenrechnerTest {
	
   
	@Test
	public void testMeterInZoll() {
		Laengenrechner umrechner = new Laengenrechner();
		Assert.assertEquals(39.37, umrechner.meterInZoll(1),0.001);
		Assert.assertEquals(0, umrechner.meterInZoll(0),0.001);
	}
	
	@Test
	public void testZollInMeter() {
		Laengenrechner umrechner = new Laengenrechner();
		Assert.assertEquals(0.0254, umrechner.zollInMeter(1),0.001);
		
	}
}
