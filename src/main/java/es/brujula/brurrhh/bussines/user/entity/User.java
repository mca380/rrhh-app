package es.brujula.brurrhh.bussines.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Entity
@Table(name = "T_CAN_USUARIO")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "CAN_ID", unique = true, nullable = false, precision = 11)
    private Long id;

    @Column(name = "CAN_CLAVE")
    private String password;

    @Column(name = "CAN_NOM")
    private String name;

    @Column(name = "CAN_APE")
    private String surname;

    @Column(name = "CAN_NOMDEP")
    private String department;

    @Column(name = "CAN_ULTIMOACC")
    private Date lastAccess;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Date getLastAccess() {
        return lastAccess;
    }

    public void setLastAccess(Date lastAccess) {
        this.lastAccess = lastAccess;
    }
}

