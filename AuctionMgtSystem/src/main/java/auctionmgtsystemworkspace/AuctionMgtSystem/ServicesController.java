package auctionmgtsystemworkspace.AuctionMgtSystem;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ServicesController {
	@RequestMapping(value = "/services", method = RequestMethod.GET)
	public String devServices(Model backend) {
		backend.addAttribute("Databasing", "This data is coming direct from the server");
		return "services";
	}

}
