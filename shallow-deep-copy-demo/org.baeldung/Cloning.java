package org.baeldung;

public class Cloning {

	public static void main(String[] args) throws CloneNotSupportedException {

		Address address1 = new Address();
		address1.setCity("Ajmer");
		address1.setPincode(305001);
		
		Employee e1 = new Employee();
		e1.setEid(101);
		e1.setName("Madhu");
		e1.setAddress(address1);
		
		Employee e2 = new Employee();

		/*
		 * shallow Copy e2 = e1; e2.setEid(102);
		 */
		
		/*Deep Copy
		e2.setEid(e1.getEid());
		e2.setName(e1.getName());
		e2.setEid(102);

*/

		//Cloning

		e2 = (Employee) e1.clone();
		e2.setEid(102);
		e2.getAddress().setCity("Jaipur");
		
		  System.out.println("Eid: " +e1.getEid()+ ", Name: "+e1.getName()+ ", Address: "
		  + e1.getAddress().getCity()+ " "+e1.getAddress().getPincode());
		 
		  System.out.println("Eid: " +e2.getEid()+ ", Name: "+e2.getName()+ ", Address: "
		  + e2.getAddress().getCity()+ " "+e2.getAddress().getPincode());
		  
		 
	}
}
