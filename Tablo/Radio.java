package Tablo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Radio {
    public static void main(String[] args) {
        JFrame f =new JFrame("Text field Ornek");
        JRadioButton r1 = new JRadioButton("Kadin", true);
        r1.setActionCommand("K");
        JRadioButton r2 = new JRadioButton("Erkek");
        r2.setActionCommand("E");
        r1.setBounds(100,50,100,30);
        r2.setBounds(100,100,100,30);
        JRadioButton r3 = new JRadioButton("Belirtmiyor");
        r3.setActionCommand("B");
        r3.setBounds(100,150,100,30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        JButton btn = new JButton("Ginder");
        btn.setBounds(100,200,100,100);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (r1.isSelected()){
                    System.out.println(r1.getActionCommand() + " secildi");
                }
                System.out.println(bg.getSelection().getActionCommand());
            }
        });


        f.add(btn);
        f.add(r3);
        f.add(r1);
        f.add(r2);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
