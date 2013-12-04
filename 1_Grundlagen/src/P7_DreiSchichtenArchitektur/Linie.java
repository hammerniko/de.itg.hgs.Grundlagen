package P7_DreiSchichtenArchitektur;

public class Linie extends Figur{

	protected int x2Pos;
	protected int y2Pos;
	
	public Linie(int x, int y,int x2, int y2) {
	    super(x, y);
	    
	    x2Pos = x2;
	    y2Pos = y2;
	    
    }

	public int getX2Pos() {
    	return x2Pos;
    }

	public void setX2Pos(int x2Pos) {
    	this.x2Pos = x2Pos;
    }

	public int getY2Pos() {
    	return y2Pos;
    }

	public void setY2Pos(int y2Pos) {
    	this.y2Pos = y2Pos;
    }

	@Override
    public String toString() {
	    return "Linie [x2Pos=" + x2Pos + ", y2Pos=" + y2Pos + "]";
    }
	
	
	
	
	
	
}
