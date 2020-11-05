package edu.bit.hbly.dao;

import java.util.List;

import edu.bit.hbly.vo.CategoryVO;
import edu.bit.hbly.vo.GoodsReplyListVO;
import edu.bit.hbly.vo.GoodsVO;
import edu.bit.hbly.vo.GoodsViewVO;
import edu.bit.hbly.vo.OrderListVO;
import edu.bit.hbly.vo.OrderVO;



public interface AdminDAO {
	
	
	//카테고리
	public List<CategoryVO> category() throws Exception;
	
	//��ǰ���
	public void register(GoodsVO vo) throws Exception;
	
	//?��?�� 목록
	public List<GoodsViewVO> goodslist() throws Exception;
	
	//?��?�� 조회
	public GoodsViewVO goodsView(int goodsNumber) throws Exception;
	
	//��ǰ����
	public void goodsModify(GoodsVO vo) throws Exception;
	
	//��ǰ����
	public void goodsDelete(int goodsNumber) throws Exception;
	
	//�ֹ� ���
	public List<OrderVO> orderList() throws Exception;
	
	//Ư�� �ֹ� ���
	public List<OrderListVO> orderView(OrderVO order) throws Exception;
	
	//��� ����
	public void delivery(OrderVO order) throws Exception;
	
	//��ǰ ���� ����
	public void changeStock(GoodsVO goods) throws Exception;
	
	//��� �Ұ�(���) ����
	public List<GoodsReplyListVO> allGoodsReply() throws Exception;
	
	//�Ұ�(���) ����
	public void deleteGoodsReply(int goodsReplyNumber) throws Exception;
}
