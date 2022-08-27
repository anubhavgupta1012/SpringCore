package com.aop.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class WildCardAspect {

    @Before("ABC()&&ABC2()")
    public void DoSomthing() {
        System.out.println("This is the aspect");
    }

    @Before("ABC()")
    public void DoSomthing2() {
        System.out.println("this is method 2");
    }

    @Pointcut("execution( * get*())")
    public void ABC() {
    }


    @Pointcut("within(com.model.*)")
    public void ABC2() {
    }

    @Before("args(name)")
    public void ArgsMethod(String name) {
        System.out.println(name + " Was Argumented ");
    }

//		@Before("ABC2()")
//		public void asd() {
//			System.out.println("my name is khan");
//			}
}