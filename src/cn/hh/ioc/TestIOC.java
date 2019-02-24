package cn.hh.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIOC {
	@Test
	public void testUser() {
		//1 ����spring�����ļ������ݴ�������
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("bean1.xml");
		//2 �õ����ô����Ķ���
		UserService userService = (UserService) context.getBean("userService");
		userService.add();
	}
}
