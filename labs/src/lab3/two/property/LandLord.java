/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 02/03/2024
 * Time : 07:40
 * Project Name : lab2
 */
package lab3.two.property;

import java.util.ArrayList;
import java.util.List;

public class LandLord {

    private List<Building> buildings = new ArrayList<>();
    private double totalProfit;

    public LandLord(){}

    public void addBuilding(Building building){
        buildings.add(building);
    }

    public List<Building> getBuildings(){
        return buildings;
    }

    public double getTotalProfit() {
        for (Building building: buildings){
            totalProfit += building.profit();
        }
        return totalProfit;
    }
}
