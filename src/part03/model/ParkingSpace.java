package part03.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

/**
 * @author tutku
 *
 */
@Entity
public class ParkingSpace {
	@Id
	@TableGenerator(name = "PS_GEN")
	@GeneratedValue(generator = "PS_GEN")
	private int id;

	@Column(nullable = false, name = "parkingNo")
	private int no;

	public ParkingSpace() {
		// TODO Auto-generated constructor stub
	}

	public ParkingSpace(int no) {
		super();
		this.no = no;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	@Override
	public String toString() {
		return "ParkingSpace [id=" + id + ", no=" + no + "]";
	}
}
