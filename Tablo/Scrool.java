package Tablo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class Scrool {
    public static void main(String[] args) {
        JFrame f =new JFrame("Text field Ornek");
        JLabel j = new JLabel();
        j.setBounds(100,50,300,30);
        JScrollBar s = new JScrollBar(Scrollbar.VERTICAL,0,10,0,100);
        s.setBounds(100,100,50,100);
        s.setMaximum(100);      // constructer yazmadan ayarlama
        s.setMinimum(0);
        s.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                j.setText("ScroolBar degeri " + (s.getValue() + s.getModel().getExtent()));
            }
        });

        f.add(j);
        f.add(s);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

    }
}
