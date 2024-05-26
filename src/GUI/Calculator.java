package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame {
    private JButton[] numberButtons = new JButton[10];
    private JButton[] functionButtons = new JButton[4];
    private JTextField result;
    private double num1 = 0, num2 = 0, resultNum = 0;
    private char operator;

    public Calculator() {
        setLayout(new FlowLayout());

        for(int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    result.setText(result.getText() + e.getActionCommand());
                }
            });
        }

        functionButtons[0] = new JButton("+");
        functionButtons[1] = new JButton("-");
        functionButtons[2] = new JButton("*");
        functionButtons[3] = new JButton("/");

        for(int i = 0; i < 4; i++) {
            functionButtons[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    num1 = Double.parseDouble(result.getText());
                    operator = e.getActionCommand().charAt(0);
                    result.setText("");
                }
            });
        }

        JButton equalsButton = new JButton("=");
        equalsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                num2 = Double.parseDouble(result.getText());

                switch(operator) {
                    case '+':
                        resultNum = num1 + num2;
                        break;
                    case '-':
                        resultNum = num1 - num2;
                        break;
                    case '*':
                        resultNum = num1 * num2;
                        break;
                    case '/':
                        resultNum = num2 != 0 ? num1 / num2 : 0;
                        break;
                }

                result.setText(String.valueOf(resultNum));
            }
        });

        result = new JTextField(10);
        add(result);

        for(JButton button : numberButtons) {
            add(button);
        }

        for(JButton button : functionButtons) {
            add(button);
        }

        add(equalsButton);
    }

    public static void main(String args[]) {
        Calculator gui = new Calculator();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(200, 200);
        gui.setVisible(true);
        gui.setTitle("Simple Calculator");
    }
}
