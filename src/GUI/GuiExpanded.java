package GUI;

import javax.swing.*;
import java.awt.*;
import java.io.*;

public class GuiExpanded extends JFrame {

    JFileChooser fileChooser;
    JMenuBar bar;
    JMenuItem open, save, close;
    JMenu file;
//    TextArea textArea = new TextArea(100, 100);
    JTextArea textArea = new JTextArea(100,100);

    public GuiExpanded(){
        fileChooser = new JFileChooser();
        file = new JMenu("file");
        bar = new JMenuBar();
        open = new JMenuItem("open");
        save = new JMenuItem("save");
        close = new JMenuItem("close");

        setButtons();

        file.add(open);
        file.add(save);
        file.add(close);

        bar.add(file);
        textArea.setFont(new Font("Serif", Font.ITALIC, 16));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        this.setJMenuBar(bar);
        add(textArea);
        this.setSize(250, 250);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new GuiExpanded();
    }

    public void setButtons(){
        close.addActionListener(_ -> System.exit(0));

        open.addActionListener(_ -> getFile());

        save.addActionListener(_ -> saveFile());
    }

    private void setTextArea(File file2) {
        StringBuilder builder = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file2))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                builder.append(line).append("\n");
            }
            textArea.setText(builder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void getFile() {
        int response = fileChooser.showOpenDialog(this);
        if (response == JFileChooser.APPROVE_OPTION) {
            File file1 = fileChooser.getSelectedFile();
            setTextArea(file1);
        }
    }

    private void saveFile(){
        int respnse = fileChooser.showSaveDialog(this);

        if (respnse == JFileChooser.APPROVE_OPTION){

            File file = fileChooser.getSelectedFile();
//            CreateNewFile(file.getName(), );

        }
    }

//    private File CreateNewFile(String fileName, String Repository){
//        File file = new File();
//
//        File file = new File(FilePath + File.separator + fileName);
//
//        try {
//            if (file.createNewFile()){
//                System.out.println("File Created!");
//            }
//            else {
//                System.out.println("File already exists");
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        return file;
//    }
}
