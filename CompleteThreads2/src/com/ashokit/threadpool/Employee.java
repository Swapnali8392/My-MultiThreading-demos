package com.ashokit.threadpool;

public class Employee {

	Integer eid;
	String name;
	Double basic;
	Integer days;
	Double monthlySal;

	public Employee(Integer eid, String name, Double basic, Integer days) {
		super();
		this.eid = eid;
		this.name = name;
		this.basic = basic;
		this.days = days;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public Double getBasic() {
		return basic;
	}

	public void setBasic(Double basic) {
		this.basic = basic;
	}

	public Integer getDays() {
		return days;
	}

	public void setDays(Integer days) {
		this.days = days;
	}

	public Double getMonthlySal() {
		return monthlySal;
	}

	public void setMonthlySal(Double monthlySal) {
		this.monthlySal = monthlySal;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", basic=" + basic + ", days=" + days + ", monthlySal="
				+ monthlySal + "]";
	}
	
	
	
	
}
