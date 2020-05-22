package app2;
public class PrintMsg implements IPrintMsg{
	public void sayHello1() { System.out.println("Hello AOP1");}
	public void sayHello2() {System.out.println("Hello AOP2");}		//sayhello1이 호출될시 hello aop1 sysout
																	//sayhello2가 호출될시 hello aop2 sysout
}