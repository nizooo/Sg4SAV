//package mk.sav.web;
//
//import org.apache.log4j.Logger;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import mk.sav.internal.TechnicianRepository;
//
//@Controller
//public class TechnicianController {
//	
//	@Autowired
//	TechnicianRepository technicianRepo;
//	
//	private static final Logger LOGGER = Logger.getLogger(TechnicianController.class);
//	
//
//	@RequestMapping(value="/getTechnician", method=RequestMethod.GET)
//	public String getTechnicianById(@RequestParam("techId") long id, Model model){
//		technicianRepo.findById(id);
//		
//		return "technician";
//	}
//	
//	
////	@RequestMapping(value ="/addCustomer", method=RequestMethod.POST)
////	public String addCustomers(@ModelAttribute("customer") Customer customer, Model model){
////		
////		technicianRepo.addCustomer(customer);
////		return "result";
////	}
//	
////	@RequestMapping(value ="/addCustomer", method=RequestMethod.GET)
////	public String welcome(@ModelAttribute("customer") Customer customer, Model model){
////				
////		return "addCustomer";
////	}
////	
////	@RequestMapping(value="/listCustomer", method=RequestMethod.GET)
////	public String listCustomer(Model model){
////		
////		model.addAttribute("listCustomers", technicianRepo.getListCustomers());
////		
////		return "listCustomer";
////	}
//	
//
//}
