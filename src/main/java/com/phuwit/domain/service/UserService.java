package com.phuwit.domain.service;

import com.phuwit.app.user.SignupForm;
import com.phuwit.domain.component.PasswordEncoder;
import com.phuwit.domain.entity.User;
import com.phuwit.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.security.NoSuchAlgorithmException;
import java.util.Calendar;
import java.util.Date;

@Service
@Transactional
public class UserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    public void AddUser(SignupForm signupForm) throws NoSuchAlgorithmException {
        Date date = Calendar.getInstance().getTime();
        User user = new User();
        user.setName(signupForm.getName());
        user.setEmail(signupForm.getEmail());
        user.setPassword(passwordEncoder.hashMD5(signupForm.getPassword()));
        user.setCreated(date);
        user.setUpdated(date);

        userRepository.save(user);
    }


}
