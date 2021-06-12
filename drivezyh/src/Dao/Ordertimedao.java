package Dao;

import java.util.List;

import Entity.Ordertimelist;




public interface Ordertimedao {
	public List<Ordertimelist> findall();
	public Ordertimelist findByordertimeId(int ordertimeId);
}
