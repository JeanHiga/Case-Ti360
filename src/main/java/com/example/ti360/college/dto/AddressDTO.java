package com.example.ti360.college.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class AddressDTO implements Serializable {

    private String city;
    private String state;
    private String street;

}
