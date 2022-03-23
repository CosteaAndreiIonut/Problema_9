package forme;
import java.io.*;
import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.*;

public class cercJSON {
	public void citire(){
	JSONParser parser = new JSONParser();
 
       Object c1 = null;
	try {
		c1 = parser.parse(new FileReader("json_cerc.json"));
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
       JSONObject jsonCerc = (JSONObject)c1;

       JSONArray coordonate = (JSONArray)jsonCerc.get("cerc");

       Iterator iterator = coordonate.iterator();
       while (iterator.hasNext()) {
          System.out.println(iterator.next());
       }

    }
	
	static public void scriere(forme.cerc c){
		JSONObject cerc = new JSONObject();
		
		JSONArray Coord = new JSONArray();
		Coord.add("x: " + c.getX());
		Coord.add("y: " +c.getY());
		Coord.add("raza: "+c.getRaza());
		Coord.add("diametru: "+c.getDiametru());
		
		cerc.put("cerc", Coord);
		
		File file = new File("json_cerc.json");
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(cerc.toJSONString());
			fileWriter.flush();
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
