package com.company;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Form form = new Form();

        while(form.flag) {
            System.out.println("Circle");
            Thread.sleep(500L); // ms
        }
    }
}
