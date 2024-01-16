package hibernate_school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetTeachetById {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Teacher teacher = entityManager.find(Teacher.class, 2);
		if (teacher != null) {
			System.out.println(teacher.getId());
			System.out.println(teacher.getName());
			System.out.println(teacher.getEmail());
			System.out.println(teacher.getGender());
			System.out.println(teacher.getPhone());

		} else {
			System.out.println("teacher not exit");
		}
	}

}
