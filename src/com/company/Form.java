package com.company;

import javax.swing.*;

public class Form extends JFrame{
    boolean flag = true;

    public Form() {
        JPanel panel= new JPanel();
        JButton button = new JButton();
        panel.add(button);

        this.setContentPane(panel);

        this.setVisible(true);
        this.setDefaultCloseOperation(3);
        this.setSize(300, 300);
        button.addActionListener((e) -> {
            this.flag = false;
        });
    }
}
