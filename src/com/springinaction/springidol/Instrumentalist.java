package com.springinaction.springidol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Spring扫描com.springinaction.springidol包时，会发现@Component注解所标注的Guitar,并自动地将它注册为Spring Bean。
//指定了一个Bean ID作为@Component注解的参数，该参数显示命名为eddies
@Component("eddies")
public class Instrumentalist implements Performer{
	
	private String song;   //演奏家要演奏的歌曲名字，在perform（）方法中被用到
	private Instrument instrument;   // 该属性持有演奏家表演时所使用乐器的引用
	
	public Instrumentalist(){};
	
	public void perform(){
		System.out.print("Playing " + song + " : ");
		instrument.play(); 
	}
	
	public void setSong(String song){ //注入歌曲
		this.song = song;
	}
	
	public String getSong(){
		return song;
	}
	
	public String screamSong(){
		return song;
	}
	
	
	public void setInstrument(Instrument instrument){  // 注入乐器
		this.instrument = instrument;
	}
}
