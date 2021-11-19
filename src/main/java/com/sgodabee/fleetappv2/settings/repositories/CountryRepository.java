package com.sgodabee.fleetappv2.settings.repositories;

import com.sgodabee.fleetappv2.settings.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {
}
