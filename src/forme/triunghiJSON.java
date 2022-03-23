package forme;
import java.io.*;
import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.*;

public class triunghiJSON {
	public void citire(){
	JSONParser parser = new JSONParser();
 
       Object t1 = null;
	try {
		t1 = parser.parse(new FileReader("json_triunghi.json"));
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
       JSONObject jsonTriunghi = (JSONObject)t1;

       JSONArray coordonate = (JSONArray)jsonTriunghi.get("triunghi");

       Iterator iterator = coordonate.iterator();
       while (iterator.hasNext()) {
          System.out.println(iterator.next());
       }

    }
	
	static public void scriere(forme.triunghi t){
		JSONObject triunghi = new JSONObject();
		
		JSONArray Coord = new JSONArray();
		Coord.add("x1: " + t.getX1());
		Coord.add("y2: " + t.getY1());
		Coord.add("x2: "+ t.getX2());
		Coord.add("y2: "+ t.getY2());
		Coord.add("y3: "+ t.getY3());
		Coord.add("y3: "+ t.getY3());
		
		triunghi.put("triunghi", Coord);
		
		File file = new File("json_triunghi.json");
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(triunghi.toJSONString());
			fileWriter.flush();
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
