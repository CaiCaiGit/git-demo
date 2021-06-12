package Dao;

import java.util.List;


import Entity.Orderlist;

public interface Orderlistdao {
	public List<Orderlist> findall();
	public void deletebyorderId(int orderId);
	public Orderlist findbycoachId(int coachId);
	public Orderlist findbyuserId(int userId);
	public Orderlist findbyorderym(int orderym);




}
