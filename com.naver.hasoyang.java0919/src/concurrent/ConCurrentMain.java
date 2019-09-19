package concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConCurrentMain {

	public static void main(String[] args) {
		//스레드 10개를 생성해서 실행
		/*
		for(int i = 0; i < 10; i++)
		{
			ThreadEx th= new ThreadEx();
			th.start();
		}
	*/
		//코어 개수 찾아오기
		//Runtime클래스는 생성자를 이용해서 객체를 생성하지 않고
		//getRuntime()이라는자신의 static메소드로 객체를 생성
		//이렇게 만든 이유는 Singleton(객체를 1개만 생성)을 디자인 패턴을 적용
		int core = Runtime.getRuntime().availableProcessors();
		//코어 개수만큼 스레드를 만들어서 실행시켜주는 ThreadPool생성
		ExecutorService service = Executors.newFixedThreadPool(core);
		
		for(int i = 0; i < 20; i ++)
		{
			ThreadEx th = new ThreadEx();
			service.submit(th);
		}
		
		//작업을 전부 수행하고 스레드 풀 종료
		//실제 서버이면 이 메소드 호출 안합니다.
		service.shutdown();
	}

}
