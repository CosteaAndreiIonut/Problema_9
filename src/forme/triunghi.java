package forme;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

public class triunghi extends forma{
	
	private int x1,y1,x2,y2,x3,y3;
	
	public triunghi(int x1, int x2, int x3, int y1, int y2, int y3) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
	}
	
	public void trasare(Graphics g) {
		g.drawLine(x1, y1, x2, y2);
		g.drawLine(x2, y2, x3, y3);
		g.drawLine(x3, y3, x1, y1);
	}
	
    public void drag(Graphics g){
    	
    }
    
    
    public void drop(Graphics g) {
    	
    }
    
    
    public void resize(Graphics g, int x1, int x2, int x3, int y1, int y2, int y3) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
    }
    
    public void rotate(Graphics g) {
    	triunghi t1 = null;
    	float radiani = 0;
    	Graphics2D g2d = (Graphics2D) g;
    	AffineTransform oldTransform = g2d.getTransform();
        t1.trasare(g2d);
        g2d.rotate(radiani);
    }

}
