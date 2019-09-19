package thread;

public class ThreadTemp extends Thread {
	//스레드로 수행할 내용을 가지는 메소드
	@Override
	public void run()
	{
		//1초 마다 쉬면서 Hello Java를5번 출력
		for (int i = 0; i < 5; i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.printf("%d\n", e.getMessage());
			}
			
			System.out.println("Hello Java");
		}
	}

}
