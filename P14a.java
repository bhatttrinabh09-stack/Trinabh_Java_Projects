import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class P14a extends Frame implements ActionListener {

    Label l1, l2, l3;
    TextField t1, t2, t3;
    Button b1, b2;

    P14a() {
        l1 = new Label("Login :");
        l2 = new Label("Password :");
        l3 = new Label("Details :");
        t1 = new TextField(15);
        t2 = new TextField(15);
        t3 = new TextField(30);
        t3.setVisible(false);
        l3.setVisible(false);
        b1 = new Button("OK");
        b2 = new Button("RESET");
        setLayout(new FlowLayout());
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(b2);
        add(l3);
        add(t3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        setTitle("Login Form");
        setSize(500, 200);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            String login = t1.getText();
            String password = t2.getText();
            t3.setText("Login Id: " + login + "   Password: " + password);
            l3.setVisible(true);
            t3.setVisible(true);
        }
        if (ae.getSource() == b2) {
            t1.setText("");
            t2.setText("");
            t3.setText("");
            l3.setVisible(false);
            t3.setVisible(false);
        }
    }
    public static void main(String args[]) {
        new P14a();
    }
}