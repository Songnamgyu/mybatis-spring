package com.greedy.chap01.section02.mapperscan.model.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greedy.chap01.section02.mapperscan.model.dao.GoodsDAO;
import com.greedy.chap01.section02.mapperscan.model.dto.GoodsDTO;

@Service("goodsService")
public class GoodsServiceImpl implements GoodsService{

	private final SqlSession sqlSession;
	
	@Autowired
	public GoodsServiceImpl(GoodsDAO goodsDAO, SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<GoodsDTO> selectGoodsList() {
		
		
		return sqlSession.getMapper(GoodsDAO.class).selectGoodsList();
	}

}
