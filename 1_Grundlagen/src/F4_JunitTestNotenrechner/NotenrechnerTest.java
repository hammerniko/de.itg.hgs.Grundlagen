package F4_JunitTestNotenrechner;

import org.junit.Assert;
import org.junit.Test;

public class NotenrechnerTest {

	@Test
	public void testNoteBerechnen() {
		Notenrechner nr = new Notenrechner();
		Assert.assertEquals(Notenrechner.MELDUNG_NOTE + "6.0", nr.berechneNote(0.0, 50));
		Assert.assertEquals(Notenrechner.MELDUNG_NOTE + "6.0", nr.berechneNote(0, 10.5));
		Assert.assertEquals(Notenrechner.MELDUNG_NOTE + "1.0", nr.berechneNote(50, 50));
		Assert.assertEquals(Notenrechner.MELDUNG_NOTE + "3.5", nr.berechneNote(25, 50));
	}

	@Test
	public void testFehlerInNoteBerechnen() {
		Notenrechner nr = new Notenrechner();
		Assert.assertEquals(Notenrechner.FEHLER_PERR_GROESSER_PMAX, nr.berechneNote(60, 50));
		Assert.assertEquals(Notenrechner.FEHLER_PERR_KLEINER_NULL, nr.berechneNote(-5, 20));
		Assert.assertEquals(Notenrechner.FEHLER_PMAX_KLEINER_NULL, nr.berechneNote(5, -20));
	}
	
	
}
