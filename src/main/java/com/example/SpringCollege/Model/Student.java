package com.example.SpringCollege.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data@AllArgsConstructor
public class Student
    {
        private String firstName;
        private String lastName;
        private String dateOfBirth;
        private long mobileNo;
        private String address;
        private String city;
        private long postalCode;


    }
