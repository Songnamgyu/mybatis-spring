package com.greedy.chap01.section01.connection.xmlconfig;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;
@Repository("goodsDAO")
public class GoodsDAOImpl implements GoodsDAO {

	
	@Override
	public List<GoodsDTO> selectGoodsList(SqlSessionTemplate sqlSession) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("GoodsMapper.selectGoodsList");
	}

}
