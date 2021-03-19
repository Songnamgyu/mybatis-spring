package com.greedy.chap01.section02.mapperscan.model.dao;

import java.util.List;

import com.greedy.chap01.section02.mapperscan.model.dto.GoodsDTO;

public interface GoodsDAO {

	List<GoodsDTO> selectGoodsList();

}
