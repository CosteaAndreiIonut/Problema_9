package forme;

public class formaBuilder {

	formaBuilder setCoordonate(Coordonate coordonate){
		this.coordonate = coordonate;
		return this;
	}
	
	forma trasare(){
		forma f =  new forma(this);
		return f;		
}
