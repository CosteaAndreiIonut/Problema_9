package forme;

public class imagine {
	
	private forma[] lista_forme ;
	
	public void imgaine() {
		lista_forme = new forma[5];
		lista_forme[0]=new linie(0, 0, 0, 0);
		lista_forme[1]=new triunghi(0, 0, 0, 0, 0, 0);
		lista_forme[2]=new cerc(0, 0, 0, 0);
		lista_forme[3]=new patrulater(0, 0, 0, 0, 0);
		lista_forme[4]=new poligon(null, null, 0);
	}
}
