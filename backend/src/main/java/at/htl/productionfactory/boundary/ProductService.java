package at.htl.productionfactory.boundary;

import at.htl.productionfactory.controller.ProductRepository;
import at.htl.productionfactory.entity.Product;

import javax.inject.Inject;
import javax.ws.rs.*;
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

    @GET
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Product findById(@PathParam("id") long id) {
        return repository.findById(id);
    }
}
