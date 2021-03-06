package com.sgodabee.fleetappv2.settings.controllers;

import com.sgodabee.fleetappv2.settings.models.Supplier;
import com.sgodabee.fleetappv2.settings.services.CountryService;
import com.sgodabee.fleetappv2.settings.services.StateService;
import com.sgodabee.fleetappv2.settings.services.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class SupplierController {
	
	@Autowired private StateService stateService;
	@Autowired private CountryService countryService;
	@Autowired private SupplierService supplierService;
	
	//Get All Suppliers
	@GetMapping("/parameters/suppliers")
	public String findAll(Model model){		
		model.addAttribute("countries", countryService.findAll());
		model.addAttribute("states", stateService.findAll());
		model.addAttribute("suppliers", supplierService.findAll());
		return "suppliers";
	}	
	
	@RequestMapping("suppliers/findById") 
	@ResponseBody
	public Optional<Supplier> findById(Integer id)
	{
		return supplierService.findById(id);
	}
	
	//Add Supplier
	@PostMapping(value="suppliers/addNew")
	public String addNew(Supplier supplier) {
		supplierService.save(supplier);
		return "redirect:/suppliers";
	}	
	
	@RequestMapping(value="suppliers/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(Supplier supplier) {
		supplierService.save(supplier);
		return "redirect:/suppliers";
	}
	
	@RequestMapping(value="suppliers/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Integer id) {
		supplierService.delete(id);
		return "redirect:/suppliers";
	}


}
