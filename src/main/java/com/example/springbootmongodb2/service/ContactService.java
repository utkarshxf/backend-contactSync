package com.example.springbootmongodb2.service;

import com.example.springbootmongodb2.collection.Contact;

import java.util.List;

public interface ContactService {
    String save(Contact contact);

//    List<ArtWork> getArtworkStartWith(String name);

    void delete(String id);

    List<Contact> getAll();
}
