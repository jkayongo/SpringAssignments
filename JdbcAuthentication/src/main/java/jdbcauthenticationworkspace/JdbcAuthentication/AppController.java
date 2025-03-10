package jdbcauthenticationworkspace.JdbcAuthentication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AppController {
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String showAdminDashboard() {
		return "adminDashBoard";
	}
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginUser() {
		return "login";
	}
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String showUser() {
		return "appUsers";
	}
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String registerUser() {
		return "registeredUsers";
	}

}
