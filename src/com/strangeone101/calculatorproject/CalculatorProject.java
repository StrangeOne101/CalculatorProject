/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.strangeone101.calculatorproject;

/**
 *
 * @author 92018134
 */
public class CalculatorProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Debug time!");
        
        String s = "200 (5 ^ (25 / 3 ^ 2)) ".replaceAll(" ", "");
        System.out.println("Debug string: \"" + s + "\"");
        
        //System.out.println("Replace string test: " + CalculatorFrame.replaceBetween(s, 5, 7, "---------"));
        
        //System.out.println("Finding left of + char: \"" + CalculatorFrame.findDoubleLeft(s, s.indexOf("+")));
       // System.out.println("Finding right of + char: \"" + CalculatorFrame.findDoubleRight(s, s.indexOf("+")));
        long time1 = System.currentTimeMillis();
        double d = CalculatorFrame.calculate(s);
        long time2 = System.currentTimeMillis();
        System.out.println("Calculation of string: " + d);
        System.out.println("Calculation took " + (time2 - time1) + "ms");
        
        
        new CalculatorFrame().setVisible(true);
    }
    
}
