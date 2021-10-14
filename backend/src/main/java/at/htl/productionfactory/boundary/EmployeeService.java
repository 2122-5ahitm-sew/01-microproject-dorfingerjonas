package at.htl.productionfactory.boundary;

import at.htl.productionfactory.controller.EmployeeRepository;
import at.htl.productionfactory.entity.Employee;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
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

}
