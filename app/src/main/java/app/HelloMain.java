package app;

import org.springframework.aop.framework.ProxyFactory;
public class HelloMain{
	public static void main(String[] args) {
		IPrintMsg target = new PrintMsg();		// 타겟을 printmsg로 선언
		ProxyFactory pf = new ProxyFactory();	// 프록시 선언 빈껍데기 생성(?)
		pf.addAdvice(new MyAroundAdvice());		// 충고 add(?)
		pf.setTarget(target);					// 현재의 타겟을 프록시에 삽입
		
		PrintMsg proxy = (PrintMsg)pf.getProxy();	// 프록시 생성
		proxy.sayHello();	//타겟에 삽입한것의 sayhello를 실행
	}
}