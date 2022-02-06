package com.company;

import javax.swing.*;

public class MainFrame extends JFrame {
    boolean loopTrigger;
    private static int loopCounter = 0;
    JButton button;

    public MainFrame() {
        this.loopTrigger = false;
        JPanel panel= new JPanel();
        this.button = new JButton("Start");

        panel.add(button);

        this.setContentPane(panel);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(300, 100);

        button.addActionListener((e) -> {
            System.out.println(e.getID());
            this.loopTrigger = !this.loopTrigger;
            if (this.loopTrigger) {
                this.button.setText("Stop");
            } else {
                this.button.setText("Start");
            }
        });
    }

    public void print() {
        System.out.println(MainFrame.loopCounter);
        MainFrame.loopCounter++;
    }
}
