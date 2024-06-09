package Projects;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Notepad extends JFrame {

    TextArea content = new TextArea(25, 25);
    JTextField nameOfFile = new JTextField(50);
    JButton save = new JButton("save");


    public Notepad(){
        setLayout(new BorderLayout());
        addingActionListeners();

        setSize(500, 500);
        add(new JFrame().add(nameOfFile), BorderLayout.PAGE_START);
        add(new JFrame().add(save));
        add(new JFrame().add(content), BorderLayout.PAGE_END);


        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new Notepad();
    }

    public static File CreateNewFile(String fileName){
        String FilePath = "src/GUI";

        File file = new File(FilePath + File.separator + fileName);

        try {
            if (file.createNewFile()){
                System.out.println("File Created!");
            }
            else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return file;
    }

    public static void addTextToFile(File file, String text){

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
                writer.append(text);
            System.out.println("Data has been added.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



    public void addingActionListeners(){
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txt = nameOfFile.getText();
                File file;
                if (!txt.trim().isEmpty()){
                    file = CreateNewFile(txt);
                    addTextToFile(file, content.getText());
                }
            }
        });
    }
}
