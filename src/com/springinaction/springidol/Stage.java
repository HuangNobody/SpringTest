//Stage����һ�����͵ĵ����ࡣһ����˵���������ʵ������ͨ����̬��������������
package com.springinaction.springidol;

public class Stage {
	
	private Stage(){}
	
	private static class StageSingletonHolder{
		static Stage instance = new Stage();  // �ӳټ���ʵ��
	}
	
	public static Stage getInstance(){
		return StageSingletonHolder.instance;  //��ʱʵ��
	}
}
