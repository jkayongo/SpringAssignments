package auctionmgtsystemworkspace.AuctionMgtSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import auctionmgtsystemworkspace.AuctionMgtSystem.model.UserModel;
import auctionmgtsystemworkspace.AuctionMgtSystem.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping(value = "/partners", method = RequestMethod.GET)
	public String saveUser() {
		UserModel userModel = new UserModel("wnampala", "wnampala@gmail.com", "Dodoma");
		userService.saveUser(userModel);
		return "partners";
	}
	
}
