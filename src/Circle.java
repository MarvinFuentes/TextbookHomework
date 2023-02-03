/**
 * @class: Circle
 * @aurthor: Marvin Fuentes
 * @course: ITEC 2140 section 4
 * @written: January 26, 2023
 */
public class Circle {
    public static void main(String[] args) {
        double radius = 9.5; // Stating the radius of the circle.
        double area = radius * radius * Math.PI; // Finding the area of circle with the formula provided.
        double perimeter = 2 * radius * Math.PI;
        // Finding the perimeter of the circle with the formula provided.
        System.out.println("Area of the circle: " + (area)); // Stating the area of the circle.
        System.out.println("Perimeter of the circle: " + (perimeter)); // Stating the perimeter of the circle.
    }

}
