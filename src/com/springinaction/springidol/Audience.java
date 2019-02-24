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
	public void performance(){             //�����е�
		
	}
	
	@Before("performance()")
	public void takeSeats(){    //����֮ǰ
		System.out.println("The audience is taking their seats.");
	}
	
	@Before("performance()")
	public void turnOffCellphones(){   //����֮ǰ
		System.out.println("The audience is turning off their cellphones.");      
	}
	
	@AfterReturning("performance()")
	public void applaud(){              //����֮��
		System.out.println("CLAP CLAP CLAP CLAP.");
	}
	
	@AfterThrowing("performance()")
	public void demandReFund(){         //����ʧ��֮��
		System.out.println("Boo! We want out money back!");
	}
	
	@Around("performance()") //4.4.1ע�⻷��֪ͨ
	public void watchPerformance(ProceedingJoinPoint joinpoint){
		try{
			System.out.println("The audience is taking their seats.");
			System.out.println("The audience is turning off their cellphones.");
			long start = System.currentTimeMillis();
			
			joinpoint.proceed();//ִ�б�֪ͨ�ķ���
			
			long end = System.currentTimeMillis();
			System.out.println("CLAP CLAP CLAP CLAP.");
			System.out.println("The performance took" + (end-start) + "milliseconds");
		}catch(Throwable t){
			System.out.println("Boo! We want out money back!");
		}
	}
	
	/**
	 * 	//watchPerformance()�����ṩ��AOP����֪ͨ
	 * 	public void watchPerformance(ProceedingJoinPoint joinpoint){
		try{
			System.out.println("The audience is taking their seats.");
			System.out.println("The audience is turning off their cellphones.");
			long start = System.currentTimeMillis();
			
			joinpoint.proceed();//ִ�б�֪ͨ�ķ���
			
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
