package kodlamaio.northwind.business.abstracts;

import kodlamaio.northwind.entities.concrete.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAll();
}
