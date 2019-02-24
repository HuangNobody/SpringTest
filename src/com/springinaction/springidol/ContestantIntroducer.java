package com.springinaction.springidol;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

//4.4.3 ��ע����
@Aspect
public class ContestantIntroducer {
	
	@DeclareParents(         //����Contestant�ӿ�
			value = "com.springinaction.springidol.Performer+",
			defaultImpl = GraciousContestant.class)
	public static Contestant contestant;
}
