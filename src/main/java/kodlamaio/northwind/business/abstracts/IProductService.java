package kodlamaio.northwind.business.abstracts;

import kodlamaio.northwind.core.utilities.result.DataResult;
import kodlamaio.northwind.core.utilities.result.Result;
import kodlamaio.northwind.entities.concrete.Product;

import java.util.List;

public interface IProductService {
    DataResult<List<Product>> getAll();
    Result add(Product product);
}
