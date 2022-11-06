package Tablo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Checkbox {
    public static void main(String[] args) {
        JFrame f =new JFrame("Text field Ornek");
        JLabel jb = new JLabel("Secim yappin");
        jb.setBounds(100,50,300,50);

        JCheckBox j = new JCheckBox("C++");
        JCheckBox c = new JCheckBox("Java");
        j.setBounds(100,100,250,50);
        c.setBounds(100,150,250,50);
        //JButton btn = new JButton("KONTROL");
       // btn.setBounds(100,200,100,30);
        //btn.addActionListener(new ActionListener() {
          /*  @Override
            public void actionPerformed(ActionEvent e) {
                if (j.isSelected()){
                    System.out.println(j.getText() + " Secildi");
                }if (c.isSelected()){
                    System.out.println(c.getText() + " Secildi");
                }
            }
        });*/
        j.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                jb.setText("C++ Secim kutusu"  + (e.getStateChange() == 1 ? "Secildi" :  "Secilmedi" ));

            }
        });
        c.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                jb.setText("Java Secim kutusu"  + (e.getStateChange() == 1 ? "Secildi" :  "Secilmedi" ));

            }
        });
        f.add(jb);
        //f.add(btn);
        f.add(c);
        f.add(j);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
