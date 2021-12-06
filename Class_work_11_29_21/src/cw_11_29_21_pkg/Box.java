package cw_11_29_21_pkg;

public class Box {
	
	//instance variables
	private int x,y,z;
	//constructor
	public Box(int x_in, int y_in, int z_in) {
		x=x_in;
		y=y_in;
		z=z_in;
	}
	//object method
	public int getVolume() {
		return x*y*z;
	}

}
