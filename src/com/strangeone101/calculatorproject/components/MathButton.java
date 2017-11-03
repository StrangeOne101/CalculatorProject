/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.strangeone101.calculatorproject.components;

import com.strangeone101.calculatorproject.CalculatorFrame;
import com.strangeone101.calculatorproject.EnumMathModifier;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author 92018134
 */
public class MathButton extends JButton {

    public MathButton(final EnumMathModifier modifier, final CalculatorFrame frame) {
        final MathButton instance = this;
        this.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String text = frame.getTxtCalculation().getText();
                int index = text.length() - 1;
                if (index >= 0 && text.charAt(index) == ' ') index--;
                if (index >= 0 && CalculatorFrame.CALC_CHARS.contains(text.charAt(index) + "")) {
                    text = text.substring(0, index) + instance.getText() + " ";
                } else {
                   text = text + " " + instance.getText() + " ";
                }
                frame.getTxtCalculation().setText(text);
                //frame.update();
            }
        });
    }
    
    
    
}
