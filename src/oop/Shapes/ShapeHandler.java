package oop.Shapes;

public class ShapeHandler {
	// Returns the sum of the volumes of the given shapes.
	public static double volumeSum(Shape[] shapes) {
		double sum = 0;
		for (int i = 0; i < shapes.length; i++) {
			sum+=shapes[i].volume();
		}
		return sum;
	}

	// Returns the sum of the surface areas of the given shapes.
	public static double surfaceAreaSum(Shape[] shapes) {
		double sum = 0;
		for (int i = 0; i < shapes.length; i++) {
			sum+=shapes[i].surfaceArea();
		}
		return sum;
	}
}