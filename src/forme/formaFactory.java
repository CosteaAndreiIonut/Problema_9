package forme;

public class formaFactory {
	public forma_ob getShape(String shapeType){
	      if(shapeType == null){
	         return null;
	      }		
	      if(shapeType.equalsIgnoreCase("linie")){
	         return new linie();
	         
	      } else if(shapeType.equalsIgnoreCase("triunghi")){
	         return new triunghi();
	         
	      } else if(shapeType.equalsIgnoreCase("cerc")){
		         return new cerc();
		         
	      } else if(shapeType.equalsIgnoreCase("patrulater")){
	         return new patrulater();
	      
		  } else if(shapeType.equalsIgnoreCase("poligon")){
			  return new poligon();
		  }

	      return null;
	   }
}
