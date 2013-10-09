package P3a_BidirektionaleAssoziation1_n;
import java.util.HashSet;
import java.util.Set;

public class Mutter {
	Set<Kind>	kinder; // ...

	public Mutter() {		
		kinder = new HashSet<Kind>();
	}

	public void addKind(Kind k) {
		if (k != null) {
			kinder.add(k);
			k.setMutter(this);
		}
	}
}
