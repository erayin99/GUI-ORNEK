package Tablo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Metin {
    public static void main(String[] args) {
         JFrame f =new JFrame("Text field Ornek");
        JLabel l1, l2, l3;
        JTextField t1, t2, t3;
        JButton btn;
        l1 = new JLabel("ILK SAYI");
        l1.setBounds(50,10,100,30);


        t1 = new JTextField();
        t1.setBounds(50,40,200,30);

        l2 = new JLabel("IKINCI SAYI");
        l2.setBounds(50,70,100,30);


        t2 = new JTextField();
        t2.setBounds(50,100,200,30);


        l3 = new JLabel("TOPLAM");
        l3.setBounds(50,130,100,30);


        t3 = new JTextField();
        t3.setBounds(50,160,200,30);
        t3.setEditable(false);
        btn = new JButton("HESAPLA");
        btn.setBounds(50, 220, 200, 30);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a + b;
                String toplam = String.valueOf(c);
                t3.setText(toplam);
            }
        });


        f.add(btn);
        f.add(t3);
        f.add(l3);
        f.add(t2);
        f.add(l2);
        f.add(t1);
        f.add(l1);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
