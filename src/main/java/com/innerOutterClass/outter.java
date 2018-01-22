package com.innerOutterClass;

import org.junit.Test;

public class outter {
	private String name="hunterleee";
	@Test
	public String getName() {
		System.out.println(name);
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void getinner(String name) {
		
	}
	

	class inner{
		@Test
		public void getname(){
			System.out.println(name);
		}
		public void setouter(){
			System.out.println(name);
		}
	}

 public static void main(String[]args){
	 outter o =new outter();
	 o.getName();
	  outter.inner i = o.new inner();  //想使用内部类 需要县创建外部类的实例
 }
}
