package forme;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

public class poligon implements forma_ob{
	
	private int x[], y[], n;
	
	public poligon(int x[],int y[], int n) {
		this.x = x;
		this.y = y;
		this.n = n;
	}
	
	public void trasare(Graphics g) {
		
		//x = {};
		//y = {};
		g.drawPolygon(new int[] {}, new int[] {}, n);
	}
}
    
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getN() {
		return n;
	}
    public void setX1(int x) {
	this.x = x;
    }
    
    public void setY1(int y) {
	this.y = y;
    }
    
    public void setX2(int n) {
	this.n = n;
    }

}
