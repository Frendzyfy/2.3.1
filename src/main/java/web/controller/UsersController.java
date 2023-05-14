package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import web.model.User;
import web.service.UserService;
import web.service.UserServiceImp;


import java.util.List;

@Controller
@RequestMapping(name = "/users")
public class UsersController {

    private UserService userService;

    public UsersController(UserServiceImp userServiceImp) {
        this.userService = userServiceImp;
    }

    @RequestMapping("/")
    public String showAllUsers(Model model){
        List<User> list = userService.getAllUsers();
        model.addAttribute("users",list);
        return "users";
    }
}
