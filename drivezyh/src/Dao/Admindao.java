package Dao;

import java.util.List;

import Entity.Admin;

public interface Admindao {
	public Admin findByNaP(int adminId,String adminpw);
	public List<Admin> findalladmin();
}
