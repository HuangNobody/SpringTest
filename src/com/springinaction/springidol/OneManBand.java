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
	
	public void setInstruments(Properties instruments){//��ʼsetInstruments�Ұ������s��д�ˣ�������ܳɹ�����bean
		this.instruments = instruments;       //��Map����ע��instrument
	}
}
