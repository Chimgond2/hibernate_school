package hibernate_school;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveVisitor {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Visitor visitor = new Visitor();
		visitor.setId(2);
		visitor.setName("raja");
		visitor.setEmail("raja@gmail.com");
		visitor.setDob(LocalDate.of(1992, 12, 12));
		visitor.setVisitorDateTime(LocalDateTime.now());
		visitor.setGender("male");

		entityTransaction.begin();
		entityManager.persist(visitor);
		entityTransaction.commit();
		System.out.println("done===========================");
	}

}
