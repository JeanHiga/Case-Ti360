package com.example.ti360.college.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "address_id")
    private Long id;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "street")
    private String street;

    public Address(String city, String state, String street) {
        this.city = city;
        this.state = state;
        this.street = street;
    }

    public Address() {
    }
}
