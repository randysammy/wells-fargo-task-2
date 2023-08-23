package com.wellsfargo.counselor.entity;

import javax.sound.sampled.Port;

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
public class Portfolio {

    @Id // Primary key field
    @GeneratedValue()
    private long portfolioId;

    @Column(nullable = false)
    private String clientId;

    @Column(nullable = false)
    private String creationDate;

    protected Portfolio() {

    }

    public Portfolio(String clientId, String creationDate, long portfolioId) {
        this.clientId = clientId;
        this.creationDate = creationDate;
        this.portfolioId = portfolioId;

    }

    public String getClientId() {
        return clientId;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

}
