package kodlamaio.northwind.dataAccess.abstracts;

import kodlamaio.northwind.entities.concrete.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product, Integer> {


}
