package newDataModule.dao;

import newDataModule.entities.Group;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.validation.constraints.NotNull;

public class GroupDAO implements DAO<Group, String> {
    /**
     * Connection GroupDAO to database
     */
    private final SessionFactory sessionFactory;

    public GroupDAO(@NotNull final SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    /**
     * Creating new Group in table
     *
     * @param group for add.
     */
    @Override
    public void create(@NotNull final Group group) {
        try (final Session session = sessionFactory.openSession()) {

            session.beginTransaction();
            session.save(group);
            session.getTransaction().commit();
        }
    }

    /**
     * Get Group by name
     *
     * @param groupName for select
     * @return Group w/ param model
     */
    @Override
    public Group read(@NotNull String groupName) {
        try (final Session session = sessionFactory.openSession()) {
            final Group result = session.get(Group.class, groupName);
            return result != null ? result : new Group();
        }
    }

    /**
     * Update group in table
     *
     * @param group for update
     */
    @Override
    public void update(@NotNull final Group group) {
        try (final Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.update(group);
            session.getTransaction().commit();
        }
    }


    /**
     * Delete group from table
     *
     * @param group for delete
     */
    @Override
    public void delete(@NotNull final Group group) {
        try (final Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.delete(group);
            session.getTransaction().commit();
        }
    }


    public void delete(@NotNull final Long id) {
        try (final Session session = sessionFactory.openSession()) {
            final Group group = new Group();
            group.setIdGroup(id);
            session.beginTransaction();
            session.delete(group);
            session.getTransaction().commit();
        }
    }
}
