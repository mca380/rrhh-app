package es.brujula.brurrhh.bussines.user.boundary;

import es.brujula.brurrhh.bussines.user.control.UserRepository;
import es.brujula.brurrhh.bussines.user.entity.User;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class UserService {

    @Inject
    UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long userId) {
        return repository.findById(userId);
    }
    public void save(User user) {
        repository.save(user);
    }
}
