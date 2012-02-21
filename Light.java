/*
 * Noah Alonso-Torres
 * Christmas Wreath
 * Light Class
 */

import java.awt.Color;
import java.awt.Graphics;

public class Light extends WreathOrnament {
	Color color;
	
	public Light() {
		double random = Math.random();
		if(random < 0.3) color = Color.WHITE;
		else if(random >= 0.3 && random < 0.66) color = Color.RED;
		else if(random >= 0.666) color = Color.GREEN;
	}
	
	public void draw(Graphics g) {
		g.setColor(color);
		g.fillOval(x,y,5,5);
	}
}
