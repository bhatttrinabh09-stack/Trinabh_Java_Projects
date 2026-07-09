import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class P14c extends JFrame implements ActionListener {

    JLabel l1,l2,l3,l4,l5;

    JTextField t1;

    JRadioButton r1,r2;

    JCheckBox c1,c2,c3,c4,c5;

    JComboBox<String> cb;

    JTextArea ta;

    JButton b1,b2;

    ButtonGroup bg;

    P14c() {

        l1 = new JLabel("Name:");
        l2 = new JLabel("Gender:");
        l3 = new JLabel("Hobbies:");
        l4 = new JLabel("Favourite Place:");
        l5 = new JLabel("Details:");

        t1 = new JTextField(20);

        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");

        bg = new ButtonGroup();

        bg.add(r1);
        bg.add(r2);

        c1 = new JCheckBox("Music");
        c2 = new JCheckBox("Swimming");
        c3 = new JCheckBox("Reading");
        c4 = new JCheckBox("Gaming");
        c5 = new JCheckBox("Traveling");

        String places[] = {
            "Mumbai",
            "Goa",
            "Manali",
            "Kashmir",
            "Dubai",
            "London",
            "Tokyo",
            "New York"
        };

        cb = new JComboBox<>(places);

        ta = new JTextArea(8,25);

        b1 = new JButton("Submit");
        b2 = new JButton("Exit");

        setLayout(new GridLayout(7,2,10,10));

        add(l1);
        add(t1);

        add(l2);

        JPanel p1 = new JPanel();

        p1.add(r1);
        p1.add(r2);

        add(p1);

        add(l3);

        JPanel p2 = new JPanel();

        p2.add(c1);
        p2.add(c2);
        p2.add(c3);
        p2.add(c4);
        p2.add(c5);

        add(p2);

        add(l4);
        add(cb);

        add(l5);
        add(new JScrollPane(ta));

        add(b1);
        add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);

        setTitle("Student Form");
        setSize(700,500);
        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {

        if(ae.getSource()==b1) {

            String name = t1.getText();

            String gender = "";

            if(r1.isSelected()) {
                gender = "Male";
            }

            if(r2.isSelected()) {
                gender = "Female";
            }

            String hobbies = "";

            if(c1.isSelected()) {
                hobbies += "Music ";
            }

            if(c2.isSelected()) {
                hobbies += "Swimming ";
            }

            if(c3.isSelected()) {
                hobbies += "Reading ";
            }

            if(c4.isSelected()) {
                hobbies += "Gaming ";
            }

            if(c5.isSelected()) {
                hobbies += "Traveling ";
            }

            String place = cb.getSelectedItem().toString();

            ta.setText(
                "Name: " + name +
                "\nGender: " + gender +
                "\nHobbies: " + hobbies +
                "\nFavourite Place: " + place
            );
        }

        if(ae.getSource()==b2) {

            System.exit(0);
        }
    }

    public static void main(String args[]) {

        new P14c();
    }
}
