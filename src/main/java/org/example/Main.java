package org.example;

public class Main {
    public static void main(String[] args) {

        String password = "pAs5w0rd";
        if(isPasswordValid(password)) {
            System.out.println("Ihr gewähltes Passwort ist sicher!");
        }


    }

    public static boolean isPasswordValid(String password) {
        if(!isPasswordLengthValid(password))
            System.out.println("ihr Passwort hat weniger als 8 Zeichen");

        return isPasswordLengthValid(password);
    }


    public static boolean isPasswordLengthValid(String password) {
        return password.length() >= 8;
    }

}