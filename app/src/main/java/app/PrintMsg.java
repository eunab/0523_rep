package app;

public class PrintMsg implements IPrintMsg{
	public void sayHello() {
		System.out.println("Hello AOP...");			//PrintMsg에서 새로 선언된 sayHello함수 sysout명령이 들어있다.
	}
}