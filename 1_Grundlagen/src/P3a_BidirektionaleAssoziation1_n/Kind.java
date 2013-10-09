package P3a_BidirektionaleAssoziation1_n;

public class Kind {
	Mutter	mutter;

	public void setMutter(Mutter m) {
		mutter = m;
		if (m != null){
			m.addKind(this);
		}
	}
}
