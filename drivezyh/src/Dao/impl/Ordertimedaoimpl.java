package Dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Dao.Ordertimedao;

import Entity.Ordertimelist;
import zyh.DBUtil;

public class Ordertimedaoimpl implements Ordertimedao {

	@Override
	public List<Ordertimelist> findall() {
		List<Ordertimelist> ordertimelist=new ArrayList<Ordertimelist>();
		Connection conn =DBUtil.getConn();
		
		try {
			String sql="select * from ordertimelist";
			ResultSet rs =DBUtil.executeQuery(sql, conn);
			while(rs.next()) {
				Ordertimelist order=new Ordertimelist(rs.getInt(1), rs.getString(2));
				ordertimelist.add(order);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.closeConn(conn);
		}
		return ordertimelist;
	}

	@Override
	public Ordertimelist findByordertimeId(int ordertimeId) {
		Ordertimelist ordertimelist=null;
		Connection conn =DBUtil.getConn();
		
		try {
			String sql="select * from ordertimelist where ordertimeId=?";
			ResultSet rs =DBUtil.executeQuery(sql, conn,ordertimeId);
			if(rs.next()) {
				ordertimelist =new Ordertimelist(rs.getInt(1), rs.getString(2));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.closeConn(conn);
		}
		return ordertimelist;
	}

}
