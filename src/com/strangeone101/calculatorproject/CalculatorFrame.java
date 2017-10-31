/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.strangeone101.calculatorproject;

import com.strangeone101.calculatorproject.components.MathButton;
import com.strangeone101.calculatorproject.components.NumberButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author 92018134
 */
public class CalculatorFrame extends javax.swing.JFrame {
    private int decimalPlaces = 2;
    
    public static final char SUBTRACTION = '\u2012';// \u2012 is the other '-' symbol. 
    public static final String CALC_CHARS = "+*/%^" + SUBTRACTION; 
    
    //These statics will be used to calculate math functions.
    //They are characters because our calculation method relies
    //on characters and string manipulation, and using things
    //like 'sin' would break that as it's 3 characters
    public static final char SIN = 's'; 
    public static final char ASIN = 'S';
    public static final char COS = 'c';
    public static final char ACOS = 'C';
    public static final char TAN = 't';
    public static final char ATAN = 'T';

    /**
     * Creates new form CalculatorFrame
     */
    public CalculatorFrame() {
        initComponents();
        lblCalcTime.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        btnGroup_Font = new javax.swing.ButtonGroup();
        btnGroup_View = new javax.swing.ButtonGroup();
        btnGroupTrigUnit = new javax.swing.ButtonGroup();
        txtCalculation = new javax.swing.JTextField();
        btnCalculate = new javax.swing.JButton();
        btn_2 = new NumberButton(this);
        btn_3 = new NumberButton(this);
        btn_4 = new NumberButton(this);
        btn_5 = new NumberButton(this);
        btn_6 = new NumberButton(this);
        btn_7 = new NumberButton(this);
        btn_8 = new NumberButton(this);
        btn_9 = new NumberButton(this);
        btn_decimal = new javax.swing.JButton();
        btn_0 = new NumberButton(this);
        btn_1 = new NumberButton(this);
        btn_multiply = new MathButton(EnumMathModifier.MULTIPLICATION, this);
        btn_divide = new MathButton(EnumMathModifier.DIVISION, this);
        btn_add = new MathButton(EnumMathModifier.ADDITION, this);
        btn_subtract = new MathButton(EnumMathModifier.SUBTRACTION, this);
        btn_exponent = new MathButton(EnumMathModifier.EXPONENT, this);
        btn_back = new javax.swing.JButton();
        btn_CA = new javax.swing.JButton();
        lblCalcTime = new javax.swing.JLabel();
        btn_RBracket = new javax.swing.JButton();
        btn_LBracket = new javax.swing.JButton();
        btn_CE = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        btn_blank2 = new javax.swing.JButton();
        btn_sin = new javax.swing.JButton();
        btn_cos = new javax.swing.JButton();
        btn_asin = new javax.swing.JButton();
        btn_acos = new javax.swing.JButton();
        btn_tan = new javax.swing.JButton();
        btn_atan = new javax.swing.JButton();
        btn_pi = new javax.swing.JButton();
        btn_e = new javax.swing.JButton();
        btn_factorial = new javax.swing.JButton();
        btn_divBy1 = new javax.swing.JButton();
        btn_blank1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        radioBtn_View_Baisc = new javax.swing.JRadioButtonMenuItem();
        radioBtn_View_Extended = new javax.swing.JRadioButtonMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        chkboxEquationTime = new javax.swing.JCheckBoxMenuItem();
        radioBtn_Font_Plain = new javax.swing.JMenu();
        jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();
        radioBtn_Font_Bold = new javax.swing.JRadioButtonMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menuItemRound_enabled = new javax.swing.JCheckBoxMenuItem();
        menuItemRound_config = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(299, 370));
        setResizable(false);
        getContentPane().setLayout(null);

        txtCalculation.setEditable(false);
        txtCalculation.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCalculation.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCalculation.setText("0");
        txtCalculation.setName("txtCalculation"); // NOI18N
        getContentPane().add(txtCalculation);
        txtCalculation.setBounds(20, 20, 260, 30);

