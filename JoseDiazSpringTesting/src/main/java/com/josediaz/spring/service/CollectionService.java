package com.josediaz.spring.service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import com.josediaz.spring.bean.MyCollection;

public class CollectionService implements InitializingBean, DisposableBean{

	private MyCollection myCollection;

	public MyCollection getCollection() {
		return myCollection;
	}

	public void setCollection(MyCollection myCollection) {
		this.myCollection = myCollection;
	}
	
	public CollectionService(){
		System.out.println("MyCollection no-args constructor called");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("MyCollection Closing resources");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("MyCollection initializing to dummy value");
		if(myCollection.getName() == null){
			myCollection.setName("Pankaj");
		}
	}
}
