package com.springinaction.springidol;

public class PoeticJuggler extends Juggler{
	
	private Poem poem;//ע��Poem
	
	public PoeticJuggler(Poem poem){
		super();
		this.poem = poem;
	}
	
	public PoeticJuggler(int beanBags, Poem poem){//ע�붹����������Poem
		super();
		this.poem = poem;
	}
	
	public void perform(){
		super.perform();
		System.out.println("While reciting...");
		poem.recite();
	}
}
