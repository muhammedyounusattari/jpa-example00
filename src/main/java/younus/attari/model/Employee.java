package younus.attari.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee", schema="dbhybrid_transcription")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="id")
	private int id;
	
	@Column(name="\"emp_name\"")
	private String empName;
	
	@Column(name="\"emp_desig\"")
	private String empDesig;
	
	@Column(name="\"emp-sal\"")
	private double empSal;
	
	public Employee(){}
	
	public Employee( String empName, String empDesig, double empSal) {
		super();
//		this.empId = empId;
		this.empName = empName;
		this.empDesig = empDesig;
		this.empSal = empSal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDesig() {
		return empDesig;
	}

	public void setEmpDesig(String empDesig) {
		this.empDesig = empDesig;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	
	
	
}
