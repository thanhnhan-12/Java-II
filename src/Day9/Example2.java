package Day9;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example2 extends Frame implements ActionListener {
    // 1. Variables
    private Button b1, b2, b3;
    private CardLayout cdr;

    // 2. Constructor
    public Example2(String title) {
        super(title);
        b1 = new Button("ONE");
        b2 = new Button("TWO");
        b3 = new Button("THREE");
        cdr = new CardLayout();

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        setLayout(cdr);

        add(b1);
        add(b2);
        add(b3);

        setVisible(true);
        setLocation(300, 200);
        setSize(500, 400);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        cdr.next(this);
    }

    public static void main(String[] args) {
        new Example2("CARD LAYOUT");

    }
    
}
