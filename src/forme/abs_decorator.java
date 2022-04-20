package forme;

import java.awt.Graphics;

public abstract class abs_decorator implements forma_ob {
	   protected forma_ob dec;

	   public abs_decorator(forma_ob dec){
	      this.dec = dec;
	   }

	   public void trasare(Graphics g){
	      dec.trasare();
	   }	
	}
