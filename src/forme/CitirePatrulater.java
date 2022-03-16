package forme;
import java.io.*;
import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.*;

public class CitirePatrulater {
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

}
