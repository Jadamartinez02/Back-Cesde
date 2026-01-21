package com.pangea.pangea.models;

import java.util.UUID;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private Double price;
    private String description;
    @Column(length = 100 ,nullable = false)
    private String fabricationPeriod;
    @Column(length = 100 ,nullable = false)
    private String supplierName;
    @Column(nullable = false)
    private Integer stock;
    @Column(length = 100 ,nullable = false)
    private String rarity;
    @Column(nullable = false)
    private Float weight;
    @Column(length = 100 ,nullable = false)
    private String material;
    @Column(length = 100 ,nullable = false)
    private String category;
    
    public Product(){
        
    }

    public Product(int id, String name, Double price, String description, String fabricationPeriod, String supplierName,
            Integer stock, String rarity, Float weight, String material, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.fabricationPeriod = fabricationPeriod;
        this.supplierName = supplierName;
        this.stock = stock;
        this.rarity = rarity;
        this.weight = weight;
        this.material = material;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFabricationPeriod() {
        return fabricationPeriod;
    }

    public void setFabricationPeriod(String fabricationPeriod) {
        this.fabricationPeriod = fabricationPeriod;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
    

}
