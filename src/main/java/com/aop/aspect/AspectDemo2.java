package com.aop.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AspectDemo2 {

    @AfterReturning(pointcut = "execution(public * ABC())", returning = "asd")
    public void Do(Object asd) {
        System.out.println("From Do");
        System.out.println(asd);
    }
}
		

