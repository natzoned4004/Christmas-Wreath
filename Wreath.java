/*
 * Noah Alonso-Torres
 * Christmas Wreath
 * Wreath Class
 */

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class Wreath extends JComponent {
	private Image wreath = Toolkit.getDefaultToolkit().getImage("wreath.png");
	
	WreathOrnament[] decorations =   new WreathOrnament[100]; 
	public static final int SIZE=440;
	
	public Wreath() {
		setPreferredSize(new Dimension(SIZE, SIZE)); 
	    
		JFrame frame = new JFrame("Wreath");
		frame.setLayout(new BorderLayout());
		
		frame.getContentPane().add(this,BorderLayout.CENTER);
		for(int i=0; i<decorations.length/2;++i) {
			decorations[i]=new Light();
		}
		for(int i=decorations.length/2; i<decorations.length-2;++i) {
			decorations[i]=new BlinkingLight();
		}
		decorations[decorations.length-3] = new Bow();
		
		decorations[decorations.length-2] = new Cone(325,150);
		decorations[decorations.length-1] = new Cone(75,250);
	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	public void paintComponent(Graphics g) {
		g.drawImage(wreath, 0, 0, SIZE, SIZE, null);
		for(int i=0; i<decorations.length;i++) {
		decorations[i].draw(g);
		}
	}
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(500);
	        } catch (InterruptedException e) { /* ignore, shouldn't happen */ }
	        repaint();
		}
	}			
	
	public static void main(String[] args)
	{
		Wreath wreath = new Wreath();
        wreath.run();
	}
}
