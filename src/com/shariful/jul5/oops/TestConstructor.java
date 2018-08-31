package com.shariful.jul5.oops;

class Point {
    protected int x, y;
  
    public Point(int _x, int _y) {
        x = _x;
        y = _y;
    }
}

public class TestConstructor {
	public static void main(String args[]) {
			//Point p = new Point();  
			Point p = new Point(2,3);		// need default consturctor if we want to execute this line
			System.out.println("x = " + p.x + ", y = " + p.y);
	    }
}
