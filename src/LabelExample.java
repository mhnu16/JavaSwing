import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LabelExample extends JFrame {
    private JLabel label;

    public LabelExample() {
        ImageIcon icon = new ImageIcon("src\\concern.png"); // load the image

        label = new JLabel(); // Create an instance of the label
        label.setText("This is an image!"); // This is what the label will say
        label.setIcon(icon); // This is the image attached to the label
        label.setIconTextGap(10); // This is the gap between the image and the text
        label.setForeground(new Color(0x3E6E9E)); // This is the color of the text
        label.setBackground(new Color(0x4D4E4F)); // This is the color of the background
        label.setOpaque(true); // This changes the transparency of the frame's background to be transparent so the label's background can be seen
        label.setFont(new Font("Comic Sans MS", Font.BOLD, 20)); // This is the font of the text and the size
        label.setBorder(BorderFactory.createLineBorder(new Color(0xC2B1A0), 5)); // This is the border of the label and the thickness
        label.setHorizontalTextPosition(JLabel.CENTER); // This is the position of the text relative to the image horizontally
        label.setVerticalTextPosition(JLabel.BOTTOM); // This is the position of the text relative to the image vertically
        label.setHorizontalAlignment(JLabel.CENTER); // This is the alignment of the text horizontally relative to the frame
        label.setVerticalAlignment(JLabel.CENTER); // This is the alignment of the text vertically relative to the frame

        this.setTitle("This is a title"); // This is the title of the frame
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // This sets what happens when you click the X
        this.setSize(420, 420); // This sets the size of the frame (width, height) in pixels
        this.setVisible(true); // This makes the frame visible to the user
        this.setLayout(null);
        this.add(label); // This adds the label to the frame so it can be seen by the user
    }

    public static void main(String[] args) {
        LabelExample lol = new LabelExample(); 
    }
}