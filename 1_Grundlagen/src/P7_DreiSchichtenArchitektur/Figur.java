package P7_DreiSchichtenArchitektur;

public class Figur {
	
	@Override
    public String toString() {
	    return "Figur [xPos=" + xPos + ", yPos=" + yPos + "]";
    }

	public int getxPos() {
    	return xPos;
    }

	public void setxPos(int xPos) {
    	this.xPos = xPos;
    }

	public int getyPos() {
    	return yPos;
    }

	public void setyPos(int yPos) {
    	this.yPos = yPos;
    }

	protected int xPos;
	protected int yPos;
	
	public Figur(int x, int y){
		xPos = x;
		yPos = y;
	}
	
}

