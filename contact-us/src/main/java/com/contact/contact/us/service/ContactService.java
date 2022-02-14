package com.contact.contact.us.service;

import com.contact.contact.us.repository.ContactRepository;
import com.contact.contact.us.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

    @Autowired
    ContactRepository contactRepository;

    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public Contact createContact(Contact contact){
        return contactRepository.save(contact);
    }

    public List<Contact> getContact() {
        return contactRepository.findAll();
    }

     public void deleteContact(Contact id){
         contactRepository.delete(id);
     }
}
