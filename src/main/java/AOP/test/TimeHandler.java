package AOP.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TimeHandler {
	public void printTime(){
		System.out.println("CurrentTime = " + System.currentTimeMillis());
	}
	
	public static void main(String[] args){
		 ApplicationContext ctx = new FileSystemXmlApplicationContext("E:\\Project\\Java\\springFrameworkStudy\\WebContent\\WEB-INF\\classes\\aop.xml");
		        
		    HelloWorld hw1 = (HelloWorld)ctx.getBean("helloWorldImpl1");
		    HelloWorld hw2 = (HelloWorld)ctx.getBean("helloWorldImpl2");
		    hw1.printHelloWorld();
		    System.out.println();
		    hw1.doPrint();
		    
		    System.out.println();
		    hw2.printHelloWorld();
		    System.out.println();
		    hw2.doPrint();
	}
}
