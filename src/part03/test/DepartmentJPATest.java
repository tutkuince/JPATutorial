package part03.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import part03.dao.DepartmentDAO;
import part03.dao.DepartmentDAOImpl;
import part03.model.Department;

public class DepartmentJPATest {
	public static void main(String[] args) {
		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("EmployeePersistenceUnit");
		EntityManager entityManager = managerFactory.createEntityManager();
		
		Department d1 = new Department("IT Department");
		
		DepartmentDAO departmentDAO = new DepartmentDAOImpl(entityManager);
		
		departmentDAO.insertDepartment(d1);
	}
}
