import javax.swing.*;
import java.awt.*;

public class Form {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel nameLabel;
    private JLabel modelLabel;
    private JLabel combustibilLabel;
    private JLabel stareLabel;
    private JLabel anLabel;

    public Form(){
        prepareGUI();
    }

    private void prepareGUI(){
        mainFrame = new JFrame("Form");
        mainFrame.setSize(800, 600);
        mainFrame.setVisible(true);
        mainFrame.setLayout(new GridLayout(3, 1));

        
    }

    public static void main(String args[]) {
        Form form = new Form();
    }
}
