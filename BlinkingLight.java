/*
 * Noah Alonso-Torres
 * Christmas Wreath
 * BlinkingLight Class
 */

import java.awt.Graphics;

public class BlinkingLight extends Light
{
	public void draw(Graphics g)
	{
		double newRandom = Math.random();
		
		if(newRandom >=0.5)
			super.draw(g);
	}
}
