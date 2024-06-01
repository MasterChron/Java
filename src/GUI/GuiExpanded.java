package GUI;

import javax.swing.*;
import java.awt.*;

public class GuiExpanded extends JFrame {

    JMenuBar bar;
    JMenuItem open, save, close;
    JMenu file;
    TextArea textArea = new TextArea(100, 100);

    public GuiExpanded(){
        textArea.setSize(100, 100);
        file = new JMenu("file");
        bar = new JMenuBar();
        open = new JMenuItem("open");
        save = new JMenuItem("save");
        close = new JMenuItem("close");

        file.add(open);
        file.add(save);
        file.add(close);

        bar.add(file);


        this.setJMenuBar(bar);
        add(textArea);
        this.setSize(250, 250);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new GuiExpanded();
    }
}
