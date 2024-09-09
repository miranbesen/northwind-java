package kodlamaio.northwind.dataAccess.abstracts;

import kodlamaio.northwind.entities.concrete.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductDao extends JpaRepository<Product, Integer> {
    Product getByProductName(String productName);

    Product getByProductNameAndCategoryId(String productName, int categoryId);

    List<Product> getByProductNameOrCategoryId(String productName, int categoryId);

    List<Product> getByCategoryIdIn(List<Integer> categoryId);
    List<Product> getByProductNameContains(String productName);
    List<Product> getByProductNameStartWith(String productName);
    @Query("From Product where productName=:productName and categoryId=:categoryId")
    List<Product> getByNameAndCategory(String productName,int categoryId);


}
