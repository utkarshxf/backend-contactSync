package com.example.springbootmongodb2.service;

import com.example.springbootmongodb2.collection.Person;
import org.bson.Document;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PersonService {
    String save(Person person);

    List<Person> getPersonStartWith(String name);

    void delete(String id);

    List<Person> getByPersionAge(Integer minAge, Integer maxAge);

    Page<Person> search(String name, Integer minAge, Integer maxAge, String city, Pageable pageable);

    List<Document> getOldestpersonByCity();

    List<Document> getPopulationByCity();
}
