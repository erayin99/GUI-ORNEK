package Tablo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pasw {
    public static void main(String[] args) {

        JFrame f =new JFrame("Text field Ornek");
        JLabel l1 = new JLabel("Sifre");
        l1.setBounds(20,20,100,30);
        JButton jbn = new JButton("Giris");
        jbn.setBounds(20,60,100,30);
        JPasswordField pass = new JPasswordField();
        pass.setBounds(0,0,100,30);
        jbn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Password = new String(pass.getPassword());
                l1.setText(l1.getText() + Password);
            }
        });

        f.add(jbn);
        f.add(l1);
        f.add(pass);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

    }

}
