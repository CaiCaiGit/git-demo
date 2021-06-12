package Dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

import Dao.Informdao;
import Entity.Inform;
import zyh.DBUtil;

public class Informdaoimpl implements Informdao {
	
	@Override
	public List<Inform> findall() {
		List<Inform> informlist =new ArrayList<Inform>();
		Connection conn =DBUtil.getConn();
		try {
			String sql="select * from informlist";
			ResultSet rs =DBUtil.executeQuery(sql, conn);
			while 
				(rs.next()) {
				 Inform inform=new Inform(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getDate(4));
				 informlist.add(inform);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return informlist;
	}

	@Override
	public void deleteByInformId(int Informid) {
		Connection conn=DBUtil.getConn();
		String sql="delete from Informlist where Informid=?";
		DBUtil.executeUpdate(sql, conn, Informid);
		DBUtil.closeConn(conn);
	}

	@Override
	public void addInform(Inform inform) {
		Connection conn=DBUtil.getConn();
		String sql="insert into Informlist values(null,?,?,now())";
		DBUtil.executeUpdate(sql, conn,inform.getInforname(),inform.getInfordec());
		DBUtil.closeConn(conn);
	}

	@Override
	public void updateInform(Inform inform) {
		// TODO Auto-generated method stub

	}

	@Override
	public Inform findInformbyId(int Informid) {
		// TODO Auto-generated method stub
		return null;
	}

}
