package es.upm.dit.isst.webLab.dao;

import java.util.Collection;

import es.upm.dit.isst.webLab.model.TFG;

public interface TFGDAO {
	
	public void create(TFG tfg);
	
	public TFG read(String email);
	
	public void update(TFG tfg);
	
	public void delete(TFG tfg);
	
	public Collection<TFG> readAll();
}
