package com.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AspectDemo {

    @Before("execution(public * get*())")
    public void DoSomthing() {
        System.out.println("This is the aspect2");
    }
}