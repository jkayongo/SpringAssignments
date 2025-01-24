package LandMgtSystem.landmgtsystemworkspace;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


public class GreetingController {
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public String index() {
//		return "index.jsp";
//	}
	
	@RequestMapping(value = "/joshua", method = RequestMethod.GET)
	public String dbz() {
		return "index";
	}
	
//	@RequestMapping(value = "/Good/morning", method = RequestMethod.GET)
//	public String greeting(Model model) {
//	    String hey = "Good morning my wonderful student, Debbie.";
//	    model.addAttribute("message", hey);
//	    return "greeting"; 
//	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
