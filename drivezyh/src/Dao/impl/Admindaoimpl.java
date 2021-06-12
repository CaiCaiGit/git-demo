package Dao.impl;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Dao.Admindao;
import Entity.Admin;
import Entity.UserList;
import zyh.DBUtil;


public class Admindaoimpl implements Admindao {
	//查询用户名和密码
	@Override
	public Admin findByNaP(int adminId, String adminpw) {
		Admin admin = null;
		Connection conn = DBUtil.getConn();

		try {
			String sql = "select * from admin where adminId=? and adminpw=?";
			ResultSet rs = DBUtil.executeQuery(sql,conn, adminId, adminpw);
				if(rs.next()) {
					admin = new Admin(rs.getInt(1),rs.getString(2),rs.getString(3));
				} 
				return admin;
			} catch (SQLException e) {
				e.printStackTrace();
			}
			finally {
				DBUtil.closeConn(conn);
			}
		return admin;
	}

	
	//查询所有
	@Override
	public List<Admin> findalladmin() {
		List<Admin> admin =new ArrayList<Admin>();
		Connection conn =DBUtil.getConn();
		try {
		String sql="select * from admin";
		ResultSet rs =DBUtil.executeQuery(sql, conn);
		
			while(rs.next()){
				Admin ad=new Admin(rs.getInt(1), rs.getString(2), rs.getString(3));
				admin.add(ad);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
			finally {
				DBUtil.closeConn(conn);
			}
		return admin;
	}

	

}
