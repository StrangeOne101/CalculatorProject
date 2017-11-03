/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.strangeone101.calculatorproject.components;

import com.strangeone101.calculatorproject.CalculatorFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author 92018134
 */
public class NumberButton extends JButton {
    
    public NumberButton(final CalculatorFrame frame, final String number) {
        final NumberButton instance = this;
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (frame.getTxtCalculation().getText().equals("0")) frame.getTxtCalculation().setText("");
                frame.getTxtCalculation().setText(frame.getTxtCalculation().getText() + number);
                //frame.update();
            }
        });
    }
    
}
