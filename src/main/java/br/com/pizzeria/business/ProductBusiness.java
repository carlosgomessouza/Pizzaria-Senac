package br.com.pizzeria.business;

import br.com.pizzeria.dao.ProductDao;
import br.com.pizzeria.model.Product;

import java.util.List;

public class ProductBusiness {

    public List<Product> autoComplete() throws Exception {
        return ProductDao.productAutoComplete();
    }

    public Product get(int productID) throws Exception {
        return ProductDao.get(productID);
    }
    public void productSave(Product product) throws Exception {
        ProductDao.productInsert(product);
    }
}
