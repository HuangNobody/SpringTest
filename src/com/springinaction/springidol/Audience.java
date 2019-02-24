package com.springinaction.springidol;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {
	
	@Pointcut(
			"execution(* com.springinaction.springidol.Performer.perform(..))")
	public void performance(){             //定义切点
		
	}
	
	@Before("performance()")
	public void takeSeats(){    //表演之前
		System.out.println("The audience is taking their seats.");
	}
	
	@Before("performance()")
	public void turnOffCellphones(){   //表演之前
		System.out.println("The audience is turning off their cellphones.");      
	}
	
	@AfterReturning("performance()")
	public void applaud(){              //表演之后
		System.out.println("CLAP CLAP CLAP CLAP.");
	}
	
	@AfterThrowing("performance()")
	public void demandReFund(){         //表演失败之后
		System.out.println("Boo! We want out money back!");
	}
	
	@Around("performance()") //4.4.1注解环绕通知
	public void watchPerformance(ProceedingJoinPoint joinpoint){
		try{
			System.out.println("The audience is taking their seats.");
			System.out.println("The audience is turning off their cellphones.");
			long start = System.currentTimeMillis();
			
			joinpoint.proceed();//执行被通知的方法
			
			long end = System.currentTimeMillis();
			System.out.println("CLAP CLAP CLAP CLAP.");
			System.out.println("The performance took" + (end-start) + "milliseconds");
		}catch(Throwable t){
			System.out.println("Boo! We want out money back!");
		}
	}
	
	/**
	 * 	//watchPerformance()方法提供了AOP环绕通知
	 * 	public void watchPerformance(ProceedingJoinPoint joinpoint){
		try{
			System.out.println("The audience is taking their seats.");
			System.out.println("The audience is turning off their cellphones.");
			long start = System.currentTimeMillis();
			
			joinpoint.proceed();//执行被通知的方法
			
			long end = System.currentTimeMillis();
			System.out.println("CLAP CLAP CLAP CLAP.");
			System.out.println("The performance took" + (end-start) + "milliseconds");
		}catch(Throwable t){
			System.out.println("Boo! We want out money back!");
		}
	}
	 * @param joinpoint
	 */
	
	

}
