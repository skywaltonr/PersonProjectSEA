package com.example.personproject.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Getter
@Setter
@Entity(name = "Person")
public class Person {
    public Person(){

    }
    public Person(String firstName, String lastName, int Age){
        this.firstname = firstName;
        this.lastname = lastName;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    @Id
    @NotNull
    private int id;
    @NotNull
    @Size(min=3, max=20)
    private String firstname;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Size(min=3, max=20)
    private String lastname;

    @Min(18)
    @Max(75)
    private int age;


}
