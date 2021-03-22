package com.greedy.chap02.section01.programmatic.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		
		/*mybatis-spring환경에서는 SqlSession.commit과 rollback은 오류난다.*/
		
		ApplicationContext context = new GenericXmlApplicationContext("com/greedy/chap02/section01/programmatic/config/spring-context.xml");
		

	}

}
