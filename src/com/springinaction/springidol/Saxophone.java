package com.springinaction.springidol;

public class Saxophone implements Instrument{ // 只要乐器实现了Instrument接口，对象Kenny就可以用它演奏歌曲
	
	public Saxophone(){};
	
	public void play(){
		System.out.println("TOOT TOOT TOOT");
	}

}
