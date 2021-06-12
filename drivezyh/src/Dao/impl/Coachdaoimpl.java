package Dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Dao.Coachdao;
import Entity.Coachlist;
import zyh.DBUtil;

public class Coachdaoimpl implements Coachdao {

	@Override
	public List<Coachlist> findall() {
		List<Coachlist> coachlist=new ArrayList<Coachlist>();
		Connection conn =DBUtil.getConn();
		try {
			String sql="select * from coachlist";
			ResultSet rs=DBUtil.executeQuery(sql, conn);
			while(rs.next()) {
				Coachlist coach=new Coachlist(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9));
				coachlist.add(coach);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			DBUtil.closeConn(conn);
		}
		return coachlist;
	}

	@Override
	public void deleteBycoachId(int coachId) {
		Connection conn=DBUtil.getConn();
		String sql ="delete from coachlist where coachId=?";
		DBUtil.executeUpdate(sql, conn, coachId);
		DBUtil.closeConn(conn);
	}

	@Override
	public void addcoach(Coachlist coachlist) {
		Connection conn=DBUtil.getConn();
		String sql="insert into coachlist values(null,?,?,?,?,?,?,?,?)";
		DBUtil.executeUpdate(sql, conn,coachlist.getCoachname(),coachlist.getCoachcard(),coachlist.getCoachsex(),coachlist.getCoachph(),coachlist.getCoachdec(),coachlist.getCoachcar(),coachlist.getCoachschool(),coachlist.getCoachmo());
		DBUtil.closeConn(conn);
	}

	@Override
	public void updatecoach(Coachlist coachlist) {
		Connection conn=DBUtil.getConn();
		String sql="update coachlist  set coachname=?,coachcard=?, coachsex=?,coachdec=?,coachcar=?,coachmo=? where coachId=?";
		DBUtil.executeUpdate(sql, conn, coachlist.getCoachname(),coachlist.getCoachcard(),coachlist.getCoachsex(),coachlist.getCoachdec(),coachlist.getCoachcar(),coachlist.getCoachmo(),coachlist.getCoachId());
		DBUtil.closeConn(conn);
	}

	@Override
	public Coachlist findcoachbyid(int coachId) {
		Coachlist coachlist=null;
		Connection conn=DBUtil.getConn();
		try {
			String sql="select * from coachlist where coachId=?";
			ResultSet rs=DBUtil.executeQuery(sql, conn, coachId);
			if(rs.next()) {
				coachlist =new Coachlist(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.closeConn(conn);
		}
		return coachlist;
	}

}
