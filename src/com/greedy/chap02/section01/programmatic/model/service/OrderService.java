package com.greedy.chap02.section01.programmatic.model.service;

import com.greedy.chap02.section01.programmatic.model.dto.OrderDTO;

public interface OrderService {
	
	/*주문을 등록하는 메소드*/
	
	int registOrder(OrderDTO order);

}
