package com.greedy.chap01.section01.connection.javaconfig;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository("goodsDAO")
public class GoodsDAOImpl implements GoodsDAO {

	@Override
	public List<GoodsDTO> selectGoodsList(SqlSessionTemplate sqlSession) {
	                                 //namespace. xml파일에 작성되어있는 sql이름
		return sqlSession.selectList("GoodsMapper.selectGoodsList");
	}

}
