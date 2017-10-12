package com.phuwit.app.user;

import com.phuwit.domain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SignupController {

    @Autowired
    UserService userService;

    //　ビューを作成する
    @RequestMapping("/user/signUp")
    public ModelAndView signup(ModelAndView modelAndView) {
        modelAndView.setViewName("user/sign_up");
        modelAndView.addObject("signUpForm", new SignupForm());
        return modelAndView;
    }

    //　ユーザーを作成する
    @RequestMapping(value = "user/create", method = RequestMethod.POST)
    public String create(@ModelAttribute SignupForm signupForm) {

        userService.save(signupForm);
        return "redirect:/";
    }

}
