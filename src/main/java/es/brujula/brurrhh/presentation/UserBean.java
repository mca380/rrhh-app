package es.brujula.brurrhh.presentation;

import es.brujula.brurrhh.bussines.user.boundary.UserService;
import es.brujula.brurrhh.bussines.user.entity.User;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import javax.jws.soap.SOAPBinding;

@ManagedBean
@RequestScoped
public class UserBean {

    @Inject
    UserService userService;

    private String name;
    private String surname;
    private String password;
    private String department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    public void save() {
        User newUser = new User();
        newUser.setName(this.name);
        newUser.setPassword(this.password);
        newUser.setDepartment(this.department);
        newUser.setSurname(this.surname);
        userService.save(newUser);
    }
}
