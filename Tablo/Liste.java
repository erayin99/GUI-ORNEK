package Tablo;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Liste {
    public static void main(String[] args) {
        JFrame f =new JFrame("Text field Ornek");
        DefaultListModel<String> d = new DefaultListModel<>();

        d.addElement("C++");
        d.addElement("JAVA");
        d.addElement("HPP");
        d.addElement("PHYTON");
        JList<String> list = new JList<>(d);
        list.setBounds(100,100,75,75);
        list.setSelectionMode(DefaultListSelectionModel.SINGLE_SELECTION);
        DefaultListModel<String> df = new DefaultListModel<>();
        df.addElement("Swing");
        df.addElement("laravel");
        df.addElement("vuejs");
        df.addElement("bootstrap");
        JList<String> list2 = new JList<>(df);
        list2.setBounds(100,200,75,75);
        JButton jb = new JButton("Goster");
        jb.setBounds(200,150,80,30);
        jb.addActionListener(new ActionListener() {
            String txt = "";
            @Override
            public void actionPerformed(ActionEvent e) {
                if (list.getSelectedIndex() != -1){
                    txt = "Secilen programlama dili  " + list.getSelectedValue();


                }
                if (list.getSelectedIndex() != -1){
                    txt += "Secilen Framework  ";
                    for(Object item : list2.getSelectedValuesList()){
                        txt += item + " ";
                    }

                }
                System.out.println(txt);
            }
        });


        f.add(jb);
        f.add(list2);
        f.add(list);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

    }

}
