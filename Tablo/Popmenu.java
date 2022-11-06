package Tablo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Popmenu {
    public static void main(String[] args) {
        JFrame f = new JFrame("Menu Ornek");
        JPopupMenu p = new JPopupMenu("Menu");

        JMenuItem cut = new JMenuItem("Kes");
        JMenuItem cooy = new JMenuItem("Kopyala");
        JMenuItem paste = new JMenuItem("Yapistir");

        p.add(cut);
        p.add(cooy);
        p.add(paste);
        f.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                p.show(f, e.getX(),e.getY());
            }
        });
        cut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f, "Kes butonuna tiklandi");
            }
        });
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
