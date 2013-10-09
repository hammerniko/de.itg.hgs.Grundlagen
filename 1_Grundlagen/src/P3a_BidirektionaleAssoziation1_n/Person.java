package P3a_BidirektionaleAssoziation1_n;

public class Person {
	String name;	
	String vorname;
	
	public Person(String name, String vorname) {
	    super();
	    this.name = name;
	    this.vorname = vorname;
    }

	@Override
    public String toString() {
	    return "Person [" + name +", " + vorname+"]";
    }
	
	
}
