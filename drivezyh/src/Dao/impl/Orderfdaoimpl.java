package Dao.impl;

import java.sql.Connection;

import Dao.Orderfdao;
import Entity.Orderlist;
import zyh.DBUtil;

public class Orderfdaoimpl implements Orderfdao {

	@Override
	public void addorderf(Orderlist Orderlist) {
		Connection conn=DBUtil.getConn();
		String sql ="insert into orderlist values(null,?,?,?,?,?,?,?,?,now())";
		DBUtil.executeUpdate(sql, conn,Orderlist.getCoachname(),Orderlist.getUsername(),Orderlist.getOrderyear(),Orderlist.getOrdermonth(),Orderlist.getOrderday(),Orderlist.getOrdertime(),Orderlist.getOrdersec(),Orderlist.getOrderadname(),Orderlist.getOktime());
		DBUtil.closeConn(conn);
	}

}
