package com.mcart.UsersMS.controller;

import java.util.stream.Collectors;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mcart.UsersMS.dto.ErrorMessage;
import com.mcart.UsersMS.dto.LoginDTO;
import com.mcart.UsersMS.dto.UserDTO;
import com.mcart.UsersMS.exception.McartException;
import com.mcart.UsersMS.service.UserService;

@RestController
@Validated
//@RequestMapping("/")
public class UserController {
	@Autowired
	private UserService userServices;

	// signup user
	@PostMapping("/signup")
	public ResponseEntity addUser(@Valid @RequestBody UserDTO dto, Errors errors) throws McartException  {
		String response = "";
		if (errors.hasErrors()) 
			{
				//collecting the validation errors of all fields together in a String delimited by commas
				response  = errors.getAllErrors().stream().map(ObjectError::getDefaultMessage).collect(Collectors.joining(","));
				ErrorMessage error = new ErrorMessage();
			    error.setErrorCode(HttpStatus.NOT_ACCEPTABLE.value());
			    error.setMessage(response);
			    return ResponseEntity.ok(error);
			}
			 else
			 {
				 response = userServices.addUser(dto);
				 return ResponseEntity.ok(response);
			 }
	}

	// login user
	@PostMapping("/login")
	public ResponseEntity loginUser(@Valid @RequestBody LoginDTO dto,Errors errors) throws McartException  {
		String response = "";
		if (errors.hasErrors()) 
			{
				//collecting the validation errors of all fields together in a String delimited by commas
				response  = errors.getAllErrors().stream().map(ObjectError::getDefaultMessage).collect(Collectors.joining(","));
				ErrorMessage error = new ErrorMessage();
			    error.setErrorCode(HttpStatus.BAD_REQUEST.value());
			    error.setMessage(response);
			    return ResponseEntity.ok(error);
			}
			 else
			 {
				 response = userServices.loginUser(dto);
				 return ResponseEntity.ok(response);
			 }
	}

	
}
