package hibernate_school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetVisitorById {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Visitor visitor = entityManager.find(Visitor.class, 1);
		if (visitor != null) {
			System.out.println(visitor.getId());
			System.out.println(visitor.getName());
			System.out.println(visitor.getEmail());
			System.out.println(visitor.getDob());
			System.out.println(visitor.getVisitorDateTime());
			System.out.println(visitor.getGender());
		} else {
			System.out.println("visitor not exit");
		}
	}

}
