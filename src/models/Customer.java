package models;

import java.time.LocalDate;

public class Customer {
    private String firstName;
    private String email;
    private LocalDate localDate;
    private String phoneNumber;

    public Customer(){}

    public Customer(String firstName, String email, LocalDate localDate, String phoneNumber) {
        this.firstName = firstName;
        this.email = email;
        this.localDate = localDate;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "models.Customer{" +
                "firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                ", localDate=" + localDate +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
