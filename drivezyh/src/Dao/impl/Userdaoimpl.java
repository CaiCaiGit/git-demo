package Dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Dao.Userdao;
import Entity.UserList;
import zyh.DBUtil;

public class Userdaoimpl implements Userdao {
	//查询所有
	@Override
	public List<UserList> findall() {
		List<UserList> userlist =new ArrayList<UserList>();
		Connection conn =DBUtil.getConn();
		try {
		String sql="select * from userlist";
		ResultSet rs =DBUtil.executeQuery(sql, conn);
		
			while(rs.next()){
				UserList user=new UserList(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7));
				userlist.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
			finally {
				DBUtil.closeConn(conn);
			}
		return userlist;
	}
	//根据标识号删除
	@Override
	public void deleteByUserId(int userId) {
		Connection conn=DBUtil.getConn();
		String sql ="delete from userlist where userId=?";
		DBUtil.executeUpdate(sql, conn, userId);
		DBUtil.closeConn(conn);
	}
	//添加
	@Override
	public void addUser(UserList userlist) {
		Connection conn=DBUtil.getConn();
		String sql="insert into userlist values(null,?,?,?,?,?,?)";
		DBUtil.executeUpdate(sql, conn,userlist.getUsername(),userlist.getUsercard(),userlist.getUserpw(),userlist.getUserschool(),userlist.getUserdec(),userlist.getUsermo());
		DBUtil.closeConn(conn);
	}
	//修改
	@Override
	public void updateUser(UserList userList) {
		Connection conn=DBUtil.getConn();
		String sql="update userlist  set  username=?,usercard=?,userpw=?,userschool=?,userdec=?, usermo=? where userId=?";
		DBUtil.executeUpdate(sql, conn,userList.getUsername(),userList.getUsercard(),userList.getUserpw(),userList.getUserschool(),userList.getUserdec(),userList.getUsermo(),userList.getUserId());
		DBUtil.closeConn(conn);
	}
	//根据userId查询
		@Override
		public  UserList finduserbyid(int userId) {
				UserList userlist =null;
				Connection conn=DBUtil.getConn();
				try {
					String sql="select * from userlist where userId=?";
					ResultSet rs=DBUtil.executeQuery(sql, conn, userId);
					if(rs.next()) {
						userlist =new UserList(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),  rs.getInt(7));
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}finally {
					DBUtil.closeConn(conn);
				}
				return userlist;

		}
		@Override
		public UserList finduserbycard(String usercard) {
			UserList userlist =null;
			Connection conn=DBUtil.getConn();
			try {
				String sql="select * from userlist where usercard=?";
				ResultSet rs=DBUtil.executeQuery(sql, conn, usercard);
				if(rs.next()) {
					userlist =new UserList(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6),  rs.getInt(7));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				DBUtil.closeConn(conn);
			}
			return userlist;
		}


}
