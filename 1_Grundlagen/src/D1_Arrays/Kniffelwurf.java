package D1_Arrays;

public class Kniffelwurf {

	public static void main(String[] args) {
				
		int[] wurf = gibWurf(new int[5]);
		ausgabeWuerfel(wurf);
	}
	
	public static int gibWuerfelZahl(){
		return (int) (Math.random()*6+1);
	}
	
	public static int[] gibWurf(int[] w){
		
		for (int i = 0; i < w.length; i++) {
			w[i]=gibWuerfelZahl();
		}
		return w;
	}
	
	public static void ausgabeWuerfel(int[] w){
		for (int i = 1; i <= w.length; i++) {
			System.out.print(w[i-1]+" ");
		}
		System.out.println();
	}
	
	

}
