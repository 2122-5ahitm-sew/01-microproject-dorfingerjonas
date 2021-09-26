package at.htl.productionfactory.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Production extends PanacheEntity {

    @ManyToOne
    public Employee employee;

    @ManyToOne
    public Product product;

    @ManyToOne
    public Machine machine;


    public Production(Long id, Employee employee, Product product, Machine machine) {
        this.id = id;
        this.employee = employee;
        this.product = product;
        this.machine = machine;
    }

    public Production() {
    }

    @Override
    public String toString() {
        return "Production{" +
                "employee=" + employee +
                ", product=" + product +
                ", machine=" + machine +
                '}';
    }
}
