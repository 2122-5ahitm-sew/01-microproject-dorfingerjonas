package at.htl.productionfactory.controller;

import at.htl.productionfactory.entity.Employee;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

@ApplicationScoped
public class EmployeeRepository implements PanacheRepository<Employee> {

    @Transactional
    public Employee save(Employee employee) {
        return getEntityManager().merge(employee);
    }

}
