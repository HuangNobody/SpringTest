//Stage类是一个典型的单例类。一般来说，单例类的实例智能通过静态工厂方法来创建
package com.springinaction.springidol;

public class Stage {
	
	private Stage(){}
	
	private static class StageSingletonHolder{
		static Stage instance = new Stage();  // 延迟加载实例
	}
	
	public static Stage getInstance(){
		return StageSingletonHolder.instance;  //返时实例
	}
}
