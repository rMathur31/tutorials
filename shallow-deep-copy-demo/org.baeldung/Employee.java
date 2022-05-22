package org.baeldung;

class Employee implements Cloneable {
	private int eid;
	private String name;
	private Address address;
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Object object) {
		this.address = (Address) object;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + "]";
	}

	
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Employee employee = (Employee) super.clone();
		employee.setAddress(address.clone());
		return employee;
	}

}


