package forme;
import java.io.*;
import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.*;

public class patrulaterJSON {
	public void citire(){
	JSONParser parser = new JSONParser();
 
       Object patrul1 = null;
	try {
		patrul1 = parser.parse(new FileReader("json_patrulater.json"));
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
       JSONObject jsonPatrulater = (JSONObject)patrul1;

       JSONArray coordonate = (JSONArray)jsonPatrulater.get("patrulater");

       Iterator iterator = coordonate.iterator();
       while (iterator.hasNext()) {
          System.out.println(iterator.next());
       }

    }
	
	static public void scriere(forme.patrulater p4){
		JSONObject patrulater = new JSONObject();
		
		JSONArray Coord = new JSONArray();
		Coord.add("x1: " + p4.getX1());
		Coord.add("y2: " + p4.getY1());
		Coord.add("x2: "+ p4.getX2());
		Coord.add("y2: "+ p4.getY2());
		Coord.add("y3: "+ p4.getY3());
		
		patrulater.put("patrulater", Coord);
		
		File file = new File("json_patrulater.json");
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(patrulater.toJSONString());
			fileWriter.flush();
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
