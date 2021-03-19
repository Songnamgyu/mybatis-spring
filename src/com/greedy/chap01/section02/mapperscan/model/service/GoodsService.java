package com.greedy.chap01.section02.mapperscan.model.service;

import java.util.List;

import com.greedy.chap01.section02.mapperscan.model.dto.GoodsDTO;

public interface GoodsService {

	List<GoodsDTO> selectGoodsList();
}
