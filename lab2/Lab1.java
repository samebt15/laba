import java.util.Scanner;

public class Lab1 {
	public static void main(String[] argv) {
		
		System.out.println("Введите 3 точки");

		Point3d firstPoint = createNewPoint();
		System.out.println();
		Point3d secondPoint = createNewPoint();
		System.out.println();
		Point3d thridPoint = createNewPoint();
		System.out.println();

		if (firstPoint.equals(secondPoint)) {
			printError();
		} else if(secondPoint.equals(thridPoint)) {
			printError();
		} else if(firstPoint.equals(thridPoint)) {
			printError();
		} else {
			double resultArea = computeArea(firstPoint, secondPoint, thridPoint);
			printArea(resultArea);
		}
	}

	public static void printArea(double resultArea) {
		System.out.println("Площадь равна: " + resultArea);
	}

	public static void printError() {
		System.out.println("Не должно быть равных точек");
	}

	public static Point3d createNewPoint() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("x: ")
		double xCoord = scanner.nextDouble();
		System.out.println();
		System.out.print("y: ")
		double yCoord = scanner.nextDouble();
		System.out.println();
		System.out.print("z: ")
		double zCoord = scanner.nextDouble();
		System.out.println();
		return new Point3d(xCoord, yCoord, zCoord);
	}

	public static double computeArea(Point3d firstPoint, Point3d secondPoint, Point3d thridPoint) {
		return Math.sqrt(
			(firstPoint.distanceTo(secondPoint) + secondPoint.distanceTo(thridPoint) + thridPoint.distanceTo(firstPoint)) * 
			(- firstPoint.distanceTo(secondPoint) + secondPoint.distanceTo(thridPoint) + thridPoint.distanceTo(firstPoint)) * 
			(firstPoint.distanceTo(secondPoint) - secondPoint.distanceTo(thridPoint) + thridPoint.distanceTo(firstPoint)) * 
			(firstPoint.distanceTo(secondPoint) + secondPoint.distanceTo(thridPoint) - thridPoint.distanceTo(firstPoint))) / 4;
	}
} 