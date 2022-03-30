package forme;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

public class triunghi extends punct {
	  
	private int x1,y1,x2,y2,x3,y3;
	punct p1 = new punct(x1,y1);
	punct p2 = new punct(x2,y2);
	punct p3 = new punct(x3,y3);
	
	public triunghi(punct p1,punct p2,punct p3) {
		this.p1.x = p1.x;
		this.p1.y = p1.y;
		this.p2.x = p2.x;
		this.p2.y = p2.y;
		this.p3.x = p3.x;
		this.p3.y = p3.y;
	}
	
    public void trasare(Graphics g)
    {	
    	
		g.drawPolygon(new int[] {p1.x, p2.x, p3.x}, new int[] {p1.y, p2.y, p3.y}, 3);
		
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

	public int getX3() {
		return p3.x;
	}
	
	public int getY3() {
		return p3.y;
	}

    public void setX1(int x) {
	this.x = x1;
    }
    
    public void setY1(int y) {
	this.x = y1;
    }
    
    public void setX2(int x) {
	this.x = x2;
    }
    
    public void setY2(int x) {
	this.x = y2;
    }
    
    public void setX3(int x) {
	this.x = x3;
    }
    
    public void setY3(int x) {
	this.x = y3;
    }
}