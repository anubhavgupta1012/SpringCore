 package com.autowiring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Drawing {

	public static void main(String[] args) {

		BeanFactory ac=new XmlBeanFactory(new FileSystemResource("autowiring.xml"));
		Triangle t=(Triangle)ac.getBean("abc");
		Triangle t2=(Triangle)ac.getBean("abc");
		Triangle t3=(Triangle)ac.getBean("abc");
		System.out.println(t+"\n"+t2+"\n"+t3);
		t.draw();
	
	}

}
