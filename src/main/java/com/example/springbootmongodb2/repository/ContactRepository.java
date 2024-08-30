package com.example.springbootmongodb2.repository;

import com.example.springbootmongodb2.collection.Contact;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends MongoRepository<Contact,String> {
//     List<ArtWork> findByNameWith(String name);
//     List <Person> findByAgeBetween(Integer min,Integer max);
}
