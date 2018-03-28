package part03.test;

import java.time.LocalDate;

//import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import part02.dao.EmployeeDAO;
import part02.dao.EmployeeDAOImpl;
import part02.model.Employee;
import part02.model.EmployeeType;

public class EmployeeJPATest {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("EmployeePersistenceUnit");

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EmployeeDAO employeeDAO = new EmployeeDAOImpl(entityManager);

		Employee emp1 = new Employee("Tutku", "Ince", 5000, EmployeeType.FULL_TIME);
		emp1.setStartDate(LocalDate.now().minusYears(2));
		emp1.setImage("img1.png".getBytes());
		
		Employee emp2 = new Employee("Utku", "Ince", 1000, EmployeeType.PART_TIME);
		emp2.setStartDate(LocalDate.now().minusMonths(3));
		emp2.setImage("img2.png".getBytes());
		
		Employee emp3 = new Employee("Uğur", "Batikan", 100, EmployeeType.PROJECT_BASE);
		emp3.setStartDate(LocalDate.now().minusWeeks(3));
		emp3.setImage("img3.png".getBytes());
		
		// insert emp1
		employeeDAO.insertEmployee(emp1);

		// insert emp2
		employeeDAO.insertEmployee(emp2);

		// insert emp3
		employeeDAO.insertEmployee(emp3);


		System.out.println("--------------");
		employeeDAO.getEmployeeList().forEach(System.out::println);
	}
}
