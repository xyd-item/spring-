package com.guigu.spring.mod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBySpring {
	public static void main(String[] args) {
		// 初始化容器
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		// Person person = (Person) ac.getBean("person");
		// 使用方法获取对象时，要求spring所管理的次类型的对象只能有一个
		Person person = ac.getBean(Person.class);

		System.out.println(person);

	}
}
