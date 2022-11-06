package Tablo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Alan {
    public static void main(String[] args) {
        JFrame f =new JFrame("Text field Ornek");
        JLabel l1, l2;
        JTextArea area;;
        JButton btn;
        l1 = new JLabel();
        l1.setBounds(50,25,100,30);
        l2 = new JLabel();
        l2.setBounds(160,25,100,30);
        area = new JTextArea();
        area.setBounds(20,75,190,200);
        btn = new JButton("HESAPLA");
        btn.setBounds(100, 300, 120,30);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = area.getText();
                String words[] = text.split("\\s");
                l1.setText("Kelime " + words.length);
                l2.setText("Karakter " + text.length());
            }
        });
        f.add(area);
        f.add(btn);
        f.add(l2);
        f.add(l1);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

    }
}
