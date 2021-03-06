package ch.lu.home.mygymprogress.savesetservice;

import ch.lu.home.mygymprogress.entities.SetsEntity;
import org.hibernate.Session;

import java.util.List;

public class SetDataSaver {

    public static void sveTheList(List<SetsEntity> sets, Session session) {
        session.beginTransaction();

        for (SetsEntity set : sets) {
            session.save(set);
        }
        session.getTransaction().commit();
        session.close();
    }
}
