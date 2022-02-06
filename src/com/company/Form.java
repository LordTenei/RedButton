package com.company;

import javax.swing.*;

public class Form extends JFrame{
    public JButton button1;
    boolean flag = true;

    public Form(JPanel panel1) {
        this.setContentPane(panel1);
        this.setVisible(true);
        this.setDefaultCloseOperation(3);
        this.setSize(300, 300);
        this.button1.addActionListener((e) -> {
            this.flag = false;
        });
    }
}
