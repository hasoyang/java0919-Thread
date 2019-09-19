package thread;

public class ShareData extends Thread {
	
	//합계를 저장할 변수
	private int result;
	//인덱스변수
	private int idx;
	//idx를 10000번 정도 증가시키면서 result에 더하는 메소드
	//synchronized 가 붙은 메소드는 자신의 작업이 완료되기 전에는
	//다른 작업할 수 없도록 합니다.
	private void sum()
	{
		for(int i = 0; i < 10000 ; i++)
		{
			try
			{
				synchronized(this) {
				idx++;
				Thread.sleep(1);
				result = result + idx;
				}
			}catch(Exception e) {}
		}
	}
	//스레드로 동작할 내용을 가진 메소드
	@Override
	public void run()
	{
		sum();
	}
	//result를 리턴하는 메소드
	public int getResult()
	{
		return result;
	}
}
