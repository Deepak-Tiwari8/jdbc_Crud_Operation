package com.dailyCoding;

public class Student {

	private int sId;
	private String sName;
	private double sPercentage;
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public double getsPercentage() {
		return sPercentage;
	}
	public void setsPercentage(double sPercentage) {
		this.sPercentage = sPercentage;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sId, String sName, double sPercentage) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sPercentage = sPercentage;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sPercentage=" + sPercentage + "]";
	}
	
}
