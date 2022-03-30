package forme;

public class punct {
    private static punct instance;

    protected int x, y;
        
    punct(int x,int y){
	this.x = x;
	this.y = y;
    }
    
    public static synchronized punct getInstance(){
        int a = 0;
		int b = 0;
        if(instance == null){
            instance = new punct(a, b);
        }
        return instance;
    }
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
}
