package hibernate_school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveTeacher {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Teacher t=new Teacher();
		t.setId(2);
		t.setName("kavana");
		t.setEmail("kavana@gmail.com");
		t.setPhone(11544565l);
		t.setGender("female");
		
		entityTransaction.begin();
		entityManager.persist(t);
		entityTransaction.commit();
		System.out.println("done7777777777777777777777");
	}

}
