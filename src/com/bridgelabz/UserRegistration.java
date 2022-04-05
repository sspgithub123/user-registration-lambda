package com.bridgelabz;
/**
 * Program on User Registration Using Regex
 *
 * @author : Shubham Pawar
 * @since : 04/04/2022
 * */

import java.util.regex.Pattern;

//Functional interface
interface Validation {
    String validate(String regex, String userDetails);
}

public class UserRegistration {

    public static void main(String[] args) {
        System.out.println("Welcome to the lambda function validation");

        Validation isValidFirstName = (pattern, firstName) -> {
            return "First Name is " + Pattern.compile(pattern).matcher(firstName).matches();
        };
        System.out.println(isValidFirstName.validate("^[A-Z]{1}[a-z]{2,}$", "Shubham"));

        Validation isValidLastName = (pattern, lastName) -> {
            return "Last Name is " + Pattern.compile(pattern).matcher(lastName).matches();
        };
        System.out.println(isValidLastName.validate("^[A-Z]{1}[a-z]{2,}$", "Pawar"));

        Validation isValidEmail = (pattern, email) -> {
            return "Email is " + Pattern.compile(pattern).matcher(email).matches();
        };
        System.out.println(isValidEmail.validate("^[a-z]+[+-_.]*[a-z]*[@][a-z]+[.][a-z]{2,4}[.]*([a-z]{2})*$",
                "Shubham.shu@gmail.com"));
        Validation isValidMobileNumber = (pattern, mobileNumber) -> {
            return "Mobile number is " + Pattern.compile(pattern).matcher(mobileNumber).matches();
        };
        System.out.println(isValidMobileNumber.validate("^[91]+[ ]?[6-9]{1}[0-9]{9}$", "91 8530705596"));

    }
}