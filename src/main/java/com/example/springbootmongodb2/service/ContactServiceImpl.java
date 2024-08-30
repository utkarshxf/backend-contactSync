package com.example.springbootmongodb2.service;

import com.example.springbootmongodb2.collection.Contact;
import com.example.springbootmongodb2.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {
    @Autowired
    private ContactRepository contactRepository;
    @Autowired
    private MongoTemplate mongoTemplate;
    @Override
    public String save(Contact contact) {
        return contactRepository.save(contact).getId();
    }
    @Override
    public void delete(String id) {
        contactRepository.deleteById(id);
    }

    @Override
    public List<Contact> getAll() {
        return contactRepository.findAll();
    }


}

