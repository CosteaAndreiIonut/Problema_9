package forme;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

public class cerc implements forma_ob{

	private int x1,y1;
	private punct p = new punct(x1, y1);
	private int raza,diametru;
	private int r,d;
	
	public cerc(punct p, int raza, int diametru) {
		this.p.x = p.x;
		this.p.y = p.y;

		this.raza = raza;
		this.diametru = diametru;
	}
	
    public void trasare(Graphics g)
    {	
    	  cerc c = new cerc(p, r, d);
    	  diametru = raza * 2;
    	  g.fillOval((p.x - raza), (p.y - raza), diametru, diametru);
    }

    
    public int getX() {
    	return p.x;
    }
    
    public int getY() {
    	return p.y;
    }
    
    public int getRaza() {
    	return raza;
    }
	
    public int getDiametru() {
    	return diametru;
    }

    public void setX(int x) {
	this.p.x = x;
    }
    
    public void etY1(int y) {
	this.p.x = y;
    }
    
    public void setRaza(int r) {
	this.raza = r;
    }
    
    public void setDiametru(int d) {
	this.diametru = d;
    }
}
