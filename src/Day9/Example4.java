package Day9;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Example4 extends JFrame implements ActionListener {
    private JButton bt;
	private JTextField tf;
	private int count=0;
	//constructor
	public Example4(String title) {
		super(title);
		//1. khởi tạo
		bt = new JButton("INCREASING");
		tf = new JTextField("0");
		//2. gắn nghe sự kiện
		bt.addActionListener(this);

		//3. thiết lập layout
		Container cont=this.getContentPane();
		cont.setLayout(new FlowLayout());
		
		//4. chèn thành phần
		cont.add(bt);
		cont.add(tf);
		
		//5. thiết lập hiển thị
		setVisible(true);
		setLocation(300,200);
		setSize(150, 100);
	}
	
	//phương thức
	@Override
	public void actionPerformed(ActionEvent e) {
		count++;
		tf.setText(String.valueOf(count));
		
	}
	public static void main(String[] args) {
		// CHƯƠNG TRÌNH SỬ DỤNG SWING TĂNG GIÁ TRỊ CHO Ô JTEXTFIELD
		new Example4("INCREASING");
	}
    
}
