package com.mcart.UsersMS.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mcart.UsersMS.entity.Users;
import com.mcart.UsersMS.dto.LoginDTO;
import com.mcart.UsersMS.dto.UserDTO;
import com.mcart.UsersMS.exception.McartException;
import com.mcart.UsersMS.repository.UserRepositary;

@Service
public class UserService{
	@Autowired
	private UserRepositary userRepositary;

	public String addUser(UserDTO dto) throws McartException {
		boolean checkIfExist = userRepositary.existsById(dto.getUserName());
		if (checkIfExist) {
			throw new McartException(dto.getUserName() + " User already registered");
		}
		
		Users user = UserDTO.valueOf(dto);
		userRepositary.saveAndFlush(user);
		return "User Signup Completed Successfully";

	}

	public String loginUser(LoginDTO dto) throws McartException {
		Optional<Users> user = userRepositary.findById(dto.getUserName());
		if (user.isPresent()) {
			Users use = user.get();
			if (use.getUserName().equals(dto.getUserName()) && use.getPassword().equals(dto.getPassword())) {
				return "User login successfully";

			} else {
				throw new McartException("User Name or Password is incorrect");
			}
		} else {
			throw new McartException("User is not present");
		}

	}
}
