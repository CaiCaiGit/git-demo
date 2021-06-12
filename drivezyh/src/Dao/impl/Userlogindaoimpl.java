package Dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Dao.Userlogindao;
import Entity.UserList;
import zyh.DBUtil;

public class Userlogindaoimpl implements Userlogindao {

	@Override
	public UserList findBycap(String usercard, String userpw) {
		UserList userList = null;
		Connection conn = DBUtil.getConn();

		try {
			String sql = "select * from userlist where usercard=? and userpw=?";
			ResultSet rs = DBUtil.executeQuery(sql,conn, usercard, userpw);
				if(rs.next()) {
					userList = new UserList(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7));
				} 
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			finally {
				DBUtil.closeConn(conn);
			}
		return userList;
	}

	@Override
	public List<UserList> findalluser() {
		List<UserList> userList=new ArrayList<UserList>();
		Connection conn = DBUtil.getConn();

		try {
			String sql = "select * from userlist ";
			ResultSet rs = DBUtil.executeQuery(sql,conn);
				while(rs.next()) {
					UserList user = new UserList(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7));
					userList.add(user);
				} 
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			finally {
				DBUtil.closeConn(conn);
			}
		return userList;

	}

}
