package Service;

import java.util.List;

import Entity.Ordertimelist;

public interface Ordertimeservice {
	public List<Ordertimelist> findall();
	public Ordertimelist findByordertimeId(int ordertimeId);
}
