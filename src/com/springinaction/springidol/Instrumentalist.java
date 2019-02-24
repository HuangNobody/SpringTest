package com.springinaction.springidol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Springɨ��com.springinaction.springidol��ʱ���ᷢ��@Componentע������ע��Guitar,���Զ��ؽ���ע��ΪSpring Bean��
//ָ����һ��Bean ID��Ϊ@Componentע��Ĳ������ò�����ʾ����Ϊeddies
@Component("eddies")
public class Instrumentalist implements Performer{
	
	private String song;   //�����Ҫ����ĸ������֣���perform���������б��õ�
	private Instrument instrument;   // �����Գ�������ұ���ʱ��ʹ������������
	
	public Instrumentalist(){};
	
	public void perform(){
		System.out.print("Playing " + song + " : ");
		instrument.play(); 
	}
	
	public void setSong(String song){ //ע�����
		this.song = song;
	}
	
	public String getSong(){
		return song;
	}
	
	public String screamSong(){
		return song;
	}
	
	
	public void setInstrument(Instrument instrument){  // ע������
		this.instrument = instrument;
	}
}
