package forme;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

public class linie extends forma {
	  
	private int x1,y1,x2,y2;
	
	public linie(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
    public void trasare(Graphics g)
    {
        g.drawLine(x1, y1, x2, y2);
    }
    
    
    public void drag(){
    	
    }
    
    
    public void drop() {
    	
    }
    
    
    public void resize(Graphics g,int x1, int y1, int x2, int y2) {
    	this.x1 = x1;
    	this.x2 = x2;
    	this.y1 = y1;
    	this.y2 = y2;
    }


	public void rotate(Graphics g) {
    	linie l1 = null;
    	float radiani = 0;
    	Graphics2D g2d = (Graphics2D) g;
    	AffineTransform oldTransform = g2d.getTransform();
        l1.trasare(g2d);
        g2d.rotate(radiani);
    }
	
	public int getX1() {
		return x1;
	}
	
	public int getY1() {
		return y1;
	}
	
	public int getX2() {
		return x2;
	}
	
	public int getY2() {
		return y2;
	}
}
