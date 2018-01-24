package com.spring.myfirst;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class listBeanTest {
	public ArrayList<String> getList() {
		return list;
	}

	public void setList(ArrayList<String> list) {
		this.list = list;
	}

	public Set gethashset() {
		return hashset;
	}

	public void sethashset(HashSet<String> hashset) {
		this.hashset = hashset;
	}

	public Map gethashmap() {
		return hashmap;
	}

	public void sethashmap(HashMap<String, String> hashmap) {
		this.hashmap = hashmap;
	}

	ArrayList<String> list;
	Set hashset;
	Map hashmap;

	public static void main(String[] args) {
//		ApplicationContext context =new ClassPathXmlApplicationContext("springFrameworkStudy/WebContent/WEB-INF/classes/listbeanConfig.xml");  //classpath resource找不到
	    ApplicationContext context = new FileSystemXmlApplicationContext("E:\\Project\\Java\\springFrameworkStudy\\WebContent\\WEB-INF\\classes\\listbeanConfig.xml");

		listBeanTest ll = (listBeanTest)context.getBean("listbeantest");
		System.out.println(ll.getList());
		System.out.println(ll.gethashset());
		System.out.println(ll.gethashmap());
	}

}
