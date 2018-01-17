package com.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // （把普通pojo实例化到spring容器中，相当于配置文件中的<bean id="" class=""/>）
public class MessagePrinter  {
	
	final private MessageService service;
	
	@Autowired //@Autowired 注释，它可以对类成员变量、方法及构造函数进行标注，完成自动装配的工作
	public MessagePrinter(MessageService service) {
		this.service =service;
	}
	
	public void printMessage(){
		System.out.println(this.service.getMessage());
	}

	}

