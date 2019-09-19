package thread;

public class ThreadMain3 extends Thread {
	public static void main(String[] args)
	{
		Thread th1 = new Thread(){
			public void run() {
				for(int i = 0; ;i++)
				{
					System.out.println("1");
				}
			}
		};
		Thread th2 = new Thread(){
			public void run() {
				for(int i = 0; ;i++)
				{
					System.out.println("2");
				}
			}
		};
		
		th1.start();
		th2.start();
	
		try {
			//1초 동안 일하고 다른 스레드 실행
			th1.join(1000);
			//1초 동안 일하고 다른 스레드 실행
			th2.join(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
