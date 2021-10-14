package at.htl.productionfactory.boundary;

import at.htl.productionfactory.controller.EmployeeRepository;
import at.htl.productionfactory.entity.Employee;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.net.URI;
import java.util.List;

@Path("/employees")
@Produces(MediaType.APPLICATION_JSON)
public class EmployeeService {

    @Inject
    EmployeeRepository repository;

    @GET
    public List<Employee> getAll() {
        return repository.listAll();
    }

    @GET
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Employee findById(@PathParam("id") long id) {
        return repository.findById(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(Employee employee, @Context UriInfo info) {
        return Response
                .created(URI.create(info.getPath() + "/" + repository.save(employee).id))
                .build();
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response update(Employee employee, @Context UriInfo info) {
        return Response
                .created(URI.create(info.getPath() + "/" + repository.save(employee).id))
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
