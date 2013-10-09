package P3_OOPBeispielBidirektionaleAssoziationMutterKind;

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

	public String getName() {
    	return name;
    }

	public void setName(String name) {
    	this.name = name;
    }

	public String getVorname() {
    	return vorname;
    }

	public void setVorname(String vorname) {
    	this.vorname = vorname;
    }
	
	
}
