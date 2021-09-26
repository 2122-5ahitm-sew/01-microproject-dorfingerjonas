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

    @ManyToOne
    public Material material;

    public Production(Long id, Employee employee, Product product, Machine machine, Material material) {
        this.id = id;
        this.employee = employee;
        this.product = product;
        this.machine = machine;
        this.material = material;
    }

    public Production() {
    }

    @Override
    public String toString() {
        return "Production{" +
                "employee=" + employee +
                ", product=" + product +
                ", machine=" + machine +
                ", material=" + material +
                '}';
    }
}
