package com.phuwit.domain.service;

import com.phuwit.app.user.SignupForm;
import com.phuwit.domain.entity.User;
import com.phuwit.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Calendar;
import java.util.Date;

@Service
@Transactional
public class UserService {
    @Autowired
    UserRepository userRepository;

    public void save(SignupForm signupForm){
        Date date = Calendar.getInstance().getTime();
        User user = new User();
        user.setName(signupForm.getName());
        user.setEmail(signupForm.getEmail());
        user.setPassword(signupForm.getPassword());

        user.setCreated(date);
        user.setUpdated(date);

        userRepository.save(user);
    }


}
