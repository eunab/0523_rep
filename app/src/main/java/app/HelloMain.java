package app;

import org.springframework.aop.framework.ProxyFactory;
public class HelloMain{
	public static void main(String[] args) {
		IPrintMsg target = new PrintMsg();		// Ÿ���� printmsg�� ����
		ProxyFactory pf = new ProxyFactory();	// ���Ͻ� ���� �󲮵��� ����(?)
		pf.addAdvice(new MyAroundAdvice());		// ��� add(?)
		pf.setTarget(target);					// ������ Ÿ���� ���Ͻÿ� ����
		
		PrintMsg proxy = (PrintMsg)pf.getProxy();	// ���Ͻ� ����
		proxy.sayHello();	//Ÿ�ٿ� �����Ѱ��� sayhello�� ����
	}
}