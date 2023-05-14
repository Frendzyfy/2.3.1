package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import web.dao.UserDao;
import web.model.User;
import web.service.UserService;
import web.service.UserServiceImp;


import java.util.List;

@Controller
//@RequestMapping(name = "/users")
public class UsersController {

    @Autowired
    private UserDao userDao;


    @RequestMapping("/")
    public String showAllUsers(Model model){
        List<User> list = userDao.getAllUsers();
        model.addAttribute("users",list);
        return "users";
    }
}
