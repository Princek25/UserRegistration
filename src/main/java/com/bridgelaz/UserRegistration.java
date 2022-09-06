package com.bridgelaz;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserRegistration regex = new UserRegistration();
        System.out.println("Enter First Name:- ");
        String firstName = sc.next();
        System.out.println("Enter Last Name:- ");
        String lastname = sc.next();
        System.out.println("Enter a Valid Email \n eg:- abc.xyz@bl.co.in ");
        String emailValid = sc.next();
        System.out.println("Enter a Valid Mobile Number:- ");
        String phoneNo = sc.next();
        System.out.println("Enter a Valid Password:- ");
        String passWord = sc.next();
        regex.firstNameValidate(firstName);
        regex.lastNameValidate(lastname);
        regex.emailValidation(emailValid);
        regex.phoneValidation(phoneNo);
        regex.passwordValidation(passWord);

    }
    public boolean firstNameValidate(String firstName){
        Pattern name = Pattern.compile("^[A-Z][a-z]{3,}$");
        Matcher matchFirstName = name.matcher(firstName);
        if (matchFirstName.matches())
            System.out.println("Valid First Name");
        else
            System.out.println("Invalid First Name");


        return matchFirstName.matches();
    }
    public boolean lastNameValidate(String lastName){
        Pattern name = Pattern.compile("^[A-Z][a-z]{3,}$");
        Matcher matchLastName = name.matcher(lastName);
        if (matchLastName.matches())
            System.out.println("Valid Last Name");
        else
            System.out.println("Invalid Last Name");
        return matchLastName.matches();
    }
    public boolean emailValidation(String email){
        Pattern emailValid = Pattern.compile("^[a-z+.]+@(.+)$");
        Matcher matchEmail = emailValid.matcher(email);
        if (matchEmail.matches()){
            System.out.println("Valid Email");
        }
        else {
            System.out.println("Invalid Email");
        }
        return matchEmail.matches();
    }
    public boolean phoneValidation(String phoneNum){
        Pattern phNo = Pattern.compile("^[0-9]{1,2}[0-9]{10}$");
        Matcher matchPhone = phNo.matcher(phoneNum);
        if (matchPhone.matches()){
            System.out.println("Valid Phone Number");
        }
        else {
            System.out.println("Invalid Phone Number");
        }
        return matchPhone.matches();
    }
    public boolean passwordValidation(String password){
        Pattern passWord = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])+(?=.*[@#$%^&+=])+(?=.*[0-9]).{8,20}$");
        Matcher matchPassword = passWord.matcher(password);
        if (matchPassword.matches()){
            System.out.println("Valid Password");
        }
        else {
            System.out.println("Invalid Password \n Password should contain at least 8 character, 1 uppercase,1 lowercase, 1 number, 1 special character");
        }
        return matchPassword.matches();
    }
}


