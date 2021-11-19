package com.sgodabee.fleetappv2.settings.repositories;

import com.sgodabee.fleetappv2.settings.models.Location;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {

}
