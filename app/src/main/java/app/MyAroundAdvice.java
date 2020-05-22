package app;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAroundAdvice implements MethodInterceptor{
	public Object invoke(MethodInvocation invocation)
	throws Throwable{
		System.out.println("메소드 실행전 안녕");		// 메소드 실행 시작 알림 sysout
		Object ret = invocation.proceed();		// MethodInvocation에서 지원하는 proceed함수가 사용됐다
												// 원래 타겟 클래스의 메소드가 호출 됨(현재 타겟 = printmsg 고로 printmsg의 내용 실행)
		System.out.println("메소드 실행후 안녕...");	// 메소드 실행 종료 알림 sysout
		
		return ret;
	}
}