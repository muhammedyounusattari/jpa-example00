package younus.attari.config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import younus.attari.model.Address;
import younus.attari.model.Customers;

public class MainConfiguration {

	public static void main(String[] args) {
		
		Address address = new Address();
		address.setAddress1("ADDRESS1");
		address.setAddress2("ADDRESS2");
		address.setCity("CITY");
		address.setPincode("1234");
		address.setState("STATE");
		
		
		Customers custom = new Customers();
//		custom.setCustName("Sunil Kumar");
//		custom.setCustAddress(address);
//		custom.setCustSal("123");
		
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpaExample");
		EntityManager manager = factory.createEntityManager();
//		EntityTransaction trans = manager.getTransaction();

		custom = manager.getReference(Customers.class, 1);
		System.out.println(custom.getId()+".."+custom.getCustName()+"..."+custom.getCustAddress().getAddress1()+"...."+custom.getEmployee().getEmpName());
		
		//custom = manager.find(Customers.class, 2);
	//	System.out.println(custom.getId()+".."+custom.getCustName()+"..."+custom.getCustAddress().getAddress1()+"...."+custom.getEmployee().getEmpName());
		
//		trans.begin();
		
//		for(int i=0;i<10;i++){
//			manager.persist(custom);
//			manager.flush();
//			manager.clear();
//		
//		}
//		trans.commit();
	}
}
