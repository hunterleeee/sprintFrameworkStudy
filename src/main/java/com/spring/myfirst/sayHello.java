package com.spring.myfirst;

class World{
	public void tosay(){
		System.out.println("hello my  world!");
	}
}
class fatherC{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void tosay(){
		System.out.println("fatherC class :"+name);
	}
}
interface fatherInter{
	String name="fatherinter";
	public void tosay();
}
public class sayHello  {
	final private World sayworld;
	private String name;
	public innerC getInnername() {
		this.innername.print();
		return null;
	}
	public void setInnername(innerC innername) {
		this.innername = innername;
	}
	private innerC innername;
	public sayHello(World sayworld){
		System.out.println("in constructor...");
		this.sayworld=sayworld;
	}
	public void setname(String name){  //使用property配置一定要实现set方法 set方法的命名一定是set+xxx
		this.name=name;
	}
	public void getsay( ){
		System.out.print(this.name +" say : ");
		sayworld.tosay();
	}
	public void initForSay(){
		System.out.println("bean in init");
	}
	public void destroyForSay(){
		System.out.println("bean is destroy");
	}
	public void tosay(){
		System.out.println("sayHello Class : "+name);
	}
}

class innerC{
	void print(){
		System.out.println("i am innerC.print()");
	}
}
