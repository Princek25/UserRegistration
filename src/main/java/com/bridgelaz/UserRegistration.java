package com.bridgelaz;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static Scanner sc =  new Scanner(System.in);
    static Pattern string = Pattern.compile("^[A-Z][a-z]{3,}$");
    static Pattern email = Pattern.compile("^[a-z+.]+@(.+)$");
    static Pattern mobile = Pattern.compile("^[0-9]{1,2}[0-9]{10}$");

    public static void main(String[] args) {
        System.out.println("Enter your first name:- ");
        String firstName = sc.next();
        System.out.println("Enter your last name:- ");
        String lastName = sc.next();
        System.out.println("Enter a valid email \n eg:- abc.xyz@bl.co.in");
        String emailValid = sc.next();
        System.out.println("Enter a Valid Mobile Number:- ");
        String mobileNo = sc.next();

        Matcher matchFirstName = string.matcher(firstName);
        Matcher matchLastName = string.matcher(lastName);
        if(matchFirstName.matches() && matchLastName.matches()){
            System.out.println("Valid Name");
        }
        else{
            System.out.println("Invalid Name ! \n First letter should be capital only and other should be in small");
        }
        Matcher matchEmail = email.matcher(emailValid);
        if(matchEmail.matches()){
            System.out.println("Valid Email");
        }
        else{
            System.out.println("Invalid Email");
        }
        Matcher matchNum = mobile.matcher(mobileNo);
        if (matchNum.matches()){
            System.out.println("Valid Mobile Number");
        }
        else {
            System.out.println("Invalid Mobile Number");
        }
        validPassword();
    }
    static public void validPassword () {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter password: \n Should have at least one upper case");
        String password = sc.next();
        Pattern p = Pattern.compile("^[A-Z]{1,}[a-zA-Z]{7,}$");
        Matcher matcher= p.matcher(password);
        boolean result = matcher.matches();
        if (result) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }
}


