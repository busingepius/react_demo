/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 01/03/2024
 * Time : 14:21
 * Project Name : srmapp.model
 */
package srmapp.model;

import java.time.LocalDate;

public class Product {
    private Long productId;
    private String name;
    private LocalDate dateSupplied;
    private int quantityInStock;

    private double unitPrice;

    Product(){}

    Product(Long productId, String name, LocalDate dateSupplied, int quantityInStock, double unitPrice) {
        this.productId = productId;
        this.name = name;
        this.dateSupplied = dateSupplied;
        this.quantityInStock = quantityInStock;
        this.unitPrice = unitPrice;
    }

//    public void setProductId(Long productId) {
//        this.productId = productId;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setDateSupplied(LocalDate dateSupplied) {
//        this.dateSupplied = dateSupplied;
//    }
//
//    public void setQuantityInStock(int quantityInStock) {
//        this.quantityInStock = quantityInStock;
//    }
//
//    public void setUnitPrice(double unitPrice) {
//        this.unitPrice = unitPrice;
//    }

    @Override
    public String toString() {
        return "{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", dateSupplied=" + dateSupplied +
                ", quantityInStock=" + quantityInStock +
                ", unitPrice=$" + unitPrice +
                '}';
    }
}
