package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

// an entitiy is a java class that represents a table in a relational database. 
// We use entites to model and interact with database tables in oop applicaitons.

@Entity // indicates JPA entity

// A corresponding JPA entity class for Fin. Advisor

// using this class we can use JPA to perform database operations for fin.
// advisors using relational relationshoips in the database.
public class Security {

    @Id // Primary key field
    @GeneratedValue()
    private long securityId;

    @Column(nullable = false)
    private String portfolioId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private String purchasePrice;

    @Column(nullable = false)
    private String purchaseDate;

    @Column(nullable = false)
    private int quantiy;

    protected Security() {

    }

    public Security(String portfolioId, String name, String category, String purchasePrice, String purchaseDate,
            int quantiy) {
        this.portfolioId = portfolioId;
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantiy = quantiy;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getpurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(String purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public int getQuantity() {
        return quantiy;
    }

    public void setQuantity(int quantiy) {
        this.quantiy = quantiy;
    }
}
