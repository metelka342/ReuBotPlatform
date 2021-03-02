package newDataModule.dao;

import newDataModule.entities.Lessons;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class LessonsDAO implements DAO<LessonsDAO, String> {

    private final SessionFactory sessionFactory;

    public LessonsDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void create(LessonsDAO lesson) {
        try (final Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.save(lesson);
            session.getTransaction().commit();
        }
    }

    @Override
    public LessonsDAO read(String lessonName) {
         try(final Session session = sessionFactory.openSession()){
             final Lessons lesson = session.get()

             return lesson !=null ? lesson: new LessonsDAO();
         }

    }

    @Override
    public void update(LessonsDAO lessonsDAO) {

    }

    @Override
    public void delete(LessonsDAO lessonsDAO) {

    }

}
