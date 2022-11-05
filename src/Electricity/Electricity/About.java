package Electricity;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.border.Border;


public class About extends JFrame implements ActionListener {
    JButton b1;
    JLabel li;
    Font f, f1, f2;
    TextArea t1;
    String s;

    public About(){
        setLayout(null);
        JButton b1 = new JButton("Exit");
        add(b1);
        b1.setBounds(180, 430, 120, 20);
        b1.addActionListener(this);

        Font f = new Font("RALWAY", Font.BOLD, 180 );
        setFont(f);
        
    }


}


// public class About {
    
// }
