package com.usercrud.usercrudbackend.repository;

import com.usercrud.usercrudbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
