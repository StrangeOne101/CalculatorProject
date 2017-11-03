/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.strangeone101.calculatorproject;

import com.sun.media.sound.InvalidFormatException;
import com.sun.xml.internal.ws.util.StringUtils;

/**
 *
 * @author 92018134
 */
public class CalculatorUtil {
    
    /**
     * Processes the string passed to it and calculate it to return a double
     * @param s The string with the calculation
     * @return The calculated double
     * @throws ArithmeticException
     * @throws java.lang.IllegalArgumentException
     */
    public static double calculate(String s) throws ArithmeticException, IllegalArgumentException {
        String text = s.replaceAll(" ", "");
        
        int lBracket = text.length() - text.replace("(", "").length();
        int rBracket = text.length() - text.replace(")", "").length();
        
        if (lBracket != rBracket) throw new IllegalArgumentException("Unbalanced brackets! ");
        
        if (text.contains("(") && text.contains(")")) {
            int left = text.indexOf("(");
            int right = text.lastIndexOf(")");
            double inner = calculate(text.substring(left + 1, right));
            String stringInner = inner + "";
            if (!text.substring(findDoubleLeft(text, left), left).equals("") && left > 0) { //If there is a non blank string, there is a number before the brackets and not an operator
                stringInner = "*" + stringInner;
            }
            
            if (!text.substring(right, findDoubleRight(text, right)).equals("")  && right + 1 < text.length()) {
                stringInner = stringInner + "*";
            }
            
            text = replaceBetween(text, left, right + 1, stringInner);
        }
        
        while (text.contains("^")) {
            int index = text.indexOf("^");
            int left = findDoubleLeft(text, index);
            int right = findDoubleRight(text, index);
            double leftValue = Double.parseDouble(text.substring(left, index));
            double rightValue = Double.parseDouble(text.substring(index + 1, right));
            double outcome = Math.pow(leftValue, rightValue);
            text = replaceBetween(text, left, right, outcome + "");
        }
        
        while (text.contains("/")) {
            int index = text.indexOf("/");
            int left = findDoubleLeft(text, index);
            int right = findDoubleRight(text, index);
            double leftValue = Double.parseDouble(text.substring(left, index));
            double rightValue = Double.parseDouble(text.substring(index + 1, right));
            if (rightValue == 0) throw new ArithmeticException("Cannot divide by zero!");
            double outcome = leftValue / rightValue;
            text = replaceBetween(text, left, right, outcome + "");
        }
        
        while (text.contains("%")) {
            int index = text.indexOf("%");
            int left = findDoubleLeft(text, index);
            int right = findDoubleRight(text, index);
            double leftValue = Double.parseDouble(text.substring(left, index));
            double rightValue = Double.parseDouble(text.substring(index + 1, right));
            double outcome = leftValue % rightValue;
            text = replaceBetween(text, left, right, outcome + "");
        }
        
        while (text.contains("*")) {
            int index = text.indexOf("*");
            int left = findDoubleLeft(text, index);
            int right = findDoubleRight(text, index);
            double leftValue = Double.parseDouble(text.substring(left, index));
            double rightValue = Double.parseDouble(text.substring(index + 1, right));
            double outcome = leftValue * rightValue;
            text = replaceBetween(text, left, right, outcome + "");
        }
        
         while (text.contains("+")) {
            int index = text.indexOf("+");
            int left = findDoubleLeft(text, index);
            int right = findDoubleRight(text, index);
            double leftValue = Double.parseDouble(text.substring(left, index));
            double rightValue = Double.parseDouble(text.substring(index + 1, right));
            double outcome = leftValue + rightValue;
            text = replaceBetween(text, left, right, outcome + "");
        }
        
        while (text.contains("\u2012")) { // - symbol that isn't negatives
            int index = text.indexOf("\u2012");
            int left = findDoubleLeft(text, index);
            int right = findDoubleRight(text, index);
            double leftValue = left == index ? 0 : Double.parseDouble(text.substring(left, index));
            double rightValue = Double.parseDouble(text.substring(index + 1, right));
            double outcome = leftValue - rightValue;
            text = replaceBetween(text, left, right, outcome + "");
        }
        return Double.parseDouble(text); //TODO
    }
    
