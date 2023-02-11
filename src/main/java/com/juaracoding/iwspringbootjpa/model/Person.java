package com.juaracoding.iwspringbootjpa.model;

/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author Iqbal Wibisono  a.k.a Iqbal Wibisono
Java Developer
Created on 09/02/2023 20:33
@Last Modified 09/02/2023 20:33
Version 1.1
*/

import org.hibernate.validator.constraints.Length;

import  javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

@Entity
@Table(name = "MstPerson")


public class Person {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @Length(message = "Maksimal Karakter 15")
    @Column(name = "FirstName", nullable = false, length = 15)
    private String firstName;
    @Column(name = "MiddleName",nullable = true,length = 15)
    private String middleName;
    @Column(name = "LastName",length = 15)
    private String lastName;
    @Column(name = "DayOfBirth")
    private LocalDate dayOfBirth;

    public LocalDate getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(LocalDate dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public Integer getAge() {
        return Period.between(this.dayOfBirth,LocalDate.now()).getYears();
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Transient
    private Integer age;
    @Column(name = "CreatedDate")
    private Date createdDate;
    @Column(name = "CreatedBy")

    private Integer createdBy;
    @Column(name = "ModifiedDate")
    private Date modifiedDate;
    @Column(name = "ModifiedBy")
    private Integer modifiedBy;
    @Column(name = "IsDelete")
    private boolean isDelete;
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

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
