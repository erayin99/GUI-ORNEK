package Tablo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buton {
    public static void main(String[] args) {


        JFrame f = new JFrame("Buton Ornek");
        JButton btn = new JButton();
        JLabel label = new JLabel();
        label.setText("Yazi kismi");
        btn.setText("Gonder");
        label.setBounds(100,50,100,30);
        btn.setBounds(100,100,100,30);
        btn.addActionListener(new ActionListener() {
            int c = 1;
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Butona Tiklandi  " + c++);
            }
        });
        f.add(label);
        f.add(btn);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);


    }


}
