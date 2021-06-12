package Entity;

import java.sql.Date;

public class Inform {
	private int Informid;
	private String Inforname;
	private String Infordec;
	private Date Infortime;
	
	public Inform() {
		super();
	}
	public Inform(int informid, String inforname, String infordec, Date infortime) {
		super();
		Informid = informid;
		Inforname = inforname;
		Infordec = infordec;
		Infortime = infortime;
	}
	public int getInformid() {
		return Informid;
	}
	public void setInformid(int informid) {
		Informid = informid;
	}
	public String getInforname() {
		return Inforname;
	}
	public void setInforname(String inforname) {
		Inforname = inforname;
	}
	public String getInfordec() {
		return Infordec;
	}
	public void setInfordec(String infordec) {
		Infordec = infordec;
	}
	public Date getInfortime() {
		return Infortime;
	}
	public void setInfortime(Date infortime) {
		Infortime = infortime;
	}
}
