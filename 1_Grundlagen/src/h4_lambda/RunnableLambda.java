package h4_lambda;

public class RunnableLambda {
	
	public static void main(String[] args) {
		
		Runnable r = () -> {
			for (int i = 0; i < 100; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("i:"+i);
			}
		};
		
		new Thread(r).start();
	}

}
