package com.cesar.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cesar.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}
