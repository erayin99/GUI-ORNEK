package Tablo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu {
    public static void main(String[] args) {
        JFrame f = new JFrame("Menu Ornek");
        JMenuBar mb = new JMenuBar();
        JMenu men = new JMenu("Ana-menu");
        JMenu submenu = new JMenu("Alt-menu");
        JMenuItem j1 = new JMenuItem("menu 1");
        JMenuItem j2 = new JMenuItem("menu 2");
        JMenuItem j3 = new JMenuItem("menu 3");
        JMenuItem j4 = new JMenuItem("menu 4");
        JMenuItem s1 = new JMenuItem("Alt menu ");
        JMenuItem s2 = new JMenuItem("Alt menu ");
        submenu.add(s1);
        submenu.add(s2);
        j1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f, "Menuye tiklandi.");
            }
        });
        men.add(submenu);
        men.add(j1);
        men.add(j2);
        men.add(j3);
        men.add(j4);
        mb.add(men);
        f.setJMenuBar(mb);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
