package part03.dao;

import java.util.List;

import part03.model.Department;

public interface DepartmentDAO {
	
	public void insertDepartment(Department department);
	public Department getDepartmentById(int id);
	public List<Department> getDepartmentList();
	public void deleteDepartment(int id);
}
