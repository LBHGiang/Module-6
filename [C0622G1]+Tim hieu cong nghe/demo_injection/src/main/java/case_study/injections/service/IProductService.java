package case_study.injections.service;

import case_study.injections.model.Product;
import case_study.injections.model.ProductDto2;

import java.util.List;

public interface IProductService {
    List<Product> getAllProduct();
}
