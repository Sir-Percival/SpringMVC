package com.example.springmvc.model;

import jakarta.validation.constraints.*;

import java.util.List;

public class Student
{
    @NotNull(message = "Required")
    @Size(min = 1, message = "Cannot be empty")
    private String firstName;
    @NotNull(message = "Required")
    @Size(min = 1, message = "Cannot be empty")
    private String lastName;
    private String country;
    @NotNull(message = "Select one")
    private String favouriteLanguage;
    @NotEmpty(message = "Select at least one")
    private List<String> operatingSystems;
    @NotNull(message = "Required")
    @Min(value = 18, message = "We only accept students aged 18 to 50")
    @Max(value = 50, message = "We only accept students aged 18 to 50")
    private Integer age;

    public Student() {
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFavouriteLanguage() {
        return favouriteLanguage;
    }

    public void setFavouriteLanguage(String favouriteLanguage) {
        this.favouriteLanguage = favouriteLanguage;
    }

    public List<String> getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(List<String> operatingSystems) {
        this.operatingSystems = operatingSystems;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
