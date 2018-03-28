package part03.test;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import part03.dao.DepartmentDAO;
import part03.dao.DepartmentDAOImpl;
import part03.dao.EmployeeDAO;
import part03.dao.EmployeeDAOImpl;
import part03.model.Department;
import part03.model.Employee;
import part03.model.EmployeeType;

public class EmployeeDepartmentTest {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("EmployeePersistenceUnit");
		EntityManager entityManager = factory.createEntityManager();
		
		
		DepartmentDAO departmentDAO = new DepartmentDAOImpl(entityManager);
		
		Department dep1 = new Department("IT");
		Department dep2 = new Department("Human Resources");
		Department dep3 = new Department("Cafe");
		
		departmentDAO.insertDepartment(dep1);
		departmentDAO.insertDepartment(dep2);
		departmentDAO.insertDepartment(dep3);
		
		
		EmployeeDAO employeeDAO = new EmployeeDAOImpl(entityManager);
		
		Employee emp1 = new Employee("Tutku", "Ince", 5000, EmployeeType.FULL_TIME);
		emp1.setStartDate(LocalDate.now().minusYears(2));
		emp1.setImage("img1.png".getBytes());
		emp1.setDepartment(dep1);
		
		Employee emp2 = new Employee("Utku", "Ince", 1000, EmployeeType.PART_TIME);
		emp2.setStartDate(LocalDate.now().minusMonths(3));
		emp2.setImage("img2.png".getBytes());
		emp2.setDepartment(dep1);
		
		Employee emp3 = new Employee("Uğur", "Batikan", 100, EmployeeType.PROJECT_BASE);
		emp3.setStartDate(LocalDate.now().minusWeeks(3));
		emp3.setImage("img3.png".getBytes());
		emp3.setDepartment(dep3);
		
		employeeDAO.insertEmployee(emp1);
		employeeDAO.insertEmployee(emp2);
		employeeDAO.insertEmployee(emp3);
	}
}
