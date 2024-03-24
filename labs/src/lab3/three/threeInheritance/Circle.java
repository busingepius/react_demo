/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 02/03/2024
 * Time : 07:16
 * Project Name : lab3.three
 */
package lab3.three.threeInheritance;

public class Circle extends  Cylinder{

    public Circle(double radius) {
        super(radius, 0);
    }

    public double computeArea(){
        return Math.PI*Math.pow(getRadius(),2);
    }
}
