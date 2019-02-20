package com.josediaz.spring.service;

import com.josediaz.spring.bean.MyCollection;

public class MyCollectionService{

	private MyCollection myCollection;

	public MyCollection getMyCollection() {
		return myCollection;
	}

	public void setMyCollection(MyCollection myCollection) {
		this.myCollection = myCollection;
	}
	
	public MyCollectionService(){
		System.out.println("MyCollectionService no-args constructor called");
	}

	public void destroy() throws Exception {
		System.out.println("MyCollectionService Closing resources");
	}

	public void init() throws Exception {
		System.out.println("MyCollectionService initializing to dummy value");
		if(myCollection.getName() == null){
			myCollection.setName("Pankaj");
		}
	}
}
