package Entity;

public class Ordertimelist {
	private int ordertimeId;
	private String ordertime;
	
	public Ordertimelist() {
		super();
	}
	public Ordertimelist(int ordertimeId, String ordertime) {
		super();
		this.ordertimeId = ordertimeId;
		this.ordertime = ordertime;
	}
	public int getOrdertimeId() {
		return ordertimeId;
	}
	public void setOrdertimeId(int ordertimeId) {
		this.ordertimeId = ordertimeId;
	}
	public String getOrdertime() {
		return ordertime;
	}
	public void setOrdertime(String ordertime) {
		this.ordertime = ordertime;
	}
	
}
