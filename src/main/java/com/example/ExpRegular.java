package com.example;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class ExpRegular {
    public static void main(String[] args) {
        run();
    }


    public static void run() {
        String correo = "correo@correo.com";

        if (validarCorreo(correo)) {
            System.out.println("Valido.");
        } else {
            System.out.println("Invalido.");
        }
    };

    public static boolean validarCorreo(String correo) {
        String patron = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

        Pattern pattern = Pattern.compile(patron);

        Matcher matcher = pattern.matcher(correo);

        return matcher.matches();
    }



}