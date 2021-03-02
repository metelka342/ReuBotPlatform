package newDataModule.dao;

import newDataModule.entities.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.validation.constraints.NotNull;

public class TeacherDAO implements DAO<Teacher, String>{

    /**
     * Connection TeacherDAO to database
     */

    private final SessionFactory sessionFactory;

    public TeacherDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    /**
     * Create new teacher in table
     */
    @Override
    public void create(@NotNull final Teacher teacher) {
        try (final Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.save(teacher);
            session.getTransaction().commit();
        }
    }


    /**
     * get teacher from table Teacher
     *
     * @param teacherName
     * @return teacher
     */
    @Override
    public Teacher read(@NotNull String teacherName) {
        try (final Session session = sessionFactory.openSession()) {

            final Teacher result = session.get(Teacher.class, teacherName);
            return result != null ? result : new Teacher();

        }

    }

    /**
     * update teacher from table Teacher
     *
     * @param teacher for update
     */
    @Override
    public void update(@NotNull Teacher teacher) {
        try (final Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.update(teacher);
            session.getTransaction().commit();

        }
    }


    /**
     * delete teacher from table Teacher
     *
     * @param teacher for delete
     */

    @Override
    public void delete(@NotNull Teacher teacher) {
        try (final Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.delete(teacher);
            session.getTransaction().commit();
        }
    }
}
