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
		fereastra f1 = new fereastra();
		
		cercJSON c1 = new cercJSON();
				
		cerc cerc1 = new cerc(2,3,4,1);	
		cercJSON.scriere(cerc1);
		c1.citire();				
	}

}
