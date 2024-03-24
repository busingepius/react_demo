/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 02/03/2024
 * Time : 07:27
 * Project Name : lab3.threeComposition
 */
package lab3.three.threeComposition;

public class Cylinder {
    private double height;
    private Circle circle;
    private double radius;

    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
        this.circle = new Circle(radius);
    }

    public double computeVolume() {
        return circle.computeArea() * height;

    }
}
