package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextField {
    static String str = "";

    public static void main(String[] args) {
        JLabel label = new JLabel("Hello");
        JFrame frame = new JFrame();
        JTextField textField = new JTextField(20);
        textField.setFont(new Font("SansSerif", Font.PLAIN, 18));
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(textField.getText());
            }
        });
        frame.add(textField);
        frame.add(label);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Create a timer that calls an ActionListener every 500 milliseconds
        Timer timer = new Timer(500, new ActionListener() {
            private boolean isVisible = true;

            @Override
            public void actionPerformed(ActionEvent e) {
                // Toggle the visibility of the label each time the timer fires
                isVisible = !isVisible;
                label.setVisible(isVisible);
            }
        });

        // Start the timer
        timer.start();

    }
}

