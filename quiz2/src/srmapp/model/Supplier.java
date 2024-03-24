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
import java.util.ArrayList;
import java.util.List;

public class Supplier {
    private String supplierNumber;
    private String name;
    private String contactPhoneNo;
    private Address address;

    private List<Product> products = new ArrayList<>();

    Supplier() {
    }

    public Supplier(String supplierNumber,
                    String name,
                    String contactPhoneNo) {
        this.supplierNumber = supplierNumber;
        this.name = name;
        this.contactPhoneNo = contactPhoneNo;
        this.address = new Address(this);
        this.products.add(new Product());
    }

    public String getSupplierNumber() {
        return supplierNumber;
    }

    public void setSupplierNumber(String supplierNumber) {
        this.supplierNumber = supplierNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactPhoneNo() {
        return contactPhoneNo;
    }

    public void setContactPhoneNo(String contactPhoneNo) {
        this.contactPhoneNo = contactPhoneNo;
    }

    public Address getAddress() {
        return address;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Product createProduct(Long productId, String name, LocalDate dateSupplied, int quantityInStock, double unitPrice) {
        return new Product(productId, name, dateSupplied, quantityInStock, unitPrice);
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "supplierNumber='" + supplierNumber + '\'' +
                ", name='" + name + '\'' +
                ", contactPhoneNo='" + contactPhoneNo + '\'' +
                ", address=" + address +
                ", products=" + products +
                '}';
    }
}
