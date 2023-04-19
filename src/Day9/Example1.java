package Day9;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class Example1 extends Frame {

    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;

    public Example1(String title) {
        super(title);
        b1 = new Button("NORTH");
        b2 = new Button("SOUTH");
        b3 = new Button("EAST");
        b4 = new Button("WEST");
        b5 = new Button("CENTER");

        setLayout(new BorderLayout(20, 10));

        add(b1, BorderLayout.NORTH);
        add(b2, BorderLayout.SOUTH);
        add(b3, BorderLayout.EAST);
        add(b4, BorderLayout.WEST);
        add(b5, BorderLayout.CENTER);

        setSize(400, 300); 
        setVisible(true);

    }

    public static void main(String[] args) {
        new Example1("BOX");
    }

}
