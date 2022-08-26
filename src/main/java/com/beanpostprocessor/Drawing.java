package com.beanpostprocessor;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Drawing {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		AbstractApplicationContext ac=new ClassPathXmlApplicationContext("postprocessor.xml");
			
		//BeanFactory ac=new XmlBeanFactory(new FileSystemResource("lifecycle.xml"));
		ac.registerShutdownHook();
		Triangle t = (Triangle) ac.getBean("triangle");
						t.draw();
		
	}

}
