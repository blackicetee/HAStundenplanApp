package com.example.HAStundenplanApp;

/**
 * Created by Jason on 19.06.2016.
 */
public class ProfileData {
    String firstName;
    String lastName;
    String grade;
    String classSpecification;


    public ProfileData(String firstName, String lastName, String grade, String classSpecification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.classSpecification = classSpecification;
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

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getClassSpecification() {
        return classSpecification;
    }

    public void setClassSpecification(String classSpecification) {
        this.classSpecification = classSpecification;
    }
}
