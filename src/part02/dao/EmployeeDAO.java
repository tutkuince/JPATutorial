package part02.dao;

import java.util.List;

import part02.model.Employee;
public interface EmployeeDAO {
	public void insertEmployee(Employee employee);
	
	public Employee getEmployeeById(int id);
	
	public List<Employee> getEmployeeList();
	
	public void deleteEmployeeById(int id);
	
	public void increaseSalary(int id, int amountIncrease);
}
