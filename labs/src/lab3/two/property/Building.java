/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 02/03/2024
 * Time : 07:41
 * Project Name : lab2
 */
package lab3.two.property;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private double maintenanceCost;
    List<Appartment> appartmentList = new ArrayList<>();

    public Building(double maintenanceCost){
        this.maintenanceCost = maintenanceCost;
    }

    public void addAppartment(double rent){
        appartmentList.add(new Appartment(rent));
    }

    public List<Appartment> getAppartmentList(){
        return appartmentList;
    }

    public double profit(){
        double sumOfRent = 0;
        for (Appartment appartment : appartmentList){
            sumOfRent = appartment.getRent();
        }
        return sumOfRent - maintenanceCost;
    }
}
