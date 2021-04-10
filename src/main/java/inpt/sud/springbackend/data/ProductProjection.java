package inpt.sud.springbackend.data;

import inpt.sud.springbackend.data.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "P1" , types = Product.class)
public interface ProductProjection {
    public double getCurrentPrice();
}
