/*5.	
 * Write the classes Line, Rectangle, Cube etc. & make the Shape as their base class. 
 * Add an abstract draw() method in the class Shape & draw all shapes.*/

package com.shariful.oct27.oopbasics;

abstract class Shape
{
	abstract void draw();
}

class Line extends Shape
{
	void draw()
	{
		System.out.print("Line is drawn...\n");
	}
}
class Rect extends Shape
{
	void draw()
	{
		System.out.print("Rectangle is drawn...\n");
	}
}
class Cube extends Shape
{
	void draw()
	{
		System.out.print("Cube is drawn...\n");
	}
}
public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s=new Line();
		s.draw();
		Shape s1=new Rect();
		s1.draw();
		Shape s2=new Cube();
		s2.draw();
	}

}

