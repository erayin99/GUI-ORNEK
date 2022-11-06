package Tablo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Combobox {
    public static void main(String[] args) {
        JFrame f =new JFrame("Text field Ornek");
        String[] arr = {"C", "JAVA", "PHYTON", "DATNET"};
        JComboBox jc = new JComboBox(arr);
        jc.setBounds(50,100,90,20);
        JButton btn = new JButton("Sec");
        btn.setBounds(50,150,80,20);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // String text = "Secilen programlama dili  " + jc.getSelectedItem();
                String text = "Secilen programlama dili  " + jc.getItemAt(jc.getSelectedIndex());
                System.out.println(text);
            }
        });

        f.add(btn);
        f.add(jc);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
