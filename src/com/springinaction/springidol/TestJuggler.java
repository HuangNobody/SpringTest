package com.springinaction.springidol;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.hh.ioc.UserService;

public class TestJuggler {
	@Test
	public void test(){
		//1 ����spring�����ļ������ݴ�������
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("com/springinaction/springidol/spring-idol.xml");
		//2 �õ����ô����Ķ���
		Performer performer = (Performer) ctx.getBean("duke");
		//Performer performer1 = (Performer) ctx.getBean("poeticDuke");
		performer.perform();
		//performer1.perform();
		
		//TurnOnOrOff turn = (TurnOnOrOff) ctx.getBean("auditorium");
		
		//Performer performer2 = (Performer) ctx.getBean("Kenny2");
		//performer2.perform();
		
		Performer performer3 = (Performer) ctx.getBean("Kenny");
		performer3.perform();
		
		//Performer performer4 = (Performer) ctx.getBean("hank");
		//performer4.perform();
		
		//Performer performer5 = (Performer) ctx.getBean("car1");
		//performer5.perform();

	}
	
}
