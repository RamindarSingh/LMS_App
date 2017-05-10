package LeavesPackage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LeavesStatus {
	
	@Id
	private String empId; 
	private DateFormat startDate;
	private DateFormat endDate;
	
	//TODO: add valid annotation
	private String type;
	private String reason;
	private String supervisor;
	
	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public DateFormat getStartDate() {
		return startDate;
	}

	public void setStartDate(DateFormat startDate) {
		this.startDate = startDate;
	}

	public DateFormat getEndDate() {
		return endDate;
	}

	public void setEndDate(DateFormat endDate) {
		this.endDate = endDate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}

	public LeavesStatus() {
		startDate = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		endDate = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	}
}
