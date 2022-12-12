package case_study.injections.repository;

import case_study.injections.model.Product;
import case_study.injections.model.ProductDto2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IProductRepository extends JpaRepository<Product, Integer> {

    @Query(value = "select * from `product`", nativeQuery = true)
    List<Product> getAllProduct();
}
