package at.htl.productionfactory.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import java.util.List;

@Entity
public class Product extends PanacheEntity {

    public String name;

    @Enumerated(EnumType.STRING)
    public MachineType requiredMachineType;

    @ManyToOne
    @Cascade(CascadeType.ALL)
    public Material material;

    public Product(String name, MachineType requiredMachineType, Material material) {
        this.name = name;
        this.requiredMachineType = requiredMachineType;
        this.material = material;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", material=" + material +
                '}';
    }
}
