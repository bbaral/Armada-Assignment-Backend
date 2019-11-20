package com.armada.backend.Implementation;

import com.armada.backend.DAO.GroceryListDAO;
import com.armada.backend.pojo.GroceryList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
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

    @Override
    public GroceryList updateList(GroceryList list) {
        Query query = new Query();
        query.addCriteria(Criteria.where("_id").is(list.get_id()));
        Update update = new Update();
        update.set("name", list.getName());
        update.set("quantities", list.getQuantities());
        update.set("description", list.getDescription());
        update.set("numberOfUnits", list.getNumberOfUnits());
        update.set("pricePerUnit", list.getPricePerUnit());
        update.set("totalAmount", list.getTotalAmount());
        return mongoTemplate.findAndModify(query, update, GroceryList.class);
    }

    @Override
    public void deleteById(String listId) {
        Query query = new Query();
        query.addCriteria(Criteria.where("_id").is(listId));
        mongoTemplate.remove(query, GroceryList.class);
    }
}
