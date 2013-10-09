package P3_OOPBeispielBidirektionaleAssoziationMutterKind;

public class Kind extends Person{
	
	Mutter	mutter;
	
	public Kind(String name, String vorname){
		super(name,vorname);
	}

	public void setMutter(Mutter m) {
		mutter = m;
		if (m != null && !m.getKinder().contains(this)){
			m.addKind(this);
		}
	}

	@Override
    public String toString() {
	    return super.toString()+ " Mutter=" + mutter.getVorname() + "]";
    }
	
	
}