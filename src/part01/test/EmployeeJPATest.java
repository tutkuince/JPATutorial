package part01.test;

//import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import part01.dao.EmployeeDAO;
import part01.dao.EmployeeDAOImpl;
import part01.model.Employee;

public class EmployeeJPATest {
	public static void main(String[] args) {
		// Step 1: Create EntityManagerFactory
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("EmployeePersistenceUnit");

		// Step 2: Create EntityManager from EntityManagerFactory
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EmployeeDAO employeeDAO = new EmployeeDAOImpl(entityManager);

		Employee emp1 = new Employee(1, "Tutku", "Ince", 5000);
		Employee emp2 = new Employee(2, "Utku", "Ince", 1000);
		Employee emp3 = new Employee(3, "Uğur", "Batikan", 100);
		// insert emp1
		employeeDAO.insertEmployee(emp1);

		// insert emp2
		employeeDAO.insertEmployee(emp2);

		// insert emp3
		employeeDAO.insertEmployee(emp3);

		// get by id
		System.out.println(employeeDAO.getEmployeeById(1));
		System.out.println(employeeDAO.getEmployeeById(2));

		System.out.println("--------------");
		//List<Employee> employeeList = employeeDAO.getEmployeeList();
		System.out.println(employeeDAO.getEmployeeList());

		// employeeList.forEach((e) -> System.out.println(e));
		// employeeList.forEach(System.out::println);
		
		System.out.println("--------------");
		
		employeeDAO.deleteEmployeeById(3);
		
		System.out.println(employeeDAO.getEmployeeList());
		
		System.out.println("--------------");
		
		employeeDAO.increaseSalary(1, 3500);
		System.out.println(employeeDAO.getEmployeeList());
	}
}
