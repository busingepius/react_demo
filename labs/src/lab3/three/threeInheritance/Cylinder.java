/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 02/03/2024
 * Time : 07:17
 * Project Name : lab3.three
 */
package lab3.three.threeInheritance;

public class Cylinder {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    private double height;

    public Cylinder(double radius, double height) {
        this.height = height;
        this.radius = radius;
    }

    public double computeVolume(){
        return Math.PI*Math.pow(radius,2)*height;
    }
}
