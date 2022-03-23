package forme;
import java.io.*;
import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.*;

public class linieJSON {
	
	public void citire(){
	JSONParser parser = new JSONParser();
 
       Object l1 = null;
	try {
		l1 = parser.parse(new FileReader("json_linie.json"));
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
       JSONObject jsonLinie = (JSONObject)l1;

       JSONArray coordonate = (JSONArray)jsonLinie.get("linie");

       Iterator iterator = coordonate.iterator();
       while (iterator.hasNext()) {
          System.out.println(iterator.next());
       }

    }
	
	static public void scriere(forme.linie l){
		JSONObject linie = new JSONObject();
		
		JSONArray Coord = new JSONArray();
		Coord.add("x1: " + l.getX1());
		Coord.add("y1: " +l.getY1());
		Coord.add("x2: " + l.getX2());
		Coord.add("y2: " +l.getY2());
		
		linie.put("linie", Coord);
		
		File file = new File("json_linie.json");
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(linie.toJSONString());
			fileWriter.flush();
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
