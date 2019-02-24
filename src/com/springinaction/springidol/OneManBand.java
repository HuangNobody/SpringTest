package com.springinaction.springidol;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

public class OneManBand implements Performer{
	
	private Properties instruments;
	
	public OneManBand(){};
	
	public void perform(){
		for(Entry<Object, Object> entry:instruments.entrySet()){
			System.out.println(entry.getKey() + " : " + entry.getValue().toString());
		}
	}
	
	public void setInstruments(Properties instruments){//开始setInstruments我把最后面s忘写了，结果不能成功创建bean
		this.instruments = instruments;       //以Map类型注入instrument
	}
}
