package com.example.demo20;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class Controller {
	static int ctr=0;
	List<User> ListUsers = new ArrayList<>();
	
	
	@PostMapping("/creation")
	int Create(@RequestBody User user)
	{
		
		
		user.setID(ctr++);
		ListUsers.add(user);
		return user.getID();
	}
	
	
	
	@GetMapping("/info")
	User GetInfo(@RequestParam int id)
	{
		for(int i =0 ; i< ListUsers.size(); i++)
		{
			if(ListUsers.get(i).getID()==id)
				return ListUsers.get(i);
		}
		
		
		return null;
	}
}
