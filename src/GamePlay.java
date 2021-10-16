import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePlay extends JPanel implements KeyListener, ActionListener{
	private Timer timer;
	private int delay = 0;
	private boolean play = false , init = true , toss = false;
	private int t = -1;
	private int comtoss = (int)(Math.random()*2);
	private int tosswon = -1;
	public GamePlay() {
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		timer = new Timer(delay , this);
		timer.start();
	}
	public void paint(Graphics g) {
		//background
		g.setColor(Color.black);
		g.fillRect(1, 1, 800, 600);
		g.setColor(Color.white);
		g.setFont(new Font("serif" , Font.BOLD , 25));
		if(!play && init) {
			g.drawString("Welcome!!" , 300 , 450);
			g.drawString("Press Enter to start the game." , 200 , 500);
		}
		if(play && !toss) {
			g.drawString("Let's toss first!" , 300 , 450);
			g.drawString("Press 'T' for tail and 'H' for heads:"  , 200 , 500);
//			init = false;
//			toss = true;
		}
		if(toss) {
			if(t == 0)
				g.drawString("You choosed Tails" , 300 , 450);
			if(t == 1)
				g.drawString("You choosed Heads" , 300 , 450);
			if(t == comtoss) {
				g.drawString("You lose the toss!" , 310 , 500);
				tosswon = 1;
			}
			else {
				g.drawString("You won the toss!" , 310 , 500);
				tosswon = 0;
			}
//			toss = false;
		}
		if(tosswon == 0) {
			g.drawString("Click '0' for Batting and '1' for bowling:" , 300 , 450);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_ENTER) {
			if(!play) {
				play = true;
			}
			repaint();
		}
		if(e.getKeyCode() == KeyEvent.VK_T) {
			if(play && !toss) {
				t = 0;
				toss = true;
			}
			repaint();
		}
		if(e.getKeyCode() == KeyEvent.VK_H) {
			if(play && !toss) {
				t = 1;
				toss = true;
			}
			repaint();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
