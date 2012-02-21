/*
 * Noah Alonso-Torres
 * Christmas Wreath
 * Bow Class
 */

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Bow extends WreathOrnament {
	private Image bow = Toolkit.getDefaultToolkit().getImage("bow.png");
	
	public void draw(Graphics g) {
		g.drawImage(bow, 125, 25, 200, 350, null);
	}
}
