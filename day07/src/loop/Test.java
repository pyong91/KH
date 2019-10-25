package loop;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;;

public class Test {
	public static void main(String[] args) {
		MyFrame f = new MyFrame("창이름");
	}
}

class MyFrame extends JFrame {

	public MyFrame(String str) {
		setTitle(str);
		this.setLayout(new FlowLayout());
		setBounds(500, 300, 500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton button = new JButton("버튼");
		this.add(button);
	}
}