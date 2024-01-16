package hibernate_school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetStudentById {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		
		Student student=entityManager.find(Student.class,5);
		if(student!=null) {
			System.out.println(student.getId());
			System.out.println(student.getName());
			System.out.println(student.getPassword());
		}else {
			System.out.println("student does not exit");
		}
		

	}

}
