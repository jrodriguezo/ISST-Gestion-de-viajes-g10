package es.upm.dit.isst.webLab.dao;

import java.util.Collection;

import org.hibernate.Session;

import es.upm.dit.isst.webLab.model.TFG;

public class TFGDAOImplementation implements TFGDAO {
	
	private static TFGDAOImplementation instancia = null;
	private TFGDAOImplementation() {}
	public static TFGDAOImplementation getInstance() {
		if(instancia == null)
			instancia = new TFGDAOImplementation();
		return instancia;
	}
	
	@Override
	public void create(TFG tfg) {
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction();
			session.save(tfg);
			session.getTransaction().commit();
		} catch (Exception e) {
			
		} finally {
			session.close();
		}
	}
	@SuppressWarnings("finally")
	@Override
	public TFG read(String email) {
		TFG tfg = null;
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction(); 
			tfg = session.load( TFG.class, email ); 
			session.getTransaction().commit();
		} catch (Exception e) {
			
		} finally {
			session.close();
			return tfg;
		}
	}
	@Override
	public void update(TFG tfg) {
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction(); 
			session.saveOrUpdate( tfg ); 
			session.getTransaction().commit();
		} catch (Exception e) {
			
		} finally {
			session.close();
		}		
	}
	@Override
	public void delete(TFG tfg) {
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction(); 
			session.delete( tfg ); 
			session.getTransaction().commit();
		} catch (Exception e) {
			
		} finally {
			session.close();
		}		
	}
	@SuppressWarnings({ "unchecked", "finally" }) 
	@Override
	public Collection<TFG> readAll() {
		Session session = SessionFactoryService.get().openSession();
		Collection<TFG> tfgs = null;
		try {
			session.beginTransaction(); 
			tfgs = session.createQuery( "from TFG" ).list(); 
			session.getTransaction().commit();
		} catch (Exception e) {
			
		} finally {
			session.close();
			return tfgs;
		}		
	}
}
