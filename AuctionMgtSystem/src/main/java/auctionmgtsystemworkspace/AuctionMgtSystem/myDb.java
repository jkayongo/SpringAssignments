package auctionmgtsystemworkspace.AuctionMgtSystem;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import auctionmgtsystemworkspace.AuctionMgtSystem.model.UserModel;
import auctionmgtsystemworkspace.AuctionMgtSystem.service.UserService;

@Controller
public class myDb {
	@Autowired
	private UserService userService;
	@RequestMapping(value = "/customers", method = RequestMethod.GET)
    public String listCustomers(Model companyCustomers) {
		companyCustomers.addAttribute("newCustomers", "You registered new customers");
        return "CustomerList"; // Return the view name (JSP or Thymeleaf)
    }
	@RequestMapping(value = "/joshua", method = RequestMethod.GET)
	public String trial(Model test1) {
		test1.addAttribute("initialTest", "Well tested,no issues,please proceed");
		return "tester";
	}
	@RequestMapping(value = "/mytechstack", method = RequestMethod.GET)
	public String devTechStack(Model model) {
		model.addAttribute("update", "Your tech stack has been successfully updated");
		DeveloperModel developer = new DeveloperModel("Joshua Kayongo", 24);
		model.addAttribute("developer", developer);
		return "mytechstack";
	}
	@RequestMapping(value = "/projects", method = RequestMethod.GET)
	public String devProjects(Model project) {
		project.addAttribute("status", "You completed all your projects,thank you");
		return "projects";
	}
//	@RequestMapping(value = "/partners", method = RequestMethod.GET)
//	public String devPartners(Model companyPartners) {
//		companyPartners.addAttribute("alert", "You have new partners,watch out!");
//		return "partners";
//	}
	//getting the form
	@RequestMapping(value = "/userProfile", method = RequestMethod.GET)
	public String user() {
		return "user";
	}
	//posting the form to /appUsers and returning to the page called mytechstack
	@RequestMapping(value = "/appUsers", method = RequestMethod.POST)
	public String appUsers(@ModelAttribute("user") UserModel userModel) {
		System.out.println("We have the following users:" + userModel);
		userService.saveUser(userModel);
		return "mytechstack";
	}
	//fetching data from the db to the page/view
	@RequestMapping(value = "/viewUsers", method = RequestMethod.GET)
	public String viewUsers(Model model) {
		List<UserModel> users = userService.getAllUsers();
		System.out.println("These are the system users: " + users.size());
		model.addAttribute("systemUsers", users);
		return "viewUsers";
		
	}
	//sending data from the controller to the page/view
	@RequestMapping(value = "/companies", method = RequestMethod.GET)
	public String devCompanies(Model model) {
		model.addAttribute("companyStatus", "Here are the companies we have worked for");
		return "companies";
	}
	//deleting a user
	@RequestMapping(value = "/deleteUser/{id}", method = RequestMethod.GET)
    public String deleteUser(@PathVariable("id") int id, Model model) {
		userService.deleteUser(id);
        String message = "The user has been deleted successfully.";
        model.addAttribute("deleteMessage", message);
        return "deleteUser";
    }
	//Getting a user to update
	@RequestMapping(value = "/userToUpdate/{id}", method = RequestMethod.GET)
	public String userToUpdate(@PathVariable("id") int id, Model model) {
		UserModel userModel = userService.getUserById(id);
		model.addAttribute("user", userModel);
		return "updateForm";
        
	}
	//showing user that has been actually updated
	@RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public String updateUser(@PathVariable("id") int id ,@ModelAttribute("user") UserModel userModel, Model model) {
		UserModel userToActuallyUpdate = userService.getUserById(id);
		userToActuallyUpdate.setUserName(userModel.getUserName());
		userToActuallyUpdate.setEmail(userModel.getEmail());
		userToActuallyUpdate.setPlaceOfResidence(userModel.getPlaceOfResidence());
		userService.updateUser(userToActuallyUpdate);
		
		
		
		
//        String message = "User: "  + userModel.getUserName() + " " + userModel.getEmail() + " " + userModel.getPlaceOfResidence() + " " + "has been successfully updated.";
//        model.addAttribute("updateMessage", message);
        return "showUserUpdated";
    }


	

}
