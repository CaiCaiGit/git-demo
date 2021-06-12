package Dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Dao.Orderlistdao;
import Entity.Orderlist;
import zyh.DBUtil;


public class Orderlistdaoimpl implements Orderlistdao {

	@Override
	public List<Orderlist> findall() {
		List<Orderlist> orderlist =new ArrayList<Orderlist>();
		Connection conn =DBUtil.getConn();
		try {
		String sql="select * from orderlist";
		ResultSet rs =DBUtil.executeQuery(sql, conn);
		
			while(rs.next()){
				Orderlist order=new Orderlist(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10));
				orderlist.add(order);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
			finally {
				DBUtil.closeConn(conn);
			}
		return orderlist;	}

	@Override
	public void deletebyorderId(int orderId) {
		Connection conn=DBUtil.getConn();
		String sql ="delete from orderlist where orderId=?";
		DBUtil.executeUpdate(sql, conn, orderId);
		DBUtil.closeConn(conn);
	}

	@Override
	public Orderlist findbycoachId(int coachId) {
		return null;
	}

	@Override
	public Orderlist findbyuserId(int userId) {
		return null;
	}

	@Override
	public Orderlist findbyorderym(int orderym) {
		// TODO Auto-generated method stub
		return null;
	}

}
