package org.ninthchapter.java;

abstract class Figure {
	int x, y;

	void changePosition(int newX, int newY) {
	}

	abstract void draw();
}

class CircleObject extends Figure {
	void draw() {
		System.out.println("Draw Method Called");
	}
}

class RectangleObject extends Figure {
	void changePosition(int newX, int newY) {
		System.out.println("Change Position Method Called");
	}

	@Override
	void draw() {
		// TODO Auto-generated method stub
		
	}
	
}
class FigureDraw {

	public static void main(String[] args)
	{
		Obj o = new Obj();
		
	}
}

