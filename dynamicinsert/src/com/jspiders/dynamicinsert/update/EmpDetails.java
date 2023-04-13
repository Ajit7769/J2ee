package com.jspiders.dynamicinsert.update;

public class EmpDetails {

	private int EmpID;
	private String Ename;
	private String job;
	private long sal;

	public int getEmpID() {
		return EmpID;
	}
	public void setEmpID(int empID) {
		EmpID = empID;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public long getSal() {
		return sal;
	}
	public void setSal(Long sal) {
		this.sal = sal;
	}
	
	@Override
	public String toString() {
		return "EmpDetails [EmpID=" + EmpID + ", Ename=" + Ename + ", job=" + job + ", sal=" + sal + "]";
	}
}
