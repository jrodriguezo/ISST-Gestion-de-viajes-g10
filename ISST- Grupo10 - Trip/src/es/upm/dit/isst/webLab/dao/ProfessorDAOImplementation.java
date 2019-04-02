package es.upm.dit.isst.webLab.dao;

import java.util.Collection;

import org.hibernate.Session;

import es.upm.dit.isst.webLab.model.Professor;

public class ProfessorDAOImplementation implements ProfessorDAO{

	private static ProfessorDAOImplementation instancia = null;
	private ProfessorDAOImplementation() {}
	public static ProfessorDAOImplementation getInstance() {
		if(instancia == null)
			instancia = new ProfessorDAOImplementation();
		return instancia;
	}
	
	@Override
	public void create(Professor professor) {
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction();
			session.save(professor);
			session.getTransaction().commit();
		} catch (Exception e) {
			
		} finally {
			session.close();
		}		
	}

	@SuppressWarnings("finally")
	@Override
	public Professor read(String email) {
		Professor professor = null;
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction(); 
			professor = session.load( Professor.class, email ); 
			session.getTransaction().commit();
		} catch (Exception e) {
			
		} finally {
			session.close();
			return professor;
		}
	}

	@Override
	public void update(Professor professor) {
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction(); 
			session.saveOrUpdate( professor ); 
			session.getTransaction().commit();
		} catch (Exception e) {
			
		} finally {
			session.close();
		}		
	}

	@Override
	public void delete(Professor professor) {
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction(); 
			session.delete( professor ); 
			session.getTransaction().commit();
		} catch (Exception e) {
			
		} finally {
			session.close();
		}			
	}

	@SuppressWarnings({ "finally", "unchecked" })
	@Override
	public Collection<Professor> readAll() {
		Session session = SessionFactoryService.get().openSession();
		Collection<Professor> professors = null;
		try {
			session.beginTransaction(); 
			professors = session.createQuery( "from Professor" ).list(); 
			session.getTransaction().commit();
		} catch (Exception e) {
			
		} finally {
			session.close();
			return professors;
		}	
	}
}
