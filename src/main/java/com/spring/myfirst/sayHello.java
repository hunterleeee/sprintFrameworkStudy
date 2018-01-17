package com.spring.myfirst;

class World{
	public void tosay(){
		System.out.println("hello my  world!");
	}
}

public class sayHello {
	final private World sayworld;
	private String name;
	public sayHello(World sayworld){
		this.sayworld=sayworld;

	}
	public void setname(String name){  //使用property配置一定要实现set方法 set方法的命名一定是set+xxx
		this.name=name;
	}
	public void getsay( ){
		System.out.print(this.name +" say : ");
		sayworld.tosay();
	}
}
