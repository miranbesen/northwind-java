package kodlamaio.northwind.entities.concrete;

import lombok.Data;

@Data
public class Product {
    private int id;
    private int categoryId;
    private String productName;
    private double unitPrice;
    private short unitsInStock;
    private String quantityPerUnit; //bir birimde kaçtane var açıklaması...(6'lı 330ml kola var gibi...)
}
