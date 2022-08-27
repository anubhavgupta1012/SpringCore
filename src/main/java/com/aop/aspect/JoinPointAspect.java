
package com.aop.aspect;



import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class JoinPointAspect {
	
	@Before("ABC2()")
	public void DoSomthing(JoinPoint jp) {
//		System.out.println("This is the aspect");
		System.out.println(jp);
		System.out.println(jp.getTarget());
	}
	

		
		@Pointcut("within(com.model.*)")
		public void ABC2() {}	
		
		@Before("args(name)")
		public void ArgsMethod(String name) {
			System.out.println(name+" Was Argumented ");
		}

		}
		
