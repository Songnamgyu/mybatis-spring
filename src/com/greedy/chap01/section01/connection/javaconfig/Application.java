package com.greedy.chap01.section01.connection.javaconfig;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.greedy.chap01.section01.connection.javaconfig.config.ContextConfiguration;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);  	

		System.out.println("전체메뉴 조회");

		GoodsService goodsService = context.getBean("goodsService", GoodsService.class);
		
		List<GoodsDTO> goodsList = goodsService.selectgoodsList();
		for(GoodsDTO goods : goodsList) {
			System.out.println(goods);
		}
	
	}

}
