import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LabelExample extends JFrame {
    private JLabel label;

    public LabelExample() {
        label = new JLabel(); // Create an instance of the label
        label.setBounds(100, 120, 200, 100); // Set the position and size of the label
        label.setText("Change my text"); // This is what the label will say
        label.setHorizontalAlignment(label.CENTER); // Centers the text inside the label horizontally
        label.setVerticalAlignment(label.CENTER); // Centers the text inside the label vertically
        label.setForeground(new Color(0x3E6E9E)); // This is the color of the text
        label.setBackground(new Color(0x4D4E4F)); // This is the color of the background
        label.setOpaque(true); // This is needed to make the background color show
        label.setFont(new Font("Comic Sans MS", Font.BOLD, 20)); // This is the font of the text and the size
        label.setBorder(BorderFactory.createLineBorder(new Color(0xC2B1A0), 5)); // This is the border of the label and the thickness

        this.setTitle("This is a title"); // This is the title of the frame
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // This sets what happens when you click the X
        this.setSize(420, 420); // This sets the size of the frame (width, height) in pixels
        this.setVisible(true); // This makes the frame visible to the user
        this.setLayout(null);
        this.getContentPane().setBackground(new Color(0xAE2A2E)); // This sets the background color of the frame
        this.add(label); // This adds the label to the frame
    }

    public static void main(String[] args) {
        LabelExample lol = new LabelExample(); 
    }
}