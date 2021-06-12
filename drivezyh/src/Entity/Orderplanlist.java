package Entity;

public class Orderplanlist {
	private int orderplanId;
	private int orderyear;
	private int ordermonth;
	private int orderday;
	private String ordertime;
	private String coachname;
	private String orderadname;
	private String ordersec;
	
	public Orderplanlist() {
		super();
	}
	public Orderplanlist(int orderplanId, int orderyear, int ordermonth, int orderday, String ordertime,
			String coachname, String orderadname, String ordersec) {
		super();
		this.orderplanId = orderplanId;
		this.orderyear = orderyear;
		this.ordermonth = ordermonth;
		this.orderday = orderday;
		this.ordertime = ordertime;
		this.coachname = coachname;
		this.orderadname = orderadname;
		this.ordersec = ordersec;
	}
	public int getOrderplanId() {
		return orderplanId;
	}
	public void setOrderplanId(int orderplanId) {
		this.orderplanId = orderplanId;
	}
	public int getOrderyear() {
		return orderyear;
	}
	public void setOrderyear(int orderyear) {
		this.orderyear = orderyear;
	}
	public int getOrdermonth() {
		return ordermonth;
	}
	public void setOrdermonth(int ordermonth) {
		this.ordermonth = ordermonth;
	}
	public int getOrderday() {
		return orderday;
	}
	public void setOrderday(int orderday) {
		this.orderday = orderday;
	}
	public String getOrdertime() {
		return ordertime;
	}
	public void setOrdertime(String ordertime) {
		this.ordertime = ordertime;
	}
	public String getCoachname() {
		return coachname;
	}
	public void setCoachname(String coachname) {
		this.coachname = coachname;
	}
	public String getOrderadname() {
		return orderadname;
	}
	public void setOrderadname(String orderadname) {
		this.orderadname = orderadname;
	}
	public String getOrdersec() {
		return ordersec;
	}
	public void setOrdersec(String ordersec) {
		this.ordersec = ordersec;
	}
	
	
	
}
