package org.example;

public class Main {
    public static void main(String[] args) {

        //Passwort-Eingabe und erfolgreich verifiziert
        String password = "oord";
        if(isPasswordValid(password)) {
            System.out.println("Ihr gewähltes Passwort ist sicher!");
        }


    }

        //Rückgabe-Werte zusammengefasste Überprüfung & Fehlerausgabe
    public static boolean isPasswordValid(String password) {
        if(!isPasswordLengthValid(password))
            System.out.println("Ihr Passwort ist unsicher; verwenden Sie mindestens 8 Zeichen!");
        if (!containsDigits(password))
            System.out.println("Ihr Passwort ist unsicher; verwenden Sie mindestens eine Zahl");

        return isPasswordLengthValid(password) && containsDigits(password);
    }

        //Überprüfung mindestens 8 Zeichen
    public static boolean isPasswordLengthValid(String password) {
        return password.length() >= 8;
    }

        //Überprüfung mindestens eine Zahl
    public static boolean containsDigits(String password) {
        for(char character : password.toCharArray()) {
            if (Character.isDigit(character))
                return true;
        }
        return false;
    }
}