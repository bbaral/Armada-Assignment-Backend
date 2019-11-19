package com.armada.backend.repository;

import com.armada.backend.pojo.GroceryList;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroceryListRepository extends MongoRepository<GroceryList, String> {
}
