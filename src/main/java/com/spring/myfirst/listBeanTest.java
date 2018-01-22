package com.spring.myfirst;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class listBeanTest {
	public ArrayList<String> getList() {
		return list;
	}

	public void setList(ArrayList<String> list) {
		this.list = list;
	}

	public Set getHashset() {
		return hashset;
	}

	public void setHashset(HashSet<String> hashset) {
		this.hashset = hashset;
	}

	public Map getHashMap() {
		return hashmap;
	}

	public void setHashMap(HashMap<String, String> hashmap) {
		this.hashmap = hashmap;
	}

	ArrayList<String> list;
	Set hashset;
	Map hashmap;

	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("/springFrameworkStudy/WebContent/WEB-INF/classes/listbeanConfig.xml");
		listBeanTest ll = (listBeanTest)context.getBean("listbeantest");
		System.out.println(ll.getHashMap());
	}

}
