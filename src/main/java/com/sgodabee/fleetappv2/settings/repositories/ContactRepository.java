package com.sgodabee.fleetappv2.settings.repositories;

import com.sgodabee.fleetappv2.settings.models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
