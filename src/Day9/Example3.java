package Day9;

import java.awt.*;
import java.awt.event.*;

public class Example3 extends Frame implements ActionListener {
    // 1. Variables
    private Label l1, l2, l3;
    private TextField tf1, tf2, tf3;
    private Button b1, b2, b3, b4;
    private Panel p1, p2;
    private double rs;

    // 2. Constructor
    public Example3(String title) {
        super(title);
        l1 = new Label("Number 1: ");
        l2 = new Label("Number 2: ");
        l3 = new Label("Number 3: ");
        tf1 = new TextField();
        tf2 = new TextField();
        tf3 = new TextField();
        tf3.setEditable(false);
        b1 = new Button("+");
        b2 = new Button("-");
        b3 = new Button("*");
        b4 = new Button("/");
        p1 = new Panel();
        p2 = new Panel();

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        p1.setLayout(new GridLayout(3,3));
        p1.add(l1);
        p1.add(tf1);
        p1.add(l2);
        p1.add(tf2);
        p1.add(l3);
        p1.add(tf3);
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        add(p1, "Center");
        add(p2, "South");

        setVisible(true);
        setLocation(300, 200);
        pack();

    }

    // 3. Methods
    public void Sum() {
        rs = Double.parseDouble(tf1.getText()) +
             Double.parseDouble(tf2.getText());
        tf3.setText(String.valueOf(rs)); 
    }

    public void Subtract() {
        rs = Double.parseDouble(tf1.getText()) -
             Double.parseDouble(tf2.getText());
        tf3.setText(String.valueOf(rs)); 
    }

    public void Multiply() {
        rs = Double.parseDouble(tf1.getText()) *
             Double.parseDouble(tf2.getText());
        tf3.setText(String.valueOf(rs)); 
    }

    public void Divide() {
        rs = Double.parseDouble(tf1.getText()) /
             Double.parseDouble(tf2.getText());
        tf3.setText(String.valueOf(rs)); 
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand() == "+" ) {
            Sum();
        }

        if(e.getActionCommand() == "-" ) {
            Subtract();
        }

        if(e.getActionCommand() == "*" ) {
            Multiply();
        }

        if(e.getActionCommand() == "/" ) {
            Divide();
        }
        
    }

    public static void main(String[] args) {
        new Example3("Calculate: ");
        
    }

}
