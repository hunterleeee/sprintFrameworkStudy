package com.spring.myfirst;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import com.hello2.Application;
public class appMain {
	public static void main(String []args){
		ApplicationContext context = new FileSystemXmlApplicationContext("E:/Project/Java/springFrameworkStudy/src/main/resources/saybeans.xml");
		sayHello printer1= (sayHello) context.getBean("sayhello");
		printer1.getsay();
		sayHello printer2= (sayHello) context.getBean("sayhello");
		printer2.setname("onlyhun");
		printer2.getsay();
		printer1.getsay();
	}
}
