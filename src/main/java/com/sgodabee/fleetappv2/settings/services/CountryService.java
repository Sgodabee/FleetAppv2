package com.sgodabee.fleetappv2.settings.services;

import com.sgodabee.fleetappv2.settings.models.Country;
import com.sgodabee.fleetappv2.settings.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public List<Country> findAll(){
        return countryRepository.findAll();
    }

    public  void save(Country country){
        countryRepository.save(country);
    }

    public void delete(Integer id) {
        countryRepository.deleteById(id);
    }

    public Country getById(Integer id) {
        return countryRepository.findById(id).orElse(null);
    }

    public void update(Country country) {
        countryRepository.save(country);
    }
}
