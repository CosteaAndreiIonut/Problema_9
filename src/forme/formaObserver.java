package forme;

public class formaObserver extends observer {
	public formaObserver(forma f) {
		this.f = f;
		this.f.attach(this);
	}
  
	public void update() {
		
	}
		
}
