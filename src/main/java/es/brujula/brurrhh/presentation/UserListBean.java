package es.brujula.brurrhh.presentation;

import es.brujula.brurrhh.bussines.user.boundary.UserService;
import es.brujula.brurrhh.bussines.user.entity.User;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;


import java.util.List;

@ManagedBean(name="userList")
@ViewScoped
public class UserListBean {

    @Inject
    UserService userService;
    User selectedUser;
    List<User> users;

    @PostConstruct
    public void initialize() {
        users = userService.findAll();
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public User getSelectedUser() {
        return selectedUser;
    }

    public void setSelectedUser(User selectedUser) {
        this.selectedUser = selectedUser;
    }

    public void selectUser(User user) {
        this.selectedUser = user;
    }
    public void saveSelected() {
        userService.save(selectedUser);
    }

}
