/*
 * Noah Alonso-Torres
 * Christmas Wreath
 * Cone Class
 */

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Cone extends WreathOrnament {
	private Image pinecone = Toolkit.getDefaultToolkit().getImage("pinecone.png");
	
	public Cone(int x,int y) {
		 this.x = x;
		 this.y = y;
	}
	
	public void draw(Graphics g) {
		g.drawImage(pinecone, x, y, 75, 75, null);
	}
}
