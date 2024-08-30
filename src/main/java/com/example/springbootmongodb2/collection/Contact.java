package com.example.springbootmongodb2.collection;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document(collection = "contacts")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Contact {
    @Id
    private String id; // or @GeneratedValue for auto-generated IDs, if needed
    private String firstName;
    private String lastName;
    private String phoneNumber;
}
