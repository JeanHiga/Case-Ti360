package com.example.ti360.college.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class StudentDTO implements Serializable {

    private Long id;
    private String name;
    private String phone;
    private AddressDTO address;

}
