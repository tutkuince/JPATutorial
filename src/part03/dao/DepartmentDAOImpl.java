package part03.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import part03.model.Department;

public class DepartmentDAOImpl implements DepartmentDAO{
	
	private EntityManager entityManager;
	
	public DepartmentDAOImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public void insertDepartment(Department department) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(department);
		transaction.commit();
	}

	@Override
	public Department getDepartmentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Department> getDepartmentList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteDepartment(int id) {
		// TODO Auto-generated method stub
		
	}

}
