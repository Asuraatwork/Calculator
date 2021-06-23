import javax.swing.*;
import java.awt.event.*;

public class Calculator implements ActionListener {
    JTextField tf1, tf2, tf3;
    JButton jb1, jb2, jb3, jb4;

    Calculator() {
        JFrame frame = new JFrame("Calculator");
        frame.setBounds(1500, 100, 500, 400);

        tf1 = new JTextField();
        tf1.setBounds(50, 50, 150, 40);
        tf2 = new JTextField();
        tf2.setBounds(50, 80, 150, 40);
        tf3 = new JTextField();
        tf3.setBounds(50, 110, 150, 40);
        tf3.setEditable(false);

        jb1 = new JButton("+");
        jb1.setBounds(400, 40, 50, 50);
        jb2 = new JButton("-");
        jb2.setBounds(400, 90, 50, 50);
        jb3 = new JButton("*");
        jb3.setBounds(400, 140, 50, 50);
        jb4 = new JButton("/");
        jb4.setBounds(400, 190, 50, 50);
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);
        jb4.addActionListener(this);
        frame.add(tf1);
        frame.add(tf2);
        frame.add(tf3);
        frame.add(jb1);
        frame.add(jb2);
        frame.add(jb3);
        frame.add(jb4);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s1 = tf1.getText();
        String s2 = tf2.getText();
        double a = Double.parseDouble(s1);
        double b = Double.parseDouble(s2);
        double c = 0.0;

        if (e.getSource() == jb1) {
            c = a + b;
        } else if (e.getSource() == jb2) {
            c = a - b;
        } else if (e.getSource() == jb3) {
            c = a * b;
        } else if (e.getSource() == jb4) {
            c = a / b;
        }
        String res = String.valueOf(c);
        tf3.setText(res);
    }

    public static void main(String[] args) {
        new Calculator();
    }

}
