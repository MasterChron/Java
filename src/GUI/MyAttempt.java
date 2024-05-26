package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyAttempt extends JFrame {

    JButton[] functionButtons = new JButton[7];
    JTextField textField;
    char operator;
    double num = 0, num2 = 0, resultNum = 0;

    // Create a timer that calls an ActionListener every 500 milliseconds
    Timer timer = new Timer(500, new ActionListener() {
        private boolean isVisible = true;

        @Override
        public void actionPerformed(ActionEvent e) {
            // Toggle the visibility of the label each time the timer fires
            isVisible = !isVisible;
            textField.setVisible(isVisible);
        }
    });

    //Two timers
    Timer timer1 = new Timer(3000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            timer.stop();
            textField.setVisible(true);
            textField.setText("");
        }
    });



    MyAttempt(){
        setLayout(new FlowLayout());

        functionButtons[0] = new JButton("+");
        functionButtons[1] = new JButton("-");
        functionButtons[2] = new JButton("/");
        functionButtons[3] = new JButton("*");
        functionButtons[4] = new JButton("^");
        functionButtons[5] = new JButton("=");
        functionButtons[6] = new JButton("clear");

        for(JButton button: functionButtons){
            button.setForeground(new Color(255,255,255));
            button.setBackground(new Color(0,128,128));
        }

        for (int i = 0; i < 5; i++){
            functionButtons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        num = Double.parseDouble(textField.getText());
                        operator = e.getActionCommand().charAt(0);
                        textField.setText("");
                    }
                    catch (NumberFormatException error){
                        catchError();
                    }
                }
            });
        }

        functionButtons[5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    num2 = Double.parseDouble(textField.getText());

                    switch (operator){
                        case '+':
                            resultNum = num + num2;
                            break;
                        case '-':
                            resultNum = num + num2;
                            break;
                        case '/':
                            resultNum = num / num2;
                            break;
                        case '*':
                            resultNum = num * num2;
                            break;
                        case '^':
                            resultNum = Math.pow(num, num2);
                            break;
                    }

                    textField.setText(String.valueOf(resultNum));
                    num = 0;
                    num2 = 0;
                    resultNum = 0;
                }
                catch (NumberFormatException error){
                    catchError();
                }
            }
        });

        functionButtons[6].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
                num = 0;
                num2 = 0;
                resultNum = 0;
            }
        });

        add(textField = new JTextField(20));
        for (JButton button : functionButtons){
            add(button);
        }
    }


    public void catchError(){
            num = 0;
            num2 = 0;
            resultNum = 0;

            textField.setText("error");
            timer.start();

            if (timer.isRunning()) {
                timer1.start();
            }
            else if(timer1.isRunning() && !timer.isRunning()) {
                timer1.stop();
            }
        }

    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("C:\\Users\\user\\Downloads\\no.png");
        MyAttempt attempt = new MyAttempt();
        attempt.setDefaultCloseOperation(EXIT_ON_CLOSE);
        attempt.pack();
        attempt.setVisible(true);
        attempt.setTitle("My Calculator Attempt");
        attempt.setIconImage(icon.getImage());
    }
}



