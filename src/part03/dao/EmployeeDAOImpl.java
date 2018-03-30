package part03.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
//import javax.persistence.Query;
import javax.persistence.TypedQuery;

import part03.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO{

	private EntityManager entityManager;
	
	public EmployeeDAOImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	public void insertEmployee(Employee employee) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(employee);
		transaction.commit();
	}

	@Override
	public Employee getEmployeeById(int id) {
		// it is not required to invoke transaction.begin() and transcation.commit() methods when we do read process
		return entityManager.find(Employee.class, id);
	}

	@Override
	public List<Employee> getEmployeeList() {
		// Query query = entityManager.createQuery("select emp from employee emp"); // select * from employee
		TypedQuery<Employee> query = entityManager.createQuery("select e from Employee e", Employee.class); // table name must be same as class name
		return query.getResultList();
	}

	@Override
	public void deleteEmployeeById(int id) {
		Employee employee = getEmployeeById(id);
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.remove(employee);
		transaction.commit();
	}

	@Override
	public void increaseSalary(int id, int amountIncrease) {
		Employee employee = getEmployeeById(id);
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		employee.setSalary(employee.getSalary() + amountIncrease); // between begin() and commit() for updating 
		transaction.commit();
	}
	
	@Override
	public void updateNickName(Employee employee, NickName nickName) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		employee.setNickName(nickName);
		transaction.commit();
	}

}
