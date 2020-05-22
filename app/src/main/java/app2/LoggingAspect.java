package app2;

import org.aspectj.lang.ProceedingJoinPoint;
public class LoggingAspect{
	public void myAdvice(ProceedingJoinPoint pjp)
	throws Throwable{
		System.out.println("메소드 실행 전");
		Object ret = pjp.proceed();		//타겟 클래스에 신호 전달
		System.out.println("메소드 실행 후");
	}
}