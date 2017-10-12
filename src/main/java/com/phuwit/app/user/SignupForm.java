package com.phuwit.app.user;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

@Data
public class SignupForm {

    @NotEmpty
    private String email;
    @NotEmpty
    private String name;
    @NotEmpty
    private String password;

}
