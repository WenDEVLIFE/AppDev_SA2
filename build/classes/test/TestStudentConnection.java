package test;

import entities.Student;

import javax.persistence.*;

public class TestStudentConnection {
    public static void main(String[] args) {
        try {
            System.out.println("🔄 Checking database connection...");
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("myJpaUnit");
            EntityManager em = emf.createEntityManager();
            em.close();
            emf.close();
            System.out.println("✅ Connection successful!");
        } catch (Exception e) {
            System.out.println("❌ Connection failed: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
