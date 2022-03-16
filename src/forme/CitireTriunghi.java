package forme;
import java.io.*;
import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.*;

public class CitireTriunghi {
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

}
