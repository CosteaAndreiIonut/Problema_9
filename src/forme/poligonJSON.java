package forme;
import java.io.*;
import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.*;

public class poligonJSON {
	public void citire(){
	JSONParser parser = new JSONParser();
 
       Object poli1 = null;
	try {
		poli1 = parser.parse(new FileReader("json_poligon.json"));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
       JSONObject jsonPoligon = (JSONObject)poli1;

       JSONArray coordonate = (JSONArray)jsonPoligon.get("poligon");

       Iterator iterator = coordonate.iterator();
       while (iterator.hasNext()) {
          System.out.println(iterator.next());
       }

    }
	
	static public void scriere(forme.poligon poli){
		JSONObject poligon = new JSONObject();
		
		JSONArray Coord = new JSONArray();
		Coord.add("x: " + poli.getX());
		Coord.add("y: " + poli.getY());
		Coord.add("n: "+ poli.getN());

		
		poligon.put("poligon", Coord);
		
		File file = new File("json_poligon.json");
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(poligon.toJSONString());
			fileWriter.flush();
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
