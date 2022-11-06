package Tablo;

import javax.swing.*;

public class Opane {
    public static void main(String[] args) {

        JFrame f =new JFrame("Text field Ornek");
        //JOptionPane.showMessageDialog(f,"Merhana kodlama vaktine hosgeldiniz");
        //JOptionPane.showMessageDialog(f, "ABONEL OLDUM ", "HEMDENASIL", JOptionPane.WARNING_MESSAGE );
       String str =  JOptionPane.showInputDialog("Adiniz");
       System.out.println(str);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

    }
}
