package com.api.customerapi.entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter@Setter
@Entity
@Table(name = "CUSTOMERS")
public class Customer {
    @Id
    @Column(length = 20, nullable = false, unique = true)
    private String customerId;
    @Column(length = 50)
    private String firstName;
    @Column(length = 50)
    private String lastName;
    @Column(length = 50)
    private String username;
    @Column(length = 100)
    private String email;
    @Column(length = 30)
    private String phoneNumber;
    @Column(length = 250)
    private String address;
    @Column(length = 100)
    private String city;
    @Column(length = 100)
    private String state;
    @Column(length = 20)
    private String zipCode;
    @Column(nullable = false)
    private LocalDateTime createdDate;
    @Column(length = 50)
    private String createdBy;
}
