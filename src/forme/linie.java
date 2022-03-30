package forme;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

public class linie extends punct {
	  
	private int x1,y1,x2,y2;
	private punct p1 = new punct(x1,y1);
	private punct p2 = new punct(x2,y2);
	
	public linie(punct p1,punct p2) {
		this.p1.x = p1.x;
		this.p1.y = p1.y;
		this.p2.x = p2.x;
		this.p2.y = p2.y;
	}
	
    public void trasare(Graphics g)
    {
        g.drawLine(p1.x, p1.y, p2.x, p2.y);
    }
    
    	
	public int getX1() {
		return p1.x;
	}
	
	public int getY1() {
		return p1.y;
	}
	
	public int getX2() {
		return p2.x;
	}
	
	public int getY2() {
		return p2.y;
	}

	public void setX1(int x) {
		this.p1.x = x1;
	}
	
	public void setY1(int y) {
		this.p1.y = y1;
	}
	
	public void setX2(int x) {
		this.p2.x = x2;
	}
	
	public void setY2(int y) {
		this.p2.y = y2;
	}
}