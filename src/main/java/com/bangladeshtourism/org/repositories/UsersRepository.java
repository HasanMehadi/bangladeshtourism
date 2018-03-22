package com.bangladeshtourism.org.repositories;

import com.bangladeshtourism.org.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users,Integer> {

    Users getUsersByUsernameAndPassword(String username,String password);
}
