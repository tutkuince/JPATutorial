package part03.dao;

import java.util.List;

import part03.model.Employee;
public interface EmployeeDAO {
	public void insertEmployee(Employee employee);
	
	public Employee getEmployeeById(int id);
	
	public List<Employee> getEmployeeList();
	
	public void deleteEmployeeById(int id);
	
	public void increaseSalary(int id, int amountIncrease);
	
	public void updateNickName(Employee employee, NickName nickName);
}
