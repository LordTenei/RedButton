package com.company;

import javax.swing.JPanel;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        JPanel panel1= new JPanel();
        Form form = new Form(panel1);

        while(form.flag) {
            System.out.println("Cicle");
            Thread.sleep(500L);
        }

    }
}
