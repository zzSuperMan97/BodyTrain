package com.bysj.bodytrain.Service;

import com.bysj.bodytrain.Models.Users;
import com.bysj.bodytrain.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServices {
    @Autowired
    private UserRepository userRepository;

    public Users getUser(String userName, String password) {
        List<Users> users = userRepository.getUserByNameAndPwd(userName,password);
        return users.get(0);
    }

}
