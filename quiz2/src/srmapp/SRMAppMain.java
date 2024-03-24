package srmapp;

import srmapp.model.Product;
import srmapp.model.Supplier;

import java.time.LocalDate;

public class SRMAppMain{
    public static void main(String[] args) {

        Supplier supplier = new Supplier("SS0013","Argos Fruits Suppliers","(641) 451-0098");
        supplier.getAddress().setAddress("1000 N Main Street","Fairfield","IA","52556-0001",supplier);
        Product[] products = new Product[3];
        products[0] = supplier.createProduct(3128874119l,"Banana", LocalDate.of(2023,01,24),124,0.55);
        products[1] = supplier.createProduct(3128874119l,"Apple", LocalDate.of(2023,01,24),18,1.09);
        products[2] = supplier.createProduct(3128874119l,"Carrot", LocalDate.of(2023,01,24),89,2.55);

        for(Product product : products){
            System.out.println(product);
        }
    }
}