package forme;
import java.io.*;
import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.*;

public class CitireLinie {
	
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
}
