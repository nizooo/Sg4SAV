package mk.sav.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import mk.sav.internal.CustomerManager;

@Controller
public class CustomerController {
	
	@Autowired
	CustomerManager customerManager;
	
	@RequestMapping("/welcome")
	public ModelAndView helloWorld(){
		
		String message = "<h3>the customer name is : </h3>"+customerManager.getCustomerName();
		return new ModelAndView("welcome", "message", message);
	}

}
