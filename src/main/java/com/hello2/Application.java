package com.hello2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Application {
	//现在的问题是如何处理下面的方法 因为它实现了MessageService接口
	MessageService mockMessageService(){
		return new MessageService(){
			public String getMessage(){
				return "hello World";
			}
		};
	}


	public static void main(String [] args){
		// 正常执行
//		Application app =new Application();
//		System.out.println(app.mockMessageService().getMessage());
//		System.out.println("over");
		
//		使用spring
		ApplicationContext context = new FileSystemXmlApplicationContext("E:/Project/Java/springFrameworkStudy/src/main/resources/hello2beans.xml");
		Application printer= (Application) context.getBean("Application");

		System.out.println(printer.mockMessageService());

		
	}
}
