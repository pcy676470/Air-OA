package com.oa.entityVo;

public class EmployeesDeptVo {

	private String employee_id;
	private String name;
	private String rank;
	private String dept_id;
	private String dept_name;

	public EmployeesDeptVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeesDeptVo(String employee_id, String name, String rank, String dept_id, String dept_name) {
		super();
		this.employee_id = employee_id;
		this.name = name;
		this.rank = rank;
		this.dept_id = dept_id;
		this.dept_name = dept_name;
	}



	public String getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getDept_id() {
		return dept_id;
	}

	public void setDept_id(String dept_id) {
		this.dept_id = dept_id;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	@Override
	public String toString() {
		return "EmployeesDeptVo [employee_id=" + employee_id + ", name=" + name + ", rank=" + rank + ", dept_id="
				+ dept_id + ", dept_name=" + dept_name + "]";
	}

}
