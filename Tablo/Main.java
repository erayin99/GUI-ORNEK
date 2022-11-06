package Tablo;

import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(200,200);
        JPanel panel = new JPanel();

        JButton btn = new JButton("Buton");
        frame.getContentPane().add(btn);
        panel.add(btn);



        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
