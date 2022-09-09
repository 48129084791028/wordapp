package com.word;
import javax.swing.*;
import java.awt.event.*;

public class Word extends JFrame implements ActionListener{
    JTextField tf1, tf2, tf3;
    JButton b1;
    JLabel l1;

 
Word(){
    JFrame f= new JFrame("Kak pravilno");

    l1=new JLabel("Napishi slovo bez oshibok");
    l1.setBounds(50,20,150,20);

    tf1=new JTextField("билютень");
    tf1.setBounds(50,100,150,20);
    tf1.setEditable(false);

    tf2=new JTextField();
    tf2.setBounds(50,120,150,20);

    tf3=new JTextField();
    tf3.setBounds(50,140,150,20);
    tf3.setEditable(false);

    b1=new JButton("Proverit");
    b1.setBounds(50,200,150,50);
    b1.addActionListener(this);  

    f.add(tf1);f.add(b1);f.add(l1);f.add(tf2);f.add(tf3);

    f.setSize(300,300);
    f.setLayout(null);
    f.setVisible(true);
    f.setDefaultCloseOperation(EXIT_ON_CLOSE);
}        

public void actionPerformed(ActionEvent e) {
    if (tf2.getText().equals("бюллетень")){
        if(e.getSource()==b1){ 
            tf3.setText("Pravilno!");
        }
    
    }
    else {
        if(e.getSource()==b1){
            tf3.setText("Ne pravilno!");
        
    
        }

    }
}

public static void main(String[] args) {
    new Word();
    } 
}