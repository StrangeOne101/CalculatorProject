/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.strangeone101.calculatorproject.components;

import com.strangeone101.calculatorproject.CalculatorFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;

/**
 *
 * @author 92018134
 */
public class NumberButton extends JButton {

    public NumberButton(final CalculatorFrame frame) {
        final NumberButton instance = this;
        this.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                frame.getTxtCalculation().setText(frame.getTxtCalculation().getText() + instance.getText());
                frame.update();
            }

            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {} 
        });
    }
    
}
