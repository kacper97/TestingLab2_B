package cartesian;

public class Point {

	private int x;
	private int y;
	
	public Point(int x, int y) {
		if(x <0){
		  x*=-1;
		}
		
		if(x>100){
			x=100;
		}
		
		if(y>100){
			y=100;
		}
		this.x=x;
		
		this.y=y;
	}

	public Object getX() {
		return x;
	}
	
	public Object getY() {
		return y;
	}

}
