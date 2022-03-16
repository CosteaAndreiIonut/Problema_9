package forme;
import java.io.*;
import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.*;

public class CitireCerc {
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

}
