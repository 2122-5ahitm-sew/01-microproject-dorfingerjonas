package at.htl.productionfactory.boundary;

import at.htl.productionfactory.controller.ProductRepository;
import at.htl.productionfactory.entity.Product;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/products")
@Produces(MediaType.APPLICATION_JSON)
public class ProductService {

    @Inject
    ProductRepository repository;

    @GET
    public List<Product> getAll() {
        return repository.listAll();
    }
}
