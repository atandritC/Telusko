package com.telusko;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        Alien a1 = new Alien();
        a1.setAid(101);
        a1.setAname("Ravi");
        a1.setTech("Java");

        // Saving the object to database
        Configuration config = new Configuration();
        config.addAnnotatedClass(com.telusko.Alien.class);
        config.configure();
        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();

        // Starting a transaction
        Transaction transaction = session.beginTransaction();
        session.persist(a1);

        Alien a2 = session.find(Alien.class, 101);
        System.out.println(a2);

        session.remove(a2);
        transaction.commit();

        session.close();
        factory.close();
    }
}
