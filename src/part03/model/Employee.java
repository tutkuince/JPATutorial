package part03.model;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "Employee")
public class Employee {

	@Id
	@TableGenerator(name = "EMP_GEN")
	@GeneratedValue(generator = "EMP_GEN")
	private int id;
	private String name;
	private String surname;
	private int salary;
	private LocalDate startDate;

	@ManyToOne // Many -> Employee, One -> Department
	@JoinColumn(name = "departmentId") // change column name, department_id is default name
	private Department department;

	@Lob
	private byte[] image;

	@OneToOne
	@JoinColumn(name = "ps_id", unique = true)
	private ParkingSpace parkingSpace;

	@Enumerated(EnumType.STRING) // for enumeration types
	private EmployeeType employeeType;

	@ManyToMany
	private List<Project> projects;

	@OneToMany
	private List<Phone> phones;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String surname, int salary, EmployeeType employeeType) {
		super();
		this.name = name;
		this.surname = surname;
		this.salary = salary;
		this.employeeType = employeeType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public EmployeeType getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(EmployeeType employeeType) {
		this.employeeType = employeeType;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public byte[] getImage() {
		return image;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Department getDepartment() {
		return department;
	}

	public void setParkingSpace(ParkingSpace parkingSpace) {
		this.parkingSpace = parkingSpace;
	}

	public ParkingSpace getParkingSpace() {
		return parkingSpace;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}

	public List<Phone> getPhones() {
		return phones;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", surname=" + surname + ", salary=" + salary + ", startDate="
				+ startDate + ", department=" + department + ", image=" + Arrays.toString(image) + ", parkingSpace="
				+ parkingSpace + ", employeeType=" + employeeType + ", projects=" + projects + ", phones=" + phones
				+ "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (!(obj instanceof Employee))
			return false;

		Employee employee = (Employee) obj;

		return this.id == employee.id;
	}

	@Override
	public int hashCode() {
		return id;
	}

}
