package at.htl.productionfactory.boundary;

import at.htl.productionfactory.controller.MaterialRepository;
import at.htl.productionfactory.entity.Material;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
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

}
