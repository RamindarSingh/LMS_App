package LeavesPackage;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Leaves {
	
	@Id
	private String empId;
	
	private String causal;
	private String sick;
	private String earned;
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getCausal() {
		return causal;
	}
	public void setCausal(String causal) {
		this.causal = causal;
	}
	public String getSick() {
		return sick;
	}
	public void setSick(String sick) {
		this.sick = sick;
	}
	public String getEarned() {
		return earned;
	}
	public void setEarned(String earned) {
		this.earned = earned;
	}
	
}
