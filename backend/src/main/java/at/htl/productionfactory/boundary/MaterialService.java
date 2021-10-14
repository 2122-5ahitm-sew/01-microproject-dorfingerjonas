package at.htl.productionfactory.boundary;

import at.htl.productionfactory.controller.MaterialRepository;
import at.htl.productionfactory.entity.Material;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/materials")
@Produces(MediaType.APPLICATION_JSON)
public class MaterialService {

    @Inject
    MaterialRepository repository;

    @GET
    public List<Material> getAll() {
        return repository.listAll();
    }

    @GET
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Material findById(@PathParam("id") long id) {
        return repository.findById(id);
    }

}
