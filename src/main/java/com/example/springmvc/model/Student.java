package com.example.springmvc.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

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
}
