package Cert11;

import java.math.BigDecimal;
import java.util.ResourceBundle;

public class ProductManager {
    private Product product;
    private Review review;

    public Product createProduct(int id, String name, BigDecimal price, Rating rating) {
        product = new Drink(id, name, price, rating);
        return product;
    }
    public Product reviewProduct(Product product, Rating rating, String comments) {
        review = new Review(rating, comments);
        this.product = product;
        return this.product;
        //ResourceBundle.getBundle("Cert11.resources", locale)
    }
}
