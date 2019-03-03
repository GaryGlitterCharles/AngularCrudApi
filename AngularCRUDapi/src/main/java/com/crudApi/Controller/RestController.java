package com.crudApi.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crudApi.Domain.UserForm;
import com.crudApi.Repo.JpaRepo;

@Controller
public class RestController {

	@Autowired
	private JpaRepo repo;

	@PostMapping("/create")
	public @ResponseBody UserForm createUser(@RequestParam("id") int id, @RequestParam("email")String email, @RequestParam("first_name")String firtsname,@RequestParam("last_name")String lastname,@RequestParam("phone_number")String phonenumber) {
		UserForm userForm = new UserForm();
		userForm.setEmail(email);
		userForm.setFirstName(firtsname);
		userForm.setId(id);
		userForm.setLastName(lastname);
		userForm.setPhoneNumber(phonenumber);
		
		return repo.save(userForm);
		
	}

}