    /**
     * Removes all 0s from the calculation that don't
     * need to be there (at the start of the number, e.g.
     * '003' instead of what should just be '3')
     * 
     * @param text The text to remove the zeros from
     * @return The text with zeros removed
     */
    public static String eraseUnneededZeros(String text) {
        if (text.length() == 1) return text; //Don't remove things from just 0
        while (text.length() > 1 && text.split("\\.")[0].charAt(0) == '0' && (!text.contains(".") || text.split("\\.")[0].length() > 1)) {
            text = text.substring(1);
        }
        
        //TODO
        while (text.contains(".") && 
                (text.split("\\.", 2)[1].length() == 0 || 
                text.split("\\.", 2)[1].charAt(text.split("\\.")[1].length() - 1) == '0')) {
            text = text.substring(0, text.length() - 1); 
        }
        
        return text;
    }
    
    /**
     * Finds the left index of the next found double on the left in string provided, from the index given.
     * @param text The text to search
     * @param index The index to start searching from
     * @return The left index of where the next double is
     */
    public static int findDoubleLeft(String text, int index) {       
        int i;
        for (i = index - 1; i >= 0; i--) {
            char c = text.charAt(i);
            //System.out.println("Char index: " + i + " | Char: " + c);
            if ("+\u2012*/)(^%".contains(c + "")) break; //If the next character is an operator, that marks the end of the number we are looking for
        }
        
        return i + 1;
    }
    
    /**
     * Finds the right index of the next found double on the right in string provided, from the index given.
     * @param text The text to search
     * @param index The index to start searching from
     * @return The right index of where the next double is
     */
    public static int findDoubleRight(String text, int index) {
        int i;
        for (i = index + 1; i < text.length(); i++) {
            char c = text.charAt(i);
            
            if ("+\u2012*/)(^%".contains(c + "")) break; //If the next character is an operator, that marks the end of the number we are looking for
        }
        
        return i;
    }
    
    /**
     * Checks if the next character to the left can be used in math calculations.
     * @param text The text to search
     * @param index The index to search from
     * @return True if the next character can be used in math calculations
     */
    public static boolean isOperatorLeft(String text, int index) {       
        int i;
        for (i = index - 1; i >= 0; i--) {
            char c = text.charAt(i);
            if (c == ' ') continue;
            //System.out.println("Char index: " + i + " | Char: " + c);
            return CalculatorFrame.CALC_CHARS.contains(c + ""); //If the next character is an operator, that marks the end of the number we are looking for
        }
        
        return false;
    }
    
    /**
     * Checks if the next character to the right can be used in math calculations.
     * @param text The text to search
     * @param index The index to search from
     * @return True if the next character can be used in math calculations
     */
    public static boolean isOperatorRight(String text, int index) {       
        int i;
        for (i = index + 1; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == ' ') continue;
            //System.out.println("Char index: " + i + " | Char: " + c);
            return CalculatorFrame.CALC_CHARS.contains(c + ""); //If the next character is an operator, that marks the end of the number we are looking for
        }
        
        return false;
    }
    
    /**
     * Replaces a segment in a string with a new bit of text
     * @param original The original string to modify
     * @param point1 The left index of what should be replaced
     * @param point2 The right index of what should be replaced
     * @param replacementText The text to insert between the left and right indexes
     * @return The modified string
     */
    public static String replaceBetween(String original, int point1, int point2, String replacementText) {
        if (point1 > point2) { //Swap them
            int p = point1;
            point1 = point2;
            point2 = p;
        }
        
        return original.substring(0, point1) + 
                replacementText + 
                original.substring(point2, original.length());
    }
}
