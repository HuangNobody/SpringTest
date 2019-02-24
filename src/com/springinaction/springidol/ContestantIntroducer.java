package com.springinaction.springidol;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

//4.4.3 标注引入
@Aspect
public class ContestantIntroducer {
	
	@DeclareParents(         //混入Contestant接口
			value = "com.springinaction.springidol.Performer+",
			defaultImpl = GraciousContestant.class)
	public static Contestant contestant;
}
