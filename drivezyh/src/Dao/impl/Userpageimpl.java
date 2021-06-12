package Dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

import Dao.Userpage;
import Entity.Page;
import Entity.UserList;
import zyh.DBUtil;

public class Userpageimpl implements Userpage {

	@Override
	public int getuser() {
		int count =(Integer) null;
		Connection conn =DBUtil.getConn();
		String sql= "select count(*) as count from userlist";
		ResultSet rs =DBUtil.executeQuery(sql, conn);
		count = Integer.parseInt("rs");
		return count;
	}

	@Override
	public List<UserList> findbypage(Page page) {
		List<UserList> userlist =new ArrayList<UserList>();
		Connection conn =DBUtil.getConn();
		try {
			String sql="select * from user limit"+page.getBeginIndex()+", "+page.getEveryPage();
			ResultSet rs =DBUtil.executeQuery(sql, conn);
			while(rs.next()){
				UserList user=new UserList(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7));
				userlist.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			finally {
				DBUtil.closeConn(conn);
			}
		return userlist;
	}
		
	}

