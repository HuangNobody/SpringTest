package com.springinaction.springidol;

import org.springframework.stereotype.Component;

//Springɨ��com.springinaction.springidol��ʱ���ᷢ��@Componentע������ע��Guitar,
//���Զ��ؽ���ע��ΪSpring Bean��Bean��IDĬ��Ϊ���޶��������������龰�£�Guitar Bean��ID Ϊguitar
@Component  
public class Guitar implements Instrument{
	
	public Guitar(){};
	
	public void play(){
		System.out.println("gui tar");
	}
}
