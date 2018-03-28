package part03.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import part03.model.Project;

public class ProjectDAOImpl implements ProjectDAO{

	private EntityManager entityManager;
	
	public ProjectDAOImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	public void insertProject(Project project) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(project);
		transaction.commit();
	}

	@Override
	public Project getProjectById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Project> getProjectList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProject(int id) {
		// TODO Auto-generated method stub
		
	}

}
