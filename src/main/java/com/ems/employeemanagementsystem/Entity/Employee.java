package com.ems.employeemanagementsystem.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "first_line_address", nullable = false)
    private String firstLineAddress;

    @Column(name = "second_line_address", nullable = true)
    private String secondLineAddress;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "post_code", nullable = false)
    private String postCode;

    @Column(name = "contact_number", nullable = false)
    private Long contactNumber;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "position", nullable = false)
    private String position;

    public Employee(Long id, String firstName, String lastName, String firstLineAddress,
                    String secondLineAddress, String city, String postCode,
                    Long contactNumber, String email, String position) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.firstLineAddress = firstLineAddress;
        this.secondLineAddress = secondLineAddress;
        this.city = city;
        this.postCode = postCode;
        this.contactNumber = contactNumber;
        this.email = email;
        this.position = position;
    }

    public Employee() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getFirstLineAddress() {
        return firstLineAddress;
    }

    public void setFirstLineAddress(String firstLineAddress) {
        this.firstLineAddress = firstLineAddress;
    }

    public String getSecondLineAddress() {
        return secondLineAddress;
    }

    public void setSecondLineAddress(String secondLineAddress) {
        this.secondLineAddress = secondLineAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public Long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(Long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
