package forme;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

public class cerc extends forma{

	private int x,y,raza,diametru;
	
	public cerc(int x, int y, int raza, int diametru) {
		this.x = x;
		this.y = y;
		this.raza = raza;
		this.diametru = diametru;
	}
	
    public void trasare(Graphics g)
    {		
    	  diametru = raza * 2;
    	  g.fillOval((x - raza), (y - raza), diametru, diametru);
    }
    
    public void drag(Graphics g){
    	
    }
    
    
    public void drop(Graphics g) {
    	
    }
    
    
    public void resize(Graphics g,int x, int y, int raza, int diametru) {
		this.x = x;
		this.y = y;
		this.raza = raza;
		this.diametru = diametru;
    }
    
    public void rotate(Graphics g) {
    	cerc c1 = null ;
    	float radiani = 0;
    	Graphics2D g2d = (Graphics2D) g;
    	AffineTransform oldTransform = g2d.getTransform();
        c1.trasare(g2d);
        g2d.rotate(radiani);
    }
	
}
