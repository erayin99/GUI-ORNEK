package Tablo;

import javax.swing.*;

public class Pro {
    public static void main(String[] args) {
        JFrame f = new JFrame("Menu Ornek");
        JProgressBar j = new JProgressBar(0,2000);
        j.setBounds(40,40,160,30);
        j.setValue(0);
        j.setStringPainted(true);



        f.add(j);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        int i = 0;
        while (i <= 2000){
            j.setValue(i);
            i = i+20;
            try {
                Thread.sleep(150);
            }catch(Exception e){
                e.printStackTrace();
            }
        }

    }
}
