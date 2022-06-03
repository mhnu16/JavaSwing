import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonExample extends JFrame implements ActionListener {
    private JButton button;
    private JButton boo;
    private JLabel label;

    public ButtonExample() {
        button = new JButton("Click me!"); // create an instance of the "button" button
        button.setBounds(50, 100, 150, 50); // This is the position of the "button" button (x, y, width, height)
        button.setBackground(new Color(0x4D4E4F)); // This is the color of the button's background
        button.setForeground(new Color(0x3E6E9E)); // This is the color of the button's text
        button.setFont(new Font("Comic Sans MS", Font.BOLD, 16)); // This is the font of the button's text and the size
        button.setFocusable(false);
        button.addActionListener(this); // This adds the action listener to the button

        boo = new JButton("Don't click me"); // create an instance of the "boo" button
        boo.setBounds(220, 100, 150, 50); // This is the position of the "boo" button (x, y, width, height)
        boo.setBackground(new Color(0xF4E4D4)); // This is the color of the button's background
        boo.setForeground(new Color(0x369EEE)); // This is the color of the button's text
        boo.setFont(new Font("Comic Sans MS", Font.BOLD, 16)); // This is the font of the button's text and the size
        boo.setFocusable(false);
        boo.addActionListener(this); // This adds the action listener to the button

        label = new JLabel(); // create an instance of the label
        label.setBounds(180, 180, 100, 100); // This is the position of the label (x, y, width, height)
        label.setText("WHY"); // This is the text of the label
        label.setFont(new Font("Comic Sans MS", Font.BOLD, 16)); // This is the font of the label's text and the size
        
        label.setVisible(false); // This makes the label invisible until the "boo" button is clicked

        this.setTitle("This is a title"); // This is the title of the frame
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // This sets what happens when you click the X
        this.setSize(420, 420); // This sets the size of the frame (width, height) in pixels
        this.setVisible(true); // This makes the frame visible to the user
        this.setLayout(null);
        this.setResizable(false); // Prevents the user from resizing the frame
        this.add(button); // This adds the "button" button to the frame so it can be seen by the user
        this.add(boo); // This adds the "boo" button to the frame so it can be seen by the user
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            JOptionPane.showMessageDialog(null, "You clicked the button!");
        }
        if (e.getSource() == boo) {
            label.setVisible(true);
        }
    }

    public static void main(String[] args) {
        ButtonExample funny = new ButtonExample();
    }
}