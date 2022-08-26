package com.useInterfaces;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Drawing {

	public static void main(String[] args) {

			//ApplicationContext ac=new ClassPathXmlApplicationContext("useInterfaces.xml");
		BeanFactory ac=new XmlBeanFactory(new FileSystemResource("useInterfaces.xml"));
		//Shape t = (Shape) ac.getBean("triangle");
		Shape t = (Shape) ac.getBean("circle");
						t.draw();
		///No Detailed Error is Shown till we are not using ApplicationContext
	}

}
