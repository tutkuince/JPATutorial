package part03.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

@Entity
public class Phone {
	@Id
	@TableGenerator(name = "PHN_GEN")
	@GeneratedValue(generator = "PHN_GEN")
	private int id;

	@Column(name = "phoneNumber", unique = true, nullable = false)
	private String number;

	public Phone() {
		// TODO Auto-generated constructor stub
	}

	public Phone(String number) {
		super();
		this.number = number;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Phone [number=" + number + "]";
	}

}
