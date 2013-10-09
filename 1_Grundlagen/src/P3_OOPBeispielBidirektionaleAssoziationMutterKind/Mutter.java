package P3_OOPBeispielBidirektionaleAssoziationMutterKind;
import java.util.HashSet;
import java.util.Set;

public class Mutter extends Person {
	Set<Kind>	kinder; // ...

	public Mutter(String name, String vorname) {	
		super(name,vorname);
		kinder = new HashSet<Kind>();
	}
	
	public Set<Kind> getKinder() {
    	return kinder;
    }

	public void setKinder(Set<Kind> kinder) {
    	this.kinder = kinder;
    }

	

	public void addKind(Kind k) {
		if (k != null) {
			kinder.add(k);
			k.setMutter(this);
		}
	}

	@Override
    public String toString() {
		
	    return super.toString()+" ist Mutter der Kinder=" + kinder;
    }
	
	

	
	
	
	
}

