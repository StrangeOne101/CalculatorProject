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
public enum EnumMathModifier {
    ADDITION('+'), SUBTRACTION('-'), MULTIPLICATION('*'), DIVISION('/'), MODULO('%'), EXPONENT('^');
    
    private final char character;
    
    EnumMathModifier(char c) {
        this.character = c;
    }

    public char getCharacter() {
        return character;
    }
    
    /**
     * Gets the enum from the character assossiated with it
     * @param c The character
     * @return The enum
     */
    public static EnumMathModifier fromCharacter(char c) {
        for (EnumMathModifier e : values()) {
            if (e.getCharacter() == c) return e;
        }
        return null;
    }
}
