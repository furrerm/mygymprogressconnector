package ch.lu.home.mygymprogress;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SessionFactory {

    public static Session getOpenSession() {

        Session session = null;
        Transaction transaction = null;
        try {

            session = buildSessionFactory().openSession();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return session;
    }

    private static org.hibernate.SessionFactory buildSessionFactory() {
        return new Configuration().configure().buildSessionFactory();
    }
}
