package org.dyanyog.services;

import org.dyanyog.dto.AddUserRequest;
import org.dyanyog.dto.AddUserResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
@Service
public class AddUserServices {

	
	public AddUserResponse validate (@RequestBody AddUserRequest loginRequest)
	{
		AddUserResponse response = new AddUserResponse();
		if(loginRequest.getuserid().equalsIgnoreCase("123") &&
		   loginRequest.getusername().equalsIgnoreCase("jhon Doe")&&
		   loginRequest.getuseremail().equalsIgnoreCase("jhon.doe@example.com")&&
		   loginRequest.getuserage().equalsIgnoreCase("28")
		   
		   
		   ) 
{
	response.setStatus("success");
	response.setMessage("user successfully added");
	response.setuserid("123");
	response.setusername("jhon Doe");
	response.setuseremail("jhon.doe@example.com");
	response.setuserage("28");
	
	
}else {

	response.setStatus("fail");
	response.setMessage("user not found");
      }
        return response;
	}
}
