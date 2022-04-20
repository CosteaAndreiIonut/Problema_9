package forme;

import java.awt.Graphics;

public class decorator extends abs_decorator {

	   public decorator(forma_ob dec) {
	      super(dec);		
	   }

	   @Override
	   public void trasare(Graphics g) {
	      dec.trasare();	       
	      setMsg(dec);
	   }

	   private void setMsg(forma_ob dec){
	      System.out.println("dfasdfad");
	   }

	}