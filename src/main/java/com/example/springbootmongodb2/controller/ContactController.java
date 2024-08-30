package com.example.springbootmongodb2.controller;

import com.example.springbootmongodb2.collection.Contact;
import com.example.springbootmongodb2.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contacts")
public class ContactController {
    @Autowired
    private ContactService contactService;
    @PostMapping
    public String save(@RequestBody Contact contact){
        return contactService.save(contact);
    }
    @GetMapping
    public List<Contact> getContactWith(){
        return contactService.getAll();
    }
    @DeleteMapping
    public void delete(@PathVariable String id){
        contactService.delete(id);
    }

}
