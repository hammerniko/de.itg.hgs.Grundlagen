package H_Arrays;


public class sort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int merke;
		int[] z = {3,6,22,9,7,1};
		
		for (int i = 0; i < z.length-1; i++) {
			for (int j = i+1; j < z.length; j++) {
				System.out.print("i="+i+" j="+j+",\t");
				
				//
				if(z[j]<z[i]){
					//tausche
					merke=z[i];
					z[i]=z[j];
					z[j]=merke;
				}
				
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 0; i < z.length; i++) {
			System.out.print(z[i]+" ");
		}
		
		

	}

}
