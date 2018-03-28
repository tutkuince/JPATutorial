package part02.model;

import java.time.LocalDate;
import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private String name;
	private String surname;
	private int salary;
	private LocalDate startDate;

	@Lob
	private byte[] image;

	@Enumerated(EnumType.STRING) // for enumeration types
	private EmployeeType employeeType;

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

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", surname=" + surname + ", salary=" + salary + ", startDate="
				+ startDate + ", image=" + Arrays.toString(image) + ", employeeType=" + employeeType + "]";
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
