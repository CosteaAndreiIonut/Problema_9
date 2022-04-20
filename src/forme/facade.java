package forme;

public class facade {
	private forma_ob linie;
	private forma_ob cerc;
	private forma_ob triunghi;
	private forma_ob patrulater;
	private forma_ob poligon;

	public facade() {
		  linie = new linie();
	      cerc = new cerc();
	      triunghi = new triunghi();
	      patrulater = new patrulater();
	      poligon = new poligon();
	   }

	   public void trasareLinie(){
	      linie.trasare();
	   }
	   
	   public void trasareCerc(){
		   cerc.trasare();
	   }
	   
	   public void trasareTriunghi(){
		   triunghi.trasare();
	   }
	   
	   public void trasarePatrulater(){
		   patrulater.trasare();
	   }
	   
	   public void trasarePoligon(){
		   poligon.trasare();
	   }
	   
}
