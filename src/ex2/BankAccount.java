package ex2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BankAccount extends JFrame implements ActionListener {
    JTextField saldo;

    JTextField kwota;

    JButton wplac;
    JButton wyplac;


    public BankAccount() {
        super("Logowanie");
        saldo = new JTextField("0");
        kwota = new JTextField("kwota");
        wplac = new JButton("Wplac");
        wyplac = new JButton("Wyplac");

        wplac.addActionListener(this);
        wyplac.addActionListener(this);


        JPanel p1 = new JPanel(new GridLayout(3,2));
        p1.add(saldo);
        p1.add(kwota);
        p1.add(wplac);
        p1.add(wyplac);

        setContentPane(p1);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(250, 150);
        setResizable(false);
        setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e) {



        if(e.getSource()==wplac) {
            String kwotaString = kwota.getText();
            int i = Integer.parseInt(kwotaString);
            int noweSaldo = Integer.parseInt(saldo.getText()) + i;
            saldo.setText(Integer.toString(noweSaldo));
        }

        else if(e.getSource()==wyplac) {
            String kwotaString = kwota.getText();
            int i = Integer.parseInt(kwotaString);
            int noweSaldo = Integer.parseInt(saldo.getText()) - i;
            saldo.setText(Integer.toString(noweSaldo));
        }
    }
}
