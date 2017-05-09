package org.tenthchapter.java;

interface NewShape
{
	void draw();
	int radius = 10;
}
class NewCircle implements NewShape
{
	public void draw()
	{
	int radius = 1;
		System.out.println(" Radius is : " + radius);
	}
}


public class InterfaceVar {
	public static void main(String[] args) {
		
		NewShape nc = new NewCircle();
		nc.draw();
	}

}
