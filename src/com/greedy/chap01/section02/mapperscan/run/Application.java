package com.greedy.chap01.section02.mapperscan.run;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.greedy.chap01.section02.mapperscan.model.dto.GoodsDTO;
import com.greedy.chap01.section02.mapperscan.model.service.GoodsService;

public class Application {

	public static void main(String[] args) {
	
		ApplicationContext context = new GenericXmlApplicationContext("com/greedy/chap01/section02/mapperscan/config/spring-context.xml");
		
		GoodsService goodsService = context.getBean("goodsService", GoodsService.class);
		
		List<GoodsDTO> goodsList = goodsService.selectGoodsList();
		
		for(GoodsDTO goods : goodsList){
			System.out.println(goods);
		}
	}

}
