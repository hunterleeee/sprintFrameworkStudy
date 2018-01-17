package com.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //用@Configuration注解该类，等价 与XML中配置beans  与AnnotationConfigApplicationContext方法配合
@ComponentScan//？？？
public class Application {
	
	@Bean //产生一个Bean，然后交给Spring容器
	MessageService mockMessageService(){
		return new MessageService(){
			public String getMessage(){
				return "helloWorld";
			}
		};
	}


	public static void main(String [] args){
		ApplicationContext context=new AnnotationConfigApplicationContext(Application.class);
		MessagePrinter printer= context.getBean(MessagePrinter.class);
		printer.printMessage();
	}
}
