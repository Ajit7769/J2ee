package com.jspiders.springcorexml.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.springcorexml.bean.CustomerBean;

public class ProCosMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("procosconfig.xml");
		
		CustomerBean bean = (CustomerBean) context.getBean("customer1");
		
		CustomerBean bean2 = (CustomerBean) context.getBean("customer2");
		System.out.println(bean);
		System.out.println(bean2);
		
		
		((ClassPathXmlApplicationContext)context).close();
		
	}
}
