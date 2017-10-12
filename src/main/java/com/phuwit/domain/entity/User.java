package com.phuwit.domain.entity;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class User {

    @GeneratedValue
    @Id
    private int id;

    @NotEmpty
    private String name;

    @NotEmpty
    @Column(unique=true)
    private String email;

    @NotEmpty
    private String password;


    private Date created;
    private Date updated;
}
