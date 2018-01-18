package com.spring.myfirst;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import com.hello2.Application;
public class appMain {
	public static void main(String []args){
//		AbstractApplicationContext  context1 = new ClassPathXmlApplicationContext("saybeans.xml");
       ApplicationContext context1 = new FileSystemXmlApplicationContext("E:/Project/Java/springFrameworkStudy/src/main/resources/saybeans.xml");
		System.out.println("create context1");
		sayHello printer1= (sayHello) context1.getBean("sayhello");
		printer1.tosay();

//		context1.registerShutdownHook(); //用来在非web应用中关闭IoC容器的...
	}
}
