package younus.attari.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "customers", schema = "dbhybrid_transcription")
public class Customers {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;

	private String custName;

	@Embedded
	private Address custAddress;

	@OneToOne
	@JoinColumn(referencedColumnName = "id", name = "id", insertable=false, updatable=false)
	private Employee employee;

	private String custSal;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public void setCustAddress(Address custAddress) {
		this.custAddress = custAddress;
	}

	public Address getCustAddress() {
		return custAddress;
	}

	public String getCustSal() {
		return custSal;
	}

	public void setCustSal(String custSal) {
		this.custSal = custSal;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Employee getEmployee() {
		return employee;
	}
}
