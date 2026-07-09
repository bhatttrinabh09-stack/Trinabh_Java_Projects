import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class P14b extends JFrame implements ActionListener {

    JTextField t;
    JButton b[] = new JButton[17];

    String s[] = {
        "7","8","9","/",
        "4","5","6","*",
        "1","2","3","-",
        "0",".","=","+",
        "C"
    };

    float n1, n2, result;
    String op;

    P14b() {

        t = new JTextField(20);

        setLayout(new FlowLayout());

        add(t);

        JPanel p = new JPanel();

        p.setLayout(new GridLayout(5,4));

        for(int i=0; i<17; i++) {

            b[i] = new JButton(s[i]);

            p.add(b[i]);

            b[i].addActionListener(this);
        }

        add(p);

        setTitle("Calculator");
        setSize(250,300);
        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {

        String str = ae.getActionCommand();

        if(str.equals("C")) {

            t.setText("");
        }

        else if(str.equals("+") || str.equals("-") ||
                str.equals("*") || str.equals("/")) {

            n1 = Float.parseFloat(t.getText());

            op = str;

            t.setText(t.getText() + op);
        }

        else if(str.equals("=")) {

            String exp = t.getText();

            String num[] = exp.split("[+\\-*/]");

            n1 = Float.parseFloat(num[0]);
            n2 = Float.parseFloat(num[1]);

            if(op.equals("+")) {
                result = n1 + n2;
            }

            if(op.equals("-")) {
                result = n1 - n2;
            }

            if(op.equals("*")) {
                result = n1 * n2;
            }

            if(op.equals("/")) {
                result = n1 / n2;
            }

            t.setText(exp + "=" + result);
        }

        else {

            t.setText(t.getText() + str);
        }
    }

    public static void main(String args[]) {

        new P14b();
    }
}