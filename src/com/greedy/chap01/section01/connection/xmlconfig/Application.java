package com.greedy.chap01.section01.connection.xmlconfig;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("com/greedy/chap01/section01/connection/xmlconfig/config/spring-context.xml");
		
		System.out.println("chao01-xmlconfig이용한 조회");
		
		GoodsService goodsService = context.getBean("goodsService", GoodsService.class);
		
		List<GoodsDTO> goodsList = goodsService.selectGoodsList();
		
		for(GoodsDTO goods : goodsList) {
			System.out.println(goods);
		}
		
		

	}

}
