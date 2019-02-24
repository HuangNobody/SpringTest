package com.springinaction.springidol;

public class PoeticJuggler extends Juggler{
	
	private Poem poem;//注入Poem
	
	public PoeticJuggler(Poem poem){
		super();
		this.poem = poem;
	}
	
	public PoeticJuggler(int beanBags, Poem poem){//注入豆袋子数量和Poem
		super();
		this.poem = poem;
	}
	
	public void perform(){
		super.perform();
		System.out.println("While reciting...");
		poem.recite();
	}
}