        btnCalculate.setText("=");
        btnCalculate.setPreferredSize(new java.awt.Dimension(42, 42));
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalculate);
        btnCalculate.setBounds(120, 220, 42, 42);
        btnCalculate.getAccessibleContext().setAccessibleDescription("");

        btn_2.setText("2");
        btn_2.setFocusTraversalPolicyProvider(true);
        btn_2.setPreferredSize(new java.awt.Dimension(42, 42));
        getContentPane().add(btn_2);
        btn_2.setBounds(70, 170, 42, 42);

        btn_3.setText("3");
        btn_3.setPreferredSize(new java.awt.Dimension(42, 42));
        getContentPane().add(btn_3);
        btn_3.setBounds(120, 170, 42, 42);

        btn_4.setText("4");
        btn_4.setPreferredSize(new java.awt.Dimension(42, 42));
        getContentPane().add(btn_4);
        btn_4.setBounds(20, 120, 42, 42);

        btn_5.setText("5");
        btn_5.setPreferredSize(new java.awt.Dimension(42, 42));
        getContentPane().add(btn_5);
        btn_5.setBounds(70, 120, 42, 42);

        btn_6.setText("6");
        btn_6.setPreferredSize(new java.awt.Dimension(42, 42));
        getContentPane().add(btn_6);
        btn_6.setBounds(120, 120, 42, 42);

        btn_7.setText("7");
        btn_7.setPreferredSize(new java.awt.Dimension(42, 42));
        getContentPane().add(btn_7);
        btn_7.setBounds(20, 70, 42, 42);

        btn_8.setText("8");
        btn_8.setPreferredSize(new java.awt.Dimension(42, 42));
        getContentPane().add(btn_8);
        btn_8.setBounds(70, 70, 42, 42);

        btn_9.setText("9");
        btn_9.setPreferredSize(new java.awt.Dimension(42, 42));
        getContentPane().add(btn_9);
        btn_9.setBounds(120, 70, 42, 42);

        btn_decimal.setText(".");
        btn_decimal.setPreferredSize(new java.awt.Dimension(42, 42));
        btn_decimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_decimalActionPerformed(evt);
            }
        });
        getContentPane().add(btn_decimal);
        btn_decimal.setBounds(70, 220, 42, 42);

        btn_0.setText("0");
        btn_0.setPreferredSize(new java.awt.Dimension(42, 42));
        getContentPane().add(btn_0);
        btn_0.setBounds(20, 220, 42, 42);

        btn_1.setText("1");
        btn_1.setPreferredSize(new java.awt.Dimension(42, 42));
        getContentPane().add(btn_1);
        btn_1.setBounds(20, 170, 42, 42);

        btn_multiply.setText("*");
        btn_multiply.setPreferredSize(new java.awt.Dimension(42, 42));
        getContentPane().add(btn_multiply);
        btn_multiply.setBounds(220, 170, 42, 42);

        btn_divide.setText("/");
        btn_divide.setPreferredSize(new java.awt.Dimension(42, 42));
        getContentPane().add(btn_divide);
        btn_divide.setBounds(170, 170, 42, 42);

        btn_add.setText("+");
        btn_add.setPreferredSize(new java.awt.Dimension(42, 42));
        getContentPane().add(btn_add);
        btn_add.setBounds(170, 220, 42, 42);

        btn_subtract.setText("\u2012");
        btn_subtract.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btn_subtract.setPreferredSize(new java.awt.Dimension(42, 42));
        getContentPane().add(btn_subtract);
        btn_subtract.setBounds(220, 220, 42, 42);

        btn_exponent.setText("^");
        btn_exponent.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_exponent.setMargin(new java.awt.Insets(2, 5, 2, 5));
        btn_exponent.setPreferredSize(new java.awt.Dimension(42, 42));
        getContentPane().add(btn_exponent);
        btn_exponent.setBounds(170, 70, 42, 42);

        btn_back.setText("Del");
        btn_back.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_back.setIconTextGap(2);
        btn_back.setMargin(new java.awt.Insets(2, 5, 2, 5));
        btn_back.setPreferredSize(new java.awt.Dimension(42, 42));
        btn_back.setVerifyInputWhenFocusTarget(false);
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        getContentPane().add(btn_back);
        btn_back.setBounds(220, 70, 42, 42);

        btn_CA.setText("CA");
        btn_CA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CAActionPerformed(evt);
            }
        });
        getContentPane().add(btn_CA);
        btn_CA.setBounds(20, 270, 90, 40);

        lblCalcTime.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCalcTime.setText("0ms");
        getContentPane().add(lblCalcTime);
        lblCalcTime.setBounds(180, 50, 100, 20);

        btn_RBracket.setText(")");
        btn_RBracket.setPreferredSize(new java.awt.Dimension(42, 42));
        btn_RBracket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RBracketActionPerformed(evt);
            }
        });
        getContentPane().add(btn_RBracket);
        btn_RBracket.setBounds(220, 120, 42, 42);

        btn_LBracket.setText("(");
        btn_LBracket.setPreferredSize(new java.awt.Dimension(42, 42));
        btn_LBracket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LBracketActionPerformed(evt);
            }
        });
        getContentPane().add(btn_LBracket);
        btn_LBracket.setBounds(170, 120, 42, 42);

        btn_CE.setText("CE");
        btn_CE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CEActionPerformed(evt);
            }
        });
        getContentPane().add(btn_CE);
        btn_CE.setBounds(120, 270, 90, 40);

        btnGroupTrigUnit.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Degrees");
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(290, 20, 80, 23);

        btnGroupTrigUnit.add(jRadioButton2);
        jRadioButton2.setText("Radians");
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(370, 20, 90, 23);

        btn_blank2.setEnabled(false);
        btn_blank2.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btn_blank2.setPreferredSize(new java.awt.Dimension(40, 40));
        getContentPane().add(btn_blank2);
        btn_blank2.setBounds(410, 220, 42, 42);

        btn_sin.setText("sin");
        btn_sin.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btn_sin.setPreferredSize(new java.awt.Dimension(40, 40));
        getContentPane().add(btn_sin);
        btn_sin.setBounds(310, 70, 42, 42);

        btn_cos.setText("cos");
        btn_cos.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btn_cos.setPreferredSize(new java.awt.Dimension(40, 40));
        getContentPane().add(btn_cos);
        btn_cos.setBounds(360, 70, 42, 42);

        btn_asin.setText("asin");
        btn_asin.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btn_asin.setPreferredSize(new java.awt.Dimension(40, 40));
        getContentPane().add(btn_asin);
        btn_asin.setBounds(310, 120, 42, 42);

        btn_acos.setText("acos");
        btn_acos.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btn_acos.setPreferredSize(new java.awt.Dimension(40, 40));
        getContentPane().add(btn_acos);
        btn_acos.setBounds(360, 120, 42, 42);

        btn_tan.setText("tan");
        btn_tan.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btn_tan.setPreferredSize(new java.awt.Dimension(40, 40));
        getContentPane().add(btn_tan);
        btn_tan.setBounds(410, 70, 42, 42);

        btn_atan.setText("atan");
        btn_atan.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btn_atan.setPreferredSize(new java.awt.Dimension(40, 40));
        getContentPane().add(btn_atan);
        btn_atan.setBounds(410, 120, 42, 42);

        btn_pi.setText("PI");
        btn_pi.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btn_pi.setPreferredSize(new java.awt.Dimension(40, 40));
        getContentPane().add(btn_pi);
        btn_pi.setBounds(310, 220, 42, 42);

        btn_e.setText("E");
        btn_e.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btn_e.setPreferredSize(new java.awt.Dimension(40, 40));
        getContentPane().add(btn_e);
        btn_e.setBounds(360, 220, 42, 42);

        btn_factorial.setText("x!");
        btn_factorial.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btn_factorial.setPreferredSize(new java.awt.Dimension(40, 40));
        getContentPane().add(btn_factorial);
        btn_factorial.setBounds(310, 170, 42, 42);

        btn_divBy1.setText("1/x");
        btn_divBy1.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btn_divBy1.setPreferredSize(new java.awt.Dimension(40, 40));
        getContentPane().add(btn_divBy1);
        btn_divBy1.setBounds(360, 170, 42, 42);

        btn_blank1.setEnabled(false);
        btn_blank1.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btn_blank1.setPreferredSize(new java.awt.Dimension(40, 40));
        getContentPane().add(btn_blank1);
        btn_blank1.setBounds(410, 170, 42, 42);

        jMenu2.setText("View");

        radioBtn_View_Baisc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, 0));
        btnGroup_View.add(radioBtn_View_Baisc);
        radioBtn_View_Baisc.setSelected(true);
        radioBtn_View_Baisc.setText("Basic");
        radioBtn_View_Baisc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtn_View_BaiscActionPerformed(evt);
            }
        });
        jMenu2.add(radioBtn_View_Baisc);

        radioBtn_View_Extended.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, 0));
        btnGroup_View.add(radioBtn_View_Extended);
        radioBtn_View_Extended.setText("Extended");
        radioBtn_View_Extended.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtn_View_ExtendedActionPerformed(evt);
            }
        });
        jMenu2.add(radioBtn_View_Extended);
        jMenu2.add(jSeparator1);

        chkboxEquationTime.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, 0));
        chkboxEquationTime.setText("Calculation Time");
        chkboxEquationTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkboxEquationTimeActionPerformed(evt);
            }
        });
        jMenu2.add(chkboxEquationTime);

        jMenuBar1.add(jMenu2);

        radioBtn_Font_Plain.setText("Font");

        jRadioButtonMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        btnGroup_Font.add(jRadioButtonMenuItem3);
        jRadioButtonMenuItem3.setSelected(true);
        jRadioButtonMenuItem3.setText("Plain");
        jRadioButtonMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem3ActionPerformed(evt);
            }
        });
        radioBtn_Font_Plain.add(jRadioButtonMenuItem3);

        radioBtn_Font_Bold.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        btnGroup_Font.add(radioBtn_Font_Bold);
        radioBtn_Font_Bold.setText("Bold");
        radioBtn_Font_Bold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtn_Font_BoldActionPerformed(evt);
            }
        });
        radioBtn_Font_Plain.add(radioBtn_Font_Bold);

        jMenuBar1.add(radioBtn_Font_Plain);

        jMenu4.setText("Round");

        menuItemRound_enabled.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuItemRound_enabled.setSelected(true);
        menuItemRound_enabled.setText("Enabled");
        menuItemRound_enabled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRound_enabledActionPerformed(evt);
            }
        });
        jMenu4.add(menuItemRound_enabled);

        menuItemRound_config.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        menuItemRound_config.setText("2 dpt...");
        menuItemRound_config.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRound_configActionPerformed(evt);
            }
        });
        jMenu4.add(menuItemRound_config);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Help");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, 0));
        jMenuItem2.setText("About");
        jMenu5.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, 0));
        jMenuItem3.setText("Hot Keys");
        jMenu5.add(jMenuItem3);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        try {
            long time = System.nanoTime();
            double d = calculate(getTxtCalculation().getText().replaceAll(" ", ""));
            double rounded = Math.round(d * (Math.pow(10, this.decimalPlaces))) / Math.pow(10, this.decimalPlaces);
            long time2 = System.nanoTime();
            double totalTime = (time2 - time);
            totalTime /= 1000000;
            getTxtCalculation().setText(rounded + "");
            if (chkboxEquationTime.isSelected()) {
                lblCalcTime.setText(totalTime + "ms");
            }
            update();
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(this, e.getLocalizedMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException e) {
            if (e.getLocalizedMessage().startsWith("For input string:")) {
                JOptionPane.showMessageDialog(this, "Inputted number is too large! (Max is " + Double.MAX_VALUE + ")", "Error", JOptionPane.ERROR_MESSAGE);     
            } else {
                JOptionPane.showMessageDialog(this, e.getLocalizedMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
            e.printStackTrace();
        } catch (Exception e) {
            if (e.getLocalizedMessage().equalsIgnoreCase("empty string")) {
                JOptionPane.showMessageDialog(this, "Incomplete equation!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getLocalizedMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        }
        
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void menuItemRound_enabledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRound_enabledActionPerformed
        menuItemRound_config.setEnabled(menuItemRound_enabled.isSelected());
    }//GEN-LAST:event_menuItemRound_enabledActionPerformed

    private void menuItemRound_configActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRound_configActionPerformed
        String s = (String) JOptionPane.showInputDialog(this, "Set the decimal places to...?", "Decimal Places", JOptionPane.QUESTION_MESSAGE, null, null, this.decimalPlaces);
        if (!s.equals("")) {
            try {
                int d = Integer.parseInt(s);
                if (d > 9) d = 9;
                else if (d < 0) d = 0;
                this.decimalPlaces = d;
                this.menuItemRound_config.setText(d + " dpt...");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Error: Decimal place must be a whole number!", "Error", JOptionPane.ERROR);
            }
        }
        
    }//GEN-LAST:event_menuItemRound_configActionPerformed

    private void btn_CAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CAActionPerformed
        txtCalculation.setText("0");
        txtCalculation.setForeground(Color.BLACK);
    }//GEN-LAST:event_btn_CAActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        String text = txtCalculation.getText();
        if (text.length() > 0) {
            int indexToCheck = text.length() -1;
            if (indexToCheck > 0 && text.charAt(indexToCheck) == ' ') indexToCheck--;
            if (indexToCheck > 0 && (CALC_CHARS + "()").contains(text.charAt(indexToCheck) + "")) indexToCheck--;
            if (indexToCheck > 0 && text.charAt(indexToCheck) == ' ') indexToCheck--;
            if (indexToCheck <= 0) {
                txtCalculation.setText("0");
            } else {

                txtCalculation.setText(text.substring(0, indexToCheck)); 
            }   
        }
    }//GEN-LAST:event_btn_backActionPerformed

    private void chkboxEquationTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkboxEquationTimeActionPerformed
        if (!chkboxEquationTime.isSelected()) {
            lblCalcTime.setText("");
        } else if (lblCalcTime.getText().equals("")) {
            lblCalcTime.setText("0ms");
        }
    }//GEN-LAST:event_chkboxEquationTimeActionPerformed

    private void btn_LBracketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LBracketActionPerformed
        String text = txtCalculation.getText();
        int index = text.length() - 1;
        if (index > 0 && text.charAt(index) == ' ') index--;
        /*if (index > 0 && CalculatorFrame.CALC_CHARS.contains(text.charAt(index) + "")) {
            text = text.substring(0, index) + "( ";
        } else {*/
            text = text + " (";
        //}
        txtCalculation.setText(text);
        update();
    }//GEN-LAST:event_btn_LBracketActionPerformed

    private void btn_RBracketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RBracketActionPerformed
         String text = txtCalculation.getText();
        int index = text.length() - 1;
        if (index > 0 && text.charAt(index) == ' ') index--;
        if (index > 0 && CalculatorFrame.CALC_CHARS.contains(text.charAt(index) + "")) {
            //text = text.substring(0, index) + ") ";
        } else {
            text = text + ") ";
        }
        txtCalculation.setText(text);
        update();
    }//GEN-LAST:event_btn_RBracketActionPerformed

    private void radioBtn_Font_BoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtn_Font_BoldActionPerformed
        Font font = txtCalculation.getFont();
       
        txtCalculation.setFont(font.deriveFont(Font.BOLD));
    }//GEN-LAST:event_radioBtn_Font_BoldActionPerformed

    private void jRadioButtonMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem3ActionPerformed
       Font font = txtCalculation.getFont();
       
        txtCalculation.setFont(font.deriveFont(Font.PLAIN));
    }//GEN-LAST:event_jRadioButtonMenuItem3ActionPerformed

    private void btn_decimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_decimalActionPerformed
        String text = txtCalculation.getText();
        int index = text.length() - 1;
        while (index > 0 && text.charAt(index) == ' ') {
            index--;
        }
        
        char lastChar = text.charAt(index);
        if (lastChar == '.' || (CALC_CHARS + "()").contains(lastChar + "")) {
            return;
        } else if (text.substring(findDoubleLeft(text, index) ,index).contains(".")) return;
        
        txtCalculation.setText(text + ".");
    }//GEN-LAST:event_btn_decimalActionPerformed

    private void btn_CEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CEActionPerformed
        int index = findDoubleLeft(txtCalculation.getText(), txtCalculation.getText().length());
        if (index != txtCalculation.getText().length()) {
            String text = txtCalculation.getText().substring(0, index);
            if (text.equals("")) {
                txtCalculation.setText("0");
            } else {
                txtCalculation.setText(text + " ");
            }
            
        }
        
    }//GEN-LAST:event_btn_CEActionPerformed

    private void radioBtn_View_BaiscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtn_View_BaiscActionPerformed
        this.setSize(240, this.getSize().height);
    }//GEN-LAST:event_radioBtn_View_BaiscActionPerformed

    private void radioBtn_View_ExtendedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtn_View_ExtendedActionPerformed
        this.setSize(475, this.getSize().height);
    }//GEN-LAST:event_radioBtn_View_ExtendedActionPerformed


    public JTextField getTxtCalculation() {
        return txtCalculation;
    }
    
    public void update() {
        eraseUnneededZeros();
        
        
    }
    
    /**
     * Removes all 0s from the calculation that don't
     * need to be there (at the start of the number, e.g.
     * '003' instead of what should just be '3')
     */
    public void eraseUnneededZeros() {
        String text = txtCalculation.getText();
        if (text.length() == 1) return; //Don't remove things from just 0
        while (text.length() > 1 && text.split("\\.")[0].charAt(0) == '0' && (!text.contains(".") || text.split("\\.")[0].length() > 1)) {
            text = text.substring(1);
        }
        
        //TODO
        while (text.contains(".") && 
                (text.split("\\.", 2)[1].length() == 0 || 
                text.split("\\.", 2)[1].charAt(text.split("\\.")[1].length() - 1) == '0')) {
            text = text.substring(0, text.length() - 1); 
        }
        
        if (!text.equals(txtCalculation.getText())) {
            txtCalculation.setText(text);
        }
    }
    
    
    public static double calculate(String s) throws ArithmeticException {
        String text = s.replaceAll(" ", "").replaceAll("sin", SIN + "").replaceAll("cos", COS + "").replaceAll("tan", TAN + "")
                .replaceAll("asin", ASIN + "").replaceAll("acos", ACOS + "").replaceAll("atan", ATAN + "");
        
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
        
        //TODO Trig methods here
        
        /*while (text.contains(SIN + "")) {
            int index = text.indexOf(SIN);
            int left = findDoubleLeft(text, index);
            int right = findDoubleRight(text, index);
            double leftValue = Double.parseDouble(text.substring(left, index));
            double rightValue = Double.parseDouble(text.substring(index + 1, right));
            double outcome = Math.sin(leftValue, rightValue);
            text = replaceBetween(text, left, right, outcome + "");
        }*/
        
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
    
    public static int findDoubleLeft(String text, int index) {       
        int i;
        for (i = index - 1; i >= 0; i--) {
            char c = text.charAt(i);
            //System.out.println("Char index: " + i + " | Char: " + c);
            if ("+\u2012*/)(^%".contains(c + "")) break; //If the next character is an operator, that marks the end of the number we are looking for
        }
        
        return i + 1;
    }
    
    public static int findDoubleRight(String text, int index) {
        int i;
        for (i = index + 1; i < text.length(); i++) {
            char c = text.charAt(i);
            
            if ("+\u2012*/)(^%".contains(c + "")) break; //If the next character is an operator, that marks the end of the number we are looking for
        }
        
        return i;
    }
    
    public static String replaceBetween(String original, int point1, int point2, String replacementText) {
        if (point1 > point2) { //Swap them
            int p = point1;
            point1 = point2;
            point2 = p;
        }
        
        return original.substring(0, point1) + 
                replacementText + 
                original.substring(point2, original.length())
                ;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.ButtonGroup btnGroupTrigUnit;
    private javax.swing.ButtonGroup btnGroup_Font;
    private javax.swing.ButtonGroup btnGroup_View;
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_CA;
    private javax.swing.JButton btn_CE;
    private javax.swing.JButton btn_LBracket;
    private javax.swing.JButton btn_RBracket;
    private javax.swing.JButton btn_acos;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_asin;
    private javax.swing.JButton btn_atan;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_blank1;
    private javax.swing.JButton btn_blank2;
    private javax.swing.JButton btn_cos;
    private javax.swing.JButton btn_decimal;
    private javax.swing.JButton btn_divBy1;
    private javax.swing.JButton btn_divide;
    private javax.swing.JButton btn_e;
    private javax.swing.JButton btn_exponent;
    private javax.swing.JButton btn_factorial;
    private javax.swing.JButton btn_multiply;
    private javax.swing.JButton btn_pi;
    private javax.swing.JButton btn_sin;
    private javax.swing.JButton btn_subtract;
    private javax.swing.JButton btn_tan;
    private javax.swing.JCheckBoxMenuItem chkboxEquationTime;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblCalcTime;
    private javax.swing.JMenuItem menuItemRound_config;
    private javax.swing.JCheckBoxMenuItem menuItemRound_enabled;
    private javax.swing.JRadioButtonMenuItem radioBtn_Font_Bold;
    private javax.swing.JMenu radioBtn_Font_Plain;
    private javax.swing.JRadioButtonMenuItem radioBtn_View_Baisc;
    private javax.swing.JRadioButtonMenuItem radioBtn_View_Extended;
    private javax.swing.JTextField txtCalculation;
    // End of variables declaration//GEN-END:variables
}
