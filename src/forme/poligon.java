package forme;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

public class poligon extends forma{
	
	private int x[], y[], n;
	
	public poligon(int x[],int y[], int n) {
		this.x = x;
		this.y = y;
		this.n = n;
	}
	
	public void trasare(Graphics g) {
		
		//x = {};
		//y = {};
		
		g.drawPolygon(x, y, n);
	}
	
    public void drag(Graphics g){
    	
    }
    
    
    public void drop(Graphics g) {
    	
    }
    
    
    public void resize(Graphics g,int x[],int y[], int n) {
		this.x = x;
		this.y = y;
		this.n = n;
    }
    
    public void rotate(Graphics g) {
    	poligon poli1 = null;
    	float radiani = 0;
    	Graphics2D g2d = (Graphics2D) g;
    	AffineTransform oldTransform = g2d.getTransform();
        poli1.trasare(g2d);
        g2d.rotate(radiani);
    }

}
