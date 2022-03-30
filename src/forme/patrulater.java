package forme;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

public class patrulater extends punct {
	  
	private int x1,y1,x2,y2,x3,y3,x4,y4;
	punct p1 = new punct(x1,y1);
	punct p2 = new punct(x2,y2);
	punct p3 = new punct(x3,y3);
	punct p4 = new punct(x4,y4);
	
	public patrulater(punct p1,punct p2,punct p3,punct p4) {
		this.p1.x = p1.x;
		this.p1.y = p1.y;
		this.p2.x = p2.x;
		this.p2.y = p2.y;
		this.p3.x = p3.x;
		this.p3.y = p3.y;
		this.p4.x = p4.x;
		this.p4.y = p4.y;
	}
	
    public void trasare(Graphics g) {

		g.drawPolygon(new int[] {p1.x, p2.x, p3.x, p4.x}, new int[] {p1.y, p2.y, p3.y, p4.y}, 4);
		
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
	public int getX4() {
		return p4.x;
	}
	
	public int getY4() {
		return p4.y;
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
    
    public void setX3(int x) {
    this.p3.x = x3;
    }
    
    public void setY3(int y) {
    this.p3.y = y3;
    }
    
    public void setX4(int x) {
    this.p4.x = x4;
    }
    
    public void setY4(int y) {
    this.p4.y = y4;
    }
}