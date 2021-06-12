package Dao;

import java.util.List;

import Entity.Orderadlist;

public interface Orderaddao {
	public List<Orderadlist> findall();
	public Orderadlist  findByorderadId(int orderadId);
}
