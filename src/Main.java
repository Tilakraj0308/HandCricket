import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
	public static void main(String[] args) {
		JFrame ob = new JFrame();
		GamePlay gamePlay = new GamePlay();
//		ob.setBounds(10, 10, 700, 600);
		ob.setSize(800, 600); //-------> Sets size.
		ob.setResizable(false);//------>sets frame in the middle and sets scale according to frame.
		ob.setVisible(true);
		ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ob.setLocationRelativeTo(null);
		ob.add(gamePlay);
	}
}