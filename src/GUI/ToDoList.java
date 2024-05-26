package GUI;

import javax.swing.*;
import javax.swing.plaf.basic.DefaultMenuLayout;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class ToDoList extends JFrame {

    static JTextField entry = new JTextField(20);
    static ArrayList<JCheckBox> checkBoxes = new ArrayList<>();
    static ArrayList<JLabel> labels = new ArrayList<>();
    static JCheckBox tutorialCheckBox = new JCheckBox();
    static JLabel tutorial = new JLabel("Check the box to finish the to do task!");
    static JButton addButton = new JButton("Add task.");
    static JPanel panel = new JPanel();

    ToDoList(){
        setLayout(new FlowLayout());
        add(entry);
        add(addButton);
        add(panel);


        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkBoxes.add(new JCheckBox());
                labels.add(new JLabel(entry.getText()));
                addToFrame();
            }
        });

        checkBoxes.add(tutorialCheckBox);
        labels.add(tutorial);
        addToFrame();

        setSize(500,200);
    }

    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        toDoList.setDefaultCloseOperation(EXIT_ON_CLOSE);
        toDoList.setVisible(true);
    }

    public void addToFrame(){
        panel.removeAll();
        panel.setLayout(new GridLayout(0,2));
        for (int i = 0; i < checkBoxes.size(); i++){
            panel.add(checkBoxes.get(i));
            panel.add(labels.get(i));
            JCheckBox temp = checkBoxes.get(i);
            JLabel tempLabel = labels.get(i);
            checkBoxes.get(i).addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    checkBoxes.remove(temp);
                    labels.remove(tempLabel);
                    addToFrame();
                }
            });
        }
        panel.revalidate();
        panel.repaint();
    }
}
