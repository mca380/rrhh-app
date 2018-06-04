package es.brujula.brurrhh.bussines.user.control;

import es.brujula.brurrhh.bussines.user.entity.User;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class UserRepository {

    @PersistenceContext
    private EntityManager em;

    public List<User>  findAll() {
        return em.createQuery("Select a from User a", User.class).getResultList();
    }

    public User findById(Long id) {
        return em.find(User.class, id);
    }

    public void save(User user) {
        if(user.getId() !=  null) {
            em.merge(user);
        } else {
            em.persist(user);
        }
    }
}
