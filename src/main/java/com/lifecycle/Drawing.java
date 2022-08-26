package com.lifecycle;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Drawing {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		AbstractApplicationContext ac=new ClassPathXmlApplicationContext("lifecycle.xml");
			
		//BeanFactory ac=new XmlBeanFactory(new FileSystemResource("lifecycle.xml"));
		ac.registerShutdownHook();
		Triangle1 t = (Triangle1) ac.getBean("triangle1");
						t.draw();
		
	}

}
