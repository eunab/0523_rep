package app2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class HelloMain{
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app2.xml");	
														//어떤 xml파일을 사용할지 설정
		IPrintMsg printMsg = (IPrintMsg) ctx.getBean("printMsg");
												// app2.xml의 printmsg의 값을 얻어온다
		printMsg.sayHello1();					// app2.xml에서 설정된 sayhello1만 메소드 호출시에 실행된다
		printMsg.sayHello2();					// 메소드 호출이 끝난뒤 sayhello2 실행
	}
}