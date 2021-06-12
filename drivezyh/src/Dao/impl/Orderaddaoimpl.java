package Dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Dao.Orderaddao;
import Entity.Orderadlist;
import zyh.DBUtil;


public class Orderaddaoimpl implements Orderaddao {

	@Override
	public List<Orderadlist> findall() {
		List<Orderadlist> orderadlist=new ArrayList<Orderadlist>();
		Connection conn =DBUtil.getConn();
		
		try {
			String sql="select * from orderadlist";
			ResultSet rs =DBUtil.executeQuery(sql, conn);
			while(rs.next()) {
				Orderadlist order=new Orderadlist(rs.getInt(1), rs.getString(2));
				orderadlist.add(order);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.closeConn(conn);
		}
		return orderadlist;
	}

	@Override
	public Orderadlist findByorderadId(int orderadId) {
		Orderadlist orderadlist=null;
		Connection conn =DBUtil.getConn();
		
		try {
			String sql="select * from orderadlist where orderadId=?";
			ResultSet rs =DBUtil.executeQuery(sql, conn,orderadId);
			if(rs.next()) {
				orderadlist=new Orderadlist(rs.getInt(1), rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.closeConn(conn);
		}
		return orderadlist;
	}
	}

