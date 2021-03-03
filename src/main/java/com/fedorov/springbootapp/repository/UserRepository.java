package com.fedorov.springbootapp.repository;

import com.fedorov.springbootapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
//    List<User> findByLastName(String lastname);




}
