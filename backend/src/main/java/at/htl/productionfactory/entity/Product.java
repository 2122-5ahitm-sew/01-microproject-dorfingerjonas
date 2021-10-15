package at.htl.productionfactory.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

@Entity
public class Product extends PanacheEntity {

    public String name;
    public double duration;

    @Enumerated(EnumType.STRING)
    public MachineType requiredMachineType;

    @ManyToOne
    @Cascade(CascadeType.ALL)
    public Material material;

    public Product(String name, double duration, MachineType requiredMachineType, Material material) {
        this.name = name;
        this.duration = duration;
        this.requiredMachineType = requiredMachineType;
        this.material = material;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", requiredMachineType=" + requiredMachineType +
                ", material=" + material +
                '}';
    }
}
