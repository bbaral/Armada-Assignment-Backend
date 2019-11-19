package com.armada.backend.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "groceryList")
public class GroceryList {
    @Id
    private String _id;
    private String name;
    private double quantities;
    private boolean isAvailable;
    private String description;
    private double numberOfUnits;
    private double pricePerUnit;
    private double totalAmount;

    public String get_Id() {
        return _id;
    }

    public void setId(String id) {
        this._id = id;
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

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
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
                ", isAvailable=" + isAvailable +
                ", description='" + description + '\'' +
                ", numberOfUnits=" + numberOfUnits +
                ", pricePerUnit=" + pricePerUnit +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
