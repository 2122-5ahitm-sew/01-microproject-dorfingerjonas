package at.htl.productionfactory.boundary;

import at.htl.productionfactory.controller.ProductRepository;
import at.htl.productionfactory.entity.Product;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.net.URI;
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

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(Product product, @Context UriInfo info) {
        return Response
                .created(URI.create(info.getPath() + "/" + repository.save(product).id))
                .build();
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response update(Product product, @Context UriInfo info) {
        return Response
                .created(URI.create(info.getPath() + "/" + repository.save(product).id))
                .build();
    }

    @DELETE
    @Path("{id}")
    @Transactional
    public Response delete(@PathParam("id") long id) {
        repository.delete(repository.findById(id));

        return Response.ok().build();
    }
}
