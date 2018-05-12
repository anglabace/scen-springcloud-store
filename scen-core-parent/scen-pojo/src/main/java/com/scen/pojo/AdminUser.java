package com.scen.pojo;


import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tb_admin_user")
public class AdminUser {

    @Id
    private Long id;
    private String username;
    private String password;
    private Long roleId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getUserName() {
        return username;
    }

    public void setUserName(String username) {
        this.username = username;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

}
