package com.sandsea.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by ZhouFangyuan on 2020-03-04.
 * Time: 17:46
 * Information:
 */

@Entity
@Table(name = "user")
public class User implements Serializable {
    @Id
    private String id;
    private String username;
    private String password;
    @Column(name = "is_delete")
    private Integer isDelete;
    @Transient
    private List<Role> authorities;

    public String getId() {
        return id;
    }

    public User setId(String id) {
        this.id = id;
        return this;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public User setAuthorities(List<Role> authorities) {
        this.authorities = authorities;
        return this;
    }


    public Integer getIsDelete() {
        return isDelete;
    }

    public User setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
        return this;
    }

}
