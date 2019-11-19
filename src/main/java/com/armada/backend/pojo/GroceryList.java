package com.armada.backend.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "groceryList")
public class GroceryList {
    @Id
    private String _id;
    private String name;
    private double quantities;
    private String description;
    private double numberOfUnits;
    private double pricePerUnit;
    private double totalAmount;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getQuantities() {
        return quantities;
    }

    public void setQuantities(double quantities) {
        this.quantities = quantities;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getNumberOfUnits() {
        return numberOfUnits;
    }

    public void setNumberOfUnits(double numberOfUnits) {
        this.numberOfUnits = numberOfUnits;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "GroceryList{" +
                "id='" + _id + '\'' +
                ", name='" + name + '\'' +
                ", quantities=" + quantities +
                ", description='" + description + '\'' +
                ", numberOfUnits=" + numberOfUnits +
                ", pricePerUnit=" + pricePerUnit +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
