package springsecurityoneononeworkspace.SpringSecurityOneOnOne.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String welcomeAdmin() {
		return "adminPage";
	}
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String allowLogin() {
		return "login";
	}
	@RequestMapping(value = "/accounts/sales", method = RequestMethod.GET)
	public String checkSales() {
		return "accounts";
	}

}
