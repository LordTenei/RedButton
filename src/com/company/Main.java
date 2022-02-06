package com.company;

public class Main {
    public static void main(String[] args) {
        MainFrame mainFrame = new MainFrame();
        while(true) {
            System.out.println(mainFrame.loopTrigger);
            if (mainFrame.loopTrigger) {
                mainFrame.print();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
