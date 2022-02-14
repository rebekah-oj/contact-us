package com.contact.contact.us.controller;

import com.contact.contact.us.service.ContactService;
import com.contact.contact.us.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/")
public class ContactController {

       @Autowired
       ContactService contactService;

       @RequestMapping(value = "create", method = RequestMethod.POST)
       public Contact createContact(@RequestBody Contact contact){
           return contactService.createContact(contact);
       }

       @RequestMapping(value = "contact", method = RequestMethod.GET)
       public List<Contact> listContact(@RequestBody Contact contact){
           return contactService.getContact();
       }

       @RequestMapping(value = "contact/{id}", method = RequestMethod.DELETE)
       public void deleteContact(@PathVariable(value = "id") Contact id){
           contactService.deleteContact(id);
       }
}
