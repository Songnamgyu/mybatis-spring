package com.greedy.chap01.section01.connection.javaconfig;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service("goodsService")
public class GoodsServiceImpl implements GoodsService{
	
	private final GoodsDAO goodsDAO;
	private final SqlSessionTemplate sqlSession;	
	
	@Autowired
	//생성자 주입
	public GoodsServiceImpl(GoodsDAO goodsDAO, SqlSessionTemplate sqlSession) {
		this.goodsDAO = goodsDAO;
		this.sqlSession =sqlSession;
	}
	@Override
	public List<GoodsDTO> selectgoodsList() {
		
		return goodsDAO.selectGoodsList(sqlSession);
	}

}
