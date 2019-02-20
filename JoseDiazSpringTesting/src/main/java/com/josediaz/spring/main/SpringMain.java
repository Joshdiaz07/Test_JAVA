package com.josediaz.spring.main;

import com.josediaz.spring.bean.MyCollection;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.josediaz.spring.service.CollectionService;
import com.josediaz.spring.service.MyCollectionService;

public class SpringMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

		System.out.println("Spring Context initialized");
		
		MyCollectionService service = ctx.getBean("myCollectionService", MyCollectionService.class);

		System.out.println("Bean retrieved from Spring Context");
		
		System.out.println("MyCollection Name="+service.getMyCollection().getName());
		
		ctx.close();
		System.out.println("Spring Context Closed");
	}

}
