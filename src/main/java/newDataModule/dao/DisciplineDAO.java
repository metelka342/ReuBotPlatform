package newDataModule.dao;

import newDataModule.entities.Discipline;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DisciplineDAO implements DAO<Discipline, String> {

    private final SessionFactory sessionFactory;

    public DisciplineDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
    public void create(Discipline discipline) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.save(discipline);
            session.getTransaction().commit();
        }
    }

    @Override
    public Discipline read(String disciplineName) {
        try (Session session = sessionFactory.openSession()) {
            final Discipline result = session.get(Discipline.class, disciplineName);
            return result != null ? result : new Discipline();
        }


    }

    @Override
    public void update(Discipline discipline) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.update(discipline);
            session.getTransaction().commit();
        }
    }

    @Override
    public void delete(Discipline discipline) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.delete(discipline);
            session.getTransaction().commit();
        }
    }
}
