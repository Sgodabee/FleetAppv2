package com.sgodabee.fleetappv2.settings.controllers;

import com.sgodabee.fleetappv2.settings.models.Location;
import com.sgodabee.fleetappv2.settings.services.CountryService;
import com.sgodabee.fleetappv2.settings.services.LocationService;
import com.sgodabee.fleetappv2.settings.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LocationController {
	
	@Autowired	private LocationService locationService;
	@Autowired	private CountryService countryService;
	@Autowired	private StateService stateService;

	public Model addModelAttributes(Model model){
		model.addAttribute("locations", locationService.findAll());
		model.addAttribute("countries", countryService.findAll());
		model.addAttribute("states", stateService.findAll());
		return model;
	}
	
	@GetMapping("/locations")
	public String findAll(Model model){
		addModelAttributes(model);
		return "/settings/locationList";
	}

	@GetMapping("/locationAdd")
	public String addLocation(Model model){
		addModelAttributes(model);
		return "/settings/locationAdd";
	}

	//The op parameter is either Edit or Details
	@GetMapping("/parameters/location/{op}/{id}")
	public String editLocation(@PathVariable Integer id, @PathVariable String op, Model model){
		Location location = locationService.findById(id);
		model.addAttribute("location", location);
		addModelAttributes(model);
		return "/parameters/location"+ op; //returns locationEdit or locationDetails
	}

	@PostMapping("/parameters/locations")
	public String save(Location location) {
		locationService.save(location);
		return "redirect:/parameters/locations";
	}
	
	@RequestMapping(value="/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String deleteById(@PathVariable Integer id) {
		locationService.deleteById(id);
		return "redirect:/parameters/locations";
	}
	
}
