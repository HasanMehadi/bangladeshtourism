package com.bangladeshtourism.org.services;

import com.bangladeshtourism.org.entities.Users;
import com.bangladeshtourism.org.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UsersService {

    @Autowired
    private UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository){
        this.usersRepository=usersRepository;
    }

    public Users saveUsers(Users users){
        Users user = usersRepository.save(users);
        return user;
    }

    public Users getAuthUser(String username, String password){
        Users users = usersRepository.getUsersByUsernameAndPassword(username,password);
        return users;
    }
}
