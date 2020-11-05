package edu.bit.hbly.dao;

import java.util.List;

import edu.bit.hbly.vo.CartListVO;
import edu.bit.hbly.vo.CartVO;
import edu.bit.hbly.vo.CategoryVO;
import edu.bit.hbly.vo.GoodsReplyListVO;
import edu.bit.hbly.vo.GoodsReplyVO;
import edu.bit.hbly.vo.GoodsViewVO;
import edu.bit.hbly.vo.OrderDetailsVO;
import edu.bit.hbly.vo.OrderListVO;
import edu.bit.hbly.vo.OrderVO;

public interface ShopDAO {
	
	
//	ī�װ��� ��ǰ����Ʈ : 1���з�
	public List<GoodsViewVO> list(int categoryCode, int categoryCodeRef) throws Exception;
	
//	ī�װ��� ��ǰ����Ʈ : 2���з�
	public List<GoodsViewVO> list(int categoryCode) throws Exception;
	
	//��ǰ ��ȸ
	public GoodsViewVO goodsView(int goodsNumber) throws Exception;
	
	//��ǰ �Ұ�(���) �ۼ�
	public void registerGoodsReply(GoodsReplyVO goodsReply) throws Exception;
	
	//��ǰ �Ұ�(���) ����Ʈ
	public List<GoodsReplyListVO> goodsReplyList(int goodsNumber) throws Exception;
	
	//��ǰ �Ұ�(���) ����
	public void deleteGoodsReply(GoodsReplyVO goodsReply) throws Exception;
	
	//���̵� üũ
	public String checkGoodsReplyUserId(int goodsReplyNumber) throws Exception;
	
	//��ǰ �Ұ�(���) ����
	public void modifyGoodsReply(GoodsReplyVO goodsReply) throws Exception;
	
	//��ٱ��� ���
	public void addCart(CartListVO cart) throws Exception;
	
	//��ٱ��� ����Ʈ
	public List<CartListVO> cartList(String userId) throws Exception;
	
	//��ٱ��� ����
	public void deleteCart(CartVO cart) throws Exception;
	
	//�ֹ� ����
	public void orderInfo(OrderVO order) throws Exception;
	
	//�ֹ� �� ����
	public void orderInfo_Details(OrderDetailsVO orderDetails) throws Exception;
	
	//īƮ ����
	public void cartAllDelete(String userId) throws Exception;
	
	//�ֹ� ���
	public List<OrderVO> orderList(OrderVO order) throws Exception;
	
	//Ư�� �ֹ� ���
	public List<OrderListVO> orderView(OrderVO order) throws Exception;

	//ī�װ� ��������
	public List<CategoryVO> getCategoryList() throws Exception;
	
}
