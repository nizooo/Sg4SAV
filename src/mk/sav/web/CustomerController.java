package mk.sav.web;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mk.sav.entity.Customer;
import mk.sav.entity.Customer.Frequency;
import mk.sav.internal.CustomerManager;

@Controller
public class CustomerController {
	
	@Autowired
	CustomerManager customerManager;
	
	private static final Logger LOGGER = Logger.getLogger(CustomerController.class);
	
//	@RequestMapping("/welcome")
//	public ModelAndView helloWorld(){
//		
//		String message = "<h3>the customer name is : </h3>"+customerManager.getCustomerName();
//		return new ModelAndView("welcome", "message", message);
//	}
	
	 @ModelAttribute("frequencies")
	 
	     public Frequency[] frequencies() {
	 
	         return Frequency.values();
	
	     }


	
//	@RequestMapping("/welcome")
//	public String helloWorld(){
//		LOGGER.info("********************** into helloWorld method *****************");
//		return "welcome";
//	}
	
	
	@RequestMapping(value ="/addCustomer", method=RequestMethod.POST)
	public String addCustomers(@ModelAttribute("customer") Customer customer, Model model){
		
		model.addAttribute("name", customer.getName());
//		model.addAttribute("address", customer.getAddress());
//		model.addAttribute("age", customer.getAge());
//		model.addAttribute("msg", "ajout avec succe");
//			
		
		//model.addAttribute("name", customer.getName());
		return "result";
	}
	
	@RequestMapping(value ="/addCustomer", method=RequestMethod.GET)
	public String welcome(@ModelAttribute("customer") Customer customer, Model model){
		
		model.addAttribute("customer", new Customer());
//		model.addAttribute("address", customer.getAddress());
//		model.addAttribute("age", customer.getAge());
//		model.addAttribute("msg", "ajout avec succe");
//			
		
		//model.addAttribute("name", customer.getName());
		return "addCustomer";
	}

}
