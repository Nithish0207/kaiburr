package com.example.Myapi.Repository;

import com.example.Myapi.Entity.Server;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServerRepository extends MongoRepository<Server, String> {
    // Spring Data MongoDB will provide the implementation for standard CRUD operations.
    // You can define custom query methods here if needed.
    List<Server> findByNameContaining(String name);

}



