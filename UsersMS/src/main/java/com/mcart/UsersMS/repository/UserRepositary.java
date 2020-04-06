package com.mcart.UsersMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mcart.UsersMS.entity.Users;

@Repository
public interface UserRepositary extends JpaRepository<Users, String> {
	
}
