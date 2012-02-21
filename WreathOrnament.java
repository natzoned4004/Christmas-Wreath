/*
 * Noah Alonso-Torres
 * Christmas Wreath
 * WreathOrnament Class
 */

import java.awt.Point;
import java.awt.Graphics;

abstract public class WreathOrnament{
    protected static int RADIUS_INNER = 60;
    protected static int RADIUS_OUTER = 200;
    protected static int CENTER_X = 220;
    protected static int CENTER_Y = 220;
    protected int x, y; // location of ornament

    // Construct an ornament
    public WreathOrnament() {
        Point location = randomPointOnWreath(RADIUS_INNER, RADIUS_OUTER);
        x = (int) location.getX();
        y = (int) location.getY();
    }
    
    public WreathOrnament(int x, int y){
    	this.x = x;
    	this.y = y;
    }

    abstract public void draw(Graphics g);

   // select a random point on the wreath for the ornament
    private Point randomPointOnWreath(int radInner, int radOuter) {
    	
    	// generate a random radius between radInner and radOuter
    	double distance = radInner + (radOuter-radInner)*Math.random();
    	
    	// generate a random angle between 0 and 360
        double angle = 360.0 * Math.random();
       
        int ornamentX = (int) (CENTER_X + distance* Math.cos(angle));
		int ornamentY = (int) (CENTER_Y - distance* Math.sin(angle));
		
		//System.out.print(ornamentX + ", " + ornamentY);
		//System.out.println(", " + distance + ", " + angle);
		
        Point p = new Point(ornamentX, ornamentY);
        return p;
    }
}