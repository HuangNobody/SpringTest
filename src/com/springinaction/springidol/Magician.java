package com.springinaction.springidol;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Magician implements MindReader{
	
	private String thoughts;
	
	@Pointcut("execution(* com.springinaction.springidol."           //�������������е�
			+ "Thinker.thinkOfSomething(String) && args(thoughts)")
	public void thinking(String thoughts){	
	}
	
	@Before("thinking(thoughts)")        //�Ѳ������ݸ�֪ͨ
	public void interceptThoughts(String thoughts){
		System.out.println("Intercepting volunter's thoughts");
		this.thoughts = thoughts;
	}
	
	public String getThoughts(){
		return thoughts;
	}
	
	/**
	 * 	public void interceptThoughts(Str��ing thoughts){
		System.out.println("Intercepting volunter's thoughts");
		this.thoughts = thoughts;
	}
	
	public String getThoughts(){
		return thoughts;
	}
	 */


}
