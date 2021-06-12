/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author usuario
 */
public class validatorUtil {
 
    private static final String PATTERN_EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    
    private static final String PATTERN_TEL = "^\\+?\\d{1,3}?[- .]?\\(?(?:\\d{2,3})\\)?[- .]?\\d\\d\\d[- .]?\\d\\d\\d\\d$";
//    ^\+?\d{1,3}?[- .]?\(?(?:\d{2,3})\)?[- .]?\d\d\d[- .]?\d\d\d\d$
      
    /**
     * Validate given email with regular expression.
     *
     * @param email
     *            email for validation
     * @return true valid email, otherwise false
     */
    public static boolean validateEmail(String email) {
 
        // Compiles the given regular expression into a pattern.
        Pattern pattern = Pattern.compile(PATTERN_EMAIL);
 
        // Match the given input against this pattern
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
 
    }
    
    public static boolean validateTel(String tel) {
 
        // Compiles the given regular expression into a pattern.
        Pattern pattern = Pattern.compile(PATTERN_TEL);
 
        // Match the given input against this pattern
        Matcher matcher = pattern.matcher(tel);
        return matcher.matches();
 
    }
    
    public static String mHTML(String cadena){
        String fortCad;
        
//        fortCad="<html><h2>" + cadena + "</h2></html>";
        fortCad="<font size=+2 color=red>" + cadena + "</font>";
        
        return fortCad;
    }
    
    public static int contarMayusculas(String cadena) {
        int n = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if(cadena.charAt(i)> 64 && cadena.charAt(i)<91)
                n++;
        }
        return n;
     }
 
     public static int contarMinusculas(String cadena) {
        int n = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if(cadena.charAt(i)> 96 && cadena.charAt(i)<123)
                n++;
        }
        return n;
    }
     
     public static int contarCaracter(String cadena, char caracter) {
        int n = 0, pos = -1;
        while ((pos = cadena.indexOf(caracter, pos + 1)) > -1)
            n++;
        return n;
    }
     
    public static boolean palindrome(String cadena) {
        for (int i = 0, j = cadena.length() - 1; i < cadena.length() / 2; i++, j--)
            if (cadena.charAt(i) != cadena.charAt(j))
                return false;
        return true;
    }
    
    public static String colocarMayuscula(String cadena,
            char minuscula, char mayuscula) {
 
        return cadena.replace(minuscula, mayuscula);
    }
    
    public static String eliminarEspacios(String cadena) {
        String temp="";
        char caracter;
        for(int i=0;i<cadena.length();i++){
            caracter=cadena.charAt(i);
            if(!Character.isWhitespace(caracter))
                temp=temp+caracter;
        }
        return temp;
    }
    
//    protected static ImageIcon createImageIcon(String path) {
//        java.net.URL imgURL = iFraAdministracion.class.getResource(path);
//        if (imgURL != null) {
//            return new ImageIcon(imgURL);
//        } else {
//            System.err.println("Couldn't find file: " + path);
//            return null;
//        }
//    }
    
    
    
}
