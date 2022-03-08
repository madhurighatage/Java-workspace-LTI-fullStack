package com.javainuse.aspect;
import org.aspectj.lang.annotation.AdviceName;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;


@Component
@Aspect
@EnableAspectJAutoProxy
public class Human {
	
	//@Before(value="execution(public void study(..))")
	@Before(value="pointCutA() ")
	public void wakeUp()
	{
		System.out.println(" Good Morning ");
	}
	
	//@After(value="execution(public void study(..))")
	@After(value="pointCutA() ")
	public void sleep()
	{
		System.out.println(" Good night ");
	}

	@Pointcut(value="execution(* com.javainuse.service.StudentService.*(..))")
	public void pointCutA() {
		
	}
	
	
}