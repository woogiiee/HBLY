package edu.bit.hbly.vo;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class GoodsVOTest {

	@Test
	public void test() {
		GoodsVO goodsVO = new GoodsVO();
		
		System.out.println(goodsVO);
		assertNotNull(goodsVO);
	}
	
	public void testGoodsVOAllArgs() {
		GoodsVO goodsVO = new GoodsVO(1,"�׽�Ʈ��ǰ",1000,10,"��","����",new Date(),"101","����1");
				
			System.out.println(goodsVO);
			assertNotNull(goodsVO);
				
	}

}
