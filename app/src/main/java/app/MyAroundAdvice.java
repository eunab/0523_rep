package app;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAroundAdvice implements MethodInterceptor{
	public Object invoke(MethodInvocation invocation)
	throws Throwable{
		System.out.println("�޼ҵ� ������ �ȳ�");		// �޼ҵ� ���� ���� �˸� sysout
		Object ret = invocation.proceed();		// MethodInvocation���� �����ϴ� proceed�Լ��� ���ƴ�
												// ���� Ÿ�� Ŭ������ �޼ҵ尡 ȣ�� ��(���� Ÿ�� = printmsg ��� printmsg�� ���� ����)
		System.out.println("�޼ҵ� ������ �ȳ�...");	// �޼ҵ� ���� ���� �˸� sysout
		
		return ret;
	}
}