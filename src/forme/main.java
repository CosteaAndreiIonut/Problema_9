package forme;

import forme.fereastra;
import forme.linie;
import forme.triunghi;
import forme.cerc;
import forme.patrulater;
import forme.poligon;
import forme.cercJSON;
import forme.poligonJSON;

public class main {

	public static void main(String[] args) {
		
		punct p1 = new punct(5,6);
		
		fereastra f1 = new fereastra();
		
		cercJSON c1 = new cercJSON();
				
		cerc cerc1 = new cerc(p1,3,4);	
		cercJSON.scriere(cerc1);
		c1.citire();				
	}

}
