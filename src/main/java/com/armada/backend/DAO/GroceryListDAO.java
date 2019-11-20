package com.armada.backend.DAO;

import com.armada.backend.pojo.GroceryList;

import java.util.List;

public interface GroceryListDAO {

    List<GroceryList> getAllList();

    GroceryList updateList(GroceryList person);

    void deleteById(String listId);
}
