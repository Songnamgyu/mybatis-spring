package com.greedy.chap01.section01.connection.xmlconfig;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

public interface GoodsDAO {

	List<GoodsDTO> selectGoodsList(SqlSessionTemplate sqlSession);
	
	

}
