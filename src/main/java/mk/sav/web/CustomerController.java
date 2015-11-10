package mk.sav.web;

import mk.sav.entity.Technician;
import org.apache.log4j.Logger;
import org.apache.log4j.lf5.util.StreamUtils;
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
	

	
	 @ModelAttribute("frequencies")
	 
	     public Frequency[] frequencies() {
	         return Frequency.values();
	
	     }



    @RequestMapping(value = "/addCustomer", method = RequestMethod.GET)
    public String welcome(@ModelAttribute("customer") Customer customer, Model model) {

        return "addCustomer";
    }

	@RequestMapping(value ="/addCustomer", method=RequestMethod.POST)
	public String addCustomers(@ModelAttribute("customer") Customer customer, Model model){

		customerManager.addCustomer(customer);
		return "result";
	}


	@RequestMapping(value="/listCustomer", method=RequestMethod.GET)
	public String listCustomer(Model model){

		model.addAttribute("listCustomers", customerManager.getListCustomers());

		return "listCustomer";
	}

    @RequestMapping(value = "/addTechnician", method = RequestMethod.GET)
    public String addTechnician(@ModelAttribute("technician")Technician technician, Model model){
        return "addTechnician";
    }


}
