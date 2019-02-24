package com.springinaction.springidol;

import org.springframework.stereotype.Component;

//Spring扫描com.springinaction.springidol包时，会发现@Component注解所标注的Guitar,
//并自动地将它注册为Spring Bean。Bean的ID默认为无限定类名，在这种情景下，Guitar Bean的ID 为guitar
@Component  
public class Guitar implements Instrument{
	
	public Guitar(){};
	
	public void play(){
		System.out.println("gui tar");
	}
}
