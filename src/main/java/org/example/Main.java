package org.example;

public class Main {
    public static void main(String[] args) {

        //Passwort-Eingabe und erfolgreich verifiziert
        String password = "oord";
        if(isPasswordValid(password)) {
            System.out.println("Ihr gewähltes Passwort erfüllt alle Bedingungen für eine gute Sicherheit!");
        }
    }

        //Rückgabe-Werte; zusammengefasste Überprüfung & Fehlerausgabe

    public static boolean isPasswordValid(String password) {
        if(!isPasswordLengthValid(password))
            System.out.println("Ihr Passwort ist unsicher; verwenden Sie mindestens 8 Zeichen!");
        if (!containsDigits(password))
            System.out.println("Ihr Passwort ist unsicher; verwenden Sie mindestens eine Zahl!");
        if (!containsUpperCaseAndLowerCase(password))
            System.out.println("Ihr Passwort ist unsicher; verwenden Sie Groß- und Kleinbuchstaben!");

        return isPasswordLengthValid(password) && containsDigits(password) && containsUpperCaseAndLowerCase(password);
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

        //Überprüfung Groß- und Kleinbuchstaben

    public static boolean containsUpperCaseAndLowerCase(String password) {
        boolean containsUpperCase = false;
        boolean containsLowerCase = false;

        for(char character : password.toCharArray()) {
            if (Character.isUpperCase(character)) {
                containsUpperCase = true;
            }
                else if (Character.isLowerCase(character)) {
                containsLowerCase = true;
            }
                if (containsUpperCase && containsLowerCase) {
                    return true;
            }
        }
        return false;
    }
}