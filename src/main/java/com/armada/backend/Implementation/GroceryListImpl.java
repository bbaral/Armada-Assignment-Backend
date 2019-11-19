package com.armada.backend.Implementation;

import com.armada.backend.DAO.GroceryListDAO;
import com.armada.backend.pojo.GroceryList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GroceryListImpl implements GroceryListDAO {

    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public List<GroceryList> getAllList() {
        return mongoTemplate.findAll(GroceryList.class);
    }
}
