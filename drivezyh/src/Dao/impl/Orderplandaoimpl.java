package Dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Dao.Orderplandao;
import Entity.Orderplanlist;
import zyh.DBUtil;


public class Orderplandaoimpl implements Orderplandao {

	@Override
	public List<Orderplanlist> findall() {
		List<Orderplanlist> orderplanlist =new ArrayList<Orderplanlist>();
		Connection conn =DBUtil.getConn();
		try {
		String sql="select * from orderplan";
		ResultSet rs =DBUtil.executeQuery(sql, conn);
		
			while(rs.next()){
				Orderplanlist orderplan=new Orderplanlist(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8));
				orderplanlist.add(orderplan);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
			finally {
				DBUtil.closeConn(conn);
			}
		return orderplanlist;	
	}
	@Override
	public void deleteorderplanId(int orderplanId) {
		Connection conn=DBUtil.getConn();
		String sql ="delete from orderplan where orderplanId=?";
		DBUtil.executeUpdate(sql, conn, orderplanId);
		DBUtil.closeConn(conn);

	}

	@Override
	public void addorderplan(Orderplanlist orderplanlist) {
		Connection conn=DBUtil.getConn();
		String sql ="insert into orderplan values(null,?,?,?,?,?,?,?)";
		DBUtil.executeUpdate(sql, conn,orderplanlist.getOrderyear(),orderplanlist.getOrdermonth(),orderplanlist.getOrderday(),orderplanlist.getOrdertime(),orderplanlist.getCoachname(),orderplanlist.getOrderadname(),orderplanlist.getOrdersec());
		DBUtil.closeConn(conn);

	}

	@Override
	public void updateorderplan(Orderplanlist orderplanlist) {

	}

	@Override
	public Orderplanlist finduserbyid(int orderplanId) {
		Orderplanlist orderplanlist=null;
		Connection conn =DBUtil.getConn();
		try {
		String sql="select * from orderplan where orderplanId=?";
		ResultSet rs =DBUtil.executeQuery(sql, conn,orderplanId);
		
			if(rs.next()){
				orderplanlist=new Orderplanlist(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
			finally {
				DBUtil.closeConn(conn);
			}
		return orderplanlist;	
	}

}
