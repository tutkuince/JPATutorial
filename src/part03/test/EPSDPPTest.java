package part03.test;

import java.time.LocalDate;
import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import part03.dao.DepartmentDAO;
import part03.dao.DepartmentDAOImpl;
import part03.dao.EmployeeDAO;
import part03.dao.EmployeeDAOImpl;
import part03.dao.ParkingSpaceDAO;
import part03.dao.ParkingSpaceDAOImpl;
import part03.dao.PhoneDAO;
import part03.dao.PhoneDAOImpl;
import part03.dao.ProjectDAO;
import part03.dao.ProjectDAOImpl;
import part03.model.Department;
import part03.model.Employee;
import part03.model.EmployeeType;
import part03.model.ParkingSpace;
import part03.model.Phone;
import part03.model.Project;

public class EPSDPPTest {
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

		ParkingSpaceDAO parkingSpaceDAO = new ParkingSpaceDAOImpl(entityManager);

		ParkingSpace ps1 = new ParkingSpace(1);
		ParkingSpace ps2 = new ParkingSpace(2);
		ParkingSpace ps3 = new ParkingSpace(3);

		parkingSpaceDAO.insertParkingSpace(ps1);
		parkingSpaceDAO.insertParkingSpace(ps2);
		parkingSpaceDAO.insertParkingSpace(ps3);

		ProjectDAO projectDAO = new ProjectDAOImpl(entityManager);

		Project p1 = new Project("E-commerce");
		Project p2 = new Project("Design");
		Project p3 = new Project("Test");
		Project p4 = new Project("Game");
		Project p5 = new Project("Drawing");
		Project p6 = new Project("Celebrating");

		projectDAO.insertProject(p1);
		projectDAO.insertProject(p2);
		projectDAO.insertProject(p3);
		projectDAO.insertProject(p4);
		projectDAO.insertProject(p5);
		projectDAO.insertProject(p6);

		PhoneDAO phoneDAO = new PhoneDAOImpl(entityManager);

		Phone phn1 = new Phone("123");
		Phone phn2 = new Phone("234");
		Phone phn3 = new Phone("345");
		Phone phn4 = new Phone("456");
		Phone phn5 = new Phone("567");
		Phone phn6 = new Phone("678");
		Phone phn7 = new Phone("789");

		phoneDAO.insertPhone(phn1);
		phoneDAO.insertPhone(phn2);
		phoneDAO.insertPhone(phn3);
		phoneDAO.insertPhone(phn4);
		phoneDAO.insertPhone(phn5);
		phoneDAO.insertPhone(phn6);
		phoneDAO.insertPhone(phn7);

		EmployeeDAO employeeDAO = new EmployeeDAOImpl(entityManager);

		Employee emp1 = new Employee("Tutku", "Ince", 5000, EmployeeType.FULL_TIME);
		emp1.setStartDate(LocalDate.now().minusYears(2));
		emp1.setImage("img1.png".getBytes());
		emp1.setDepartment(dep1);
		emp1.setParkingSpace(ps1);
		emp1.setProjects(Arrays.asList(new Project[] { p1, p2, p5, p6 }));
		emp1.setPhones(Arrays.asList(new Phone[] { phn1, phn2, phn3 }));

		Employee emp2 = new Employee("Utku", "Ince", 1000, EmployeeType.PART_TIME);
		emp2.setStartDate(LocalDate.now().minusMonths(3));
		emp2.setImage("img2.png".getBytes());
		emp2.setDepartment(dep1);
		emp2.setParkingSpace(ps2);
		emp2.setProjects(Arrays.asList(new Project[] { p1, p3, p4 }));
		emp2.setPhones(Arrays.asList(new Phone[] { phn3, phn4, phn5 }));

		Employee emp3 = new Employee("Uğur", "Batikan", 100, EmployeeType.PROJECT_BASE);
		emp3.setStartDate(LocalDate.now().minusWeeks(3));
		emp3.setImage("img3.png".getBytes());
		emp3.setDepartment(dep3);
		emp3.setParkingSpace(ps3);
		emp3.setProjects(Arrays.asList(new Project[] { p4, p5, p6 }));
		emp3.setPhones(Arrays.asList(new Phone[] { phn6, phn7 }));

		employeeDAO.insertEmployee(emp1);
		employeeDAO.insertEmployee(emp2);
		employeeDAO.insertEmployee(emp3);
	}
}
