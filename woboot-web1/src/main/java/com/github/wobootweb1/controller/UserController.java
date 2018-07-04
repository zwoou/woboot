package com.github.wobootweb1.controller;

import bid.woou.wobootmysql.entity.User;
import bid.woou.wobootmysql.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/user")
public class UserController {
    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserRepository userRepository;
/*    @Autowired
    private DepartmentRepository departmentRepository;*/
/*    @Autowired
    private RoleRepository roleRepository;*/

    @RequestMapping("/index")
    public String index(ModelMap model, Principal user) throws Exception{
        model.addAttribute("user", user);
        return "user/index";
    }

    @RequestMapping(value="/{username}")
    public String show(ModelMap model,@PathVariable String username) {
        User user = userRepository.findByUsername(username);
        model.addAttribute("user",user);
        return "user/show";
    }


}
