package com.oracle.web.bean;

public class School {
    private Integer schoolId;

    private String name;

    private String address;

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

	public School(Integer schoolId, String name, String address) {
		super();
		this.schoolId = schoolId;
		this.name = name;
		this.address = address;
	}

	public School() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "School [schoolId=" + schoolId + ", name=" + name + ", address=" + address + "]";
	}
    
    
}