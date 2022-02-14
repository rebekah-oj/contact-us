package com.contact.contact.us.repository;

import com.contact.contact.us.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

    //void delete(Long id);
}
