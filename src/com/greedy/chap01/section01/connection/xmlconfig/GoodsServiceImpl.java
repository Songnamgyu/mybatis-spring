package com.greedy.chap01.section01.connection.xmlconfig;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service("goodsService")
public class GoodsServiceImpl implements GoodsService{

	private GoodsDAO goodsDAO;
	private SqlSessionTemplate sqlSession;
	@Autowired
	public GoodsServiceImpl(GoodsDAO goodsDAO, SqlSessionTemplate sqlSession) {
		this.goodsDAO = goodsDAO;
		this.sqlSession = sqlSession;
	}
	
	@Override
	public List<GoodsDTO> selectGoodsList() {
	
			
		
		return goodsDAO.selectGoodsList(sqlSession);
	}

}
