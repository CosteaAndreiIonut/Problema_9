package forme;
import java.io.*;
import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.*;

public class CitirePoligon {
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

}
