package part03.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

@Entity
public class Project {
	@Id
	@TableGenerator(name="PRJ_GEN")
	@GeneratedValue(generator="PRJ_GEN")
	private int id;
	private String name;
	
	public Project() {
		// TODO Auto-generated constructor stub
	}

	public Project(String name) {
		super();
		this.name = name;
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

	@Override
	public String toString() {
		return "Project [name=" + name + "]";
	}
}
