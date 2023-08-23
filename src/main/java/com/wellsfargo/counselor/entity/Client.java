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
public class Client {

    @Id // Primary key field
    @GeneratedValue()
    private long advisorId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String clientId;

    protected Client() {

    }

    public Client(String firstName, String lastName, String address, String phone, String email, long advisorId,
            String clientId) {
        this.clientId = clientId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.advisorId = advisorId;
    }

    public Long getAdvisorId() {
        return advisorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
