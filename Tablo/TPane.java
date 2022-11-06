package Tablo;

import javax.swing.*;

public class TPane {
    public static void main(String[] args) {
        JFrame f = new JFrame("Menu Ornek");
        JLabel l1 = new JLabel("Ilk alan");
        JPanel j1 = new JPanel();
        j1.add(l1);
        JLabel l2 = new JLabel("Ikinci alan");
        JPanel j2 = new JPanel();
        j2.add(l2);
        JLabel l3 = new JLabel("Ucuncu alan");
        JPanel j3 = new JPanel();
        j3.add(l3);
        JTabbedPane tb = new JTabbedPane();
        tb.setBounds(50,50,200,200);
        tb.add("olk", j1);
        tb.add("okinci", j2);
        tb.add("ucuncu", j3);




        f.add(tb);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
