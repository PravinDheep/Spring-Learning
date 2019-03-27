package com.springexamples;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.springexamples.beans.Test;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Resource r = new ClassPathResource("resources/spring.xml");
			BeanFactory factory = new XmlBeanFactory(r);
		//ApplicationContext factory1  = new ClassPathXmlApplicationContext("resources/spring.xml");
		
		
			//Test t1 = (Test)factory1.getBean("t");
			//Test t2 = (Test)factory1.getBean("t");
			//t1.hello();
			//t2.hello();
			//System.out.println(t1==t2);
		
		factory.getBean("t");
	}
}
