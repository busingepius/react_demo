/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 02/03/2024
 * Time : 08:09
 * Project Name : lab2.property
 */
package lab3.two;

import lab3.two.property.Building;
import lab3.two.property.LandLord;

public class Main {
    public static void main(String[] args) {
        LandLord landLord = new LandLord();
        Building building1 = new Building(1.0);
        landLord.addBuilding(building1);
        building1.addAppartment(2000.0);
        building1.addAppartment(3000.0);
        building1.addAppartment(4000.0);

        System.out.println(landLord.getTotalProfit());
    }
}
