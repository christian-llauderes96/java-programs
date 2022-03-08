
package javaGUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Sample1 implements ActionListener{
    static JLabel label1, label2, label3;
    static JTextField txtdata;
    public static void main(String[] args) {
        
        
        JFrame frame = new JFrame("Llauderes Java-GUI");  
        JPanel panel = new JPanel();  
        panel.setLayout(new FlowLayout());  
        label1 = new JLabel("Welcome to GUI Components!"); 
        label2 = new JLabel("Enter Your Complete Name:");
        label3 = new JLabel("");
        label1.setFont(new Font("Courier", Font.BOLD,18));
        label3.setFont(new Font("Courier", Font.BOLD,14));
        txtdata = new JTextField(16);
        
        JButton button = new JButton();  
        button.setText("Submit");
        Sample1 sam = new Sample1();
        button.addActionListener(sam);
        
        panel.add(label1);  
        panel.add(label2);
        panel.add(txtdata);
        panel.add(button);  
        panel.add(label3);
        frame.add(panel);  
        frame.setSize(350, 200);  
        frame.setLocationRelativeTo(null);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String inputData = txtdata.getText();
        label3.setText("Hello, " + inputData);
    }
}
