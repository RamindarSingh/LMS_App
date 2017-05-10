package AttendancePackage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SensorData {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String empId;
	private String accessNumber;
	private DateFormat inTime;
	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getAccessNumber() {
		return accessNumber;
	}

	public void setAccessNumber(String accessNumber) {
		this.accessNumber = accessNumber;
	}

	public DateFormat getInTime() {
		return inTime;
	}

	public void setInTime(DateFormat inTime) {
		this.inTime = inTime;
	}

	public DateFormat getOutTime() {
		return outTime;
	}

	public void setOutTime(DateFormat outTime) {
		this.outTime = outTime;
	}

	private DateFormat outTime;
	
	public SensorData() {
		inTime = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		outTime = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

	}
}
