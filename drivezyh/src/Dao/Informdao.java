package Dao;

import java.util.List;

import Entity.Inform;



public interface Informdao {
	public List<Inform> findall();
	public void deleteByInformId(int Informid);
	public void addInform(Inform inform);
	public void updateInform(Inform inform);
	public Inform findInformbyId(int Informid);
}
