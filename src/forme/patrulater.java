package forme;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

public class patrulater extends forma{
	
	private int x1,y1,x2,y2,y3;
	
	public patrulater(int x1,int y1, int x2, int y2, int y3) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
		this.y3 = y3;

	}
	
	public void trasare(Graphics g) {	
		
        g.drawLine(x1 ,y1, x2, y2);		//x1,y1,x2,y2 30, 100, 400, 100
        g.drawLine(x2 ,y2, x2, y3);		//x2,y2,x2,y3 400, 100, 400, 200
        g.drawLine(x2 ,y3, x1, y3);		//x2,y3,x1,y3 400, 200, 30, 200
        g.drawLine(x1 ,y3, x1, y1);		//x1,y3,x1,y1 30, 200, 30, 100
	}

    public void drag(Graphics g){
    	
    }
    
    
    public void drop(Graphics g) {
    	
    }
    
    
    public void resize(int x1,int y1, int x2, int y2,int y3) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.y3 = y3;
    }
    
    public void rotate(Graphics g) {
    	patrulater plat1 = null;
    	float radiani = 0;
    	Graphics2D g2d = (Graphics2D) g;
    	AffineTransform oldTransform = g2d.getTransform();
        plat1.trasare(g2d);
        g2d.rotate(radiani);
    }
}
