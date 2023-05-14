//package web.service;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//import web.dao.UserDao;
//import web.model.User;
//
//import java.util.List;
//
//@Service
//@Transactional
//public class UserServiceImp implements UserService {
//
//    private final UserDao userDao;
//
//    public UserServiceImp(UserDao userDao) {
//        this.userDao = userDao;
//    }
//
//    @Override
//    public List<User> getAllUsers() {
//        return userDao.getAllUsers();
//    }
//}
