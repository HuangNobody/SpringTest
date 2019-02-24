package com.springinaction.springidol;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Magician implements MindReader{
	
	private String thoughts;
	
	@Pointcut("execution(* com.springinaction.springidol."           //声明参数化的切点
			+ "Thinker.thinkOfSomething(String) && args(thoughts)")
	public void thinking(String thoughts){	
	}
	
	@Before("thinking(thoughts)")        //把参数传递给通知
	public void interceptThoughts(String thoughts){
		System.out.println("Intercepting volunter's thoughts");
		this.thoughts = thoughts;
	}
	
	public String getThoughts(){
		return thoughts;
	}
	
	/**
	 * 	public void interceptThoughts(Str你ing thoughts){
		System.out.println("Intercepting volunter's thoughts");
		this.thoughts = thoughts;
	}
	
	public String getThoughts(){
		return thoughts;
	}
	 */


}
