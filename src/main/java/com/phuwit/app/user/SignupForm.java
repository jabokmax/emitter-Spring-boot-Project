package com.phuwit.app.user;

import lombok.Data;

@Data
public class SignupForm {
    private int id;
    private String email;
    private String name;
    private String password;

    public SignupForm(int id, String email, String name, String password) {
        this.email = email;
        this.name = name;
        this.id = id;
        this.password = password;
    }

    public SignupForm(){}

}
