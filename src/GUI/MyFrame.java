package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyFrame extends JFrame {
    JButton button;
    MyFrame(){
        button = new JButton();
        button.setBounds(100,100,250,100);
        button.addActionListener(e -> {
            System.out.println("YAY");
        });
        button.setText("I am a button.");
        button.setFocusable(false);
        button.setForeground(Color.white);
        button.setBackground(Color.pink);
        button.setBorder(BorderFactory.createEtchedBorder());

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
    }
}
