package chapter;

abstract class Hexahedron {
	int h;

	Hexahedron(int h) {

		this.h = h;

	}

	double area() {
		return h * h * Math.PI;
	}

	double length() {
		return 2 * h * Math.PI;
	}

	@Override
	public String toString() {

		String type = null;
		return "Shape [type = " + type + ", r=" + h + "]";

	};
}
