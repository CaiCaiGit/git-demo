package Service;

import java.util.List;

import Entity.Orderplanlist;

public interface Orderplanservice {
	public List<Orderplanlist> findall();
	public void deleteorderplanId(int orderplanId);
	public void addorderplan(Orderplanlist orderplanlist);
	public void updateorderplan(Orderplanlist orderplanlist);
	public Orderplanlist finduserbyid(int orderplanId);
}
