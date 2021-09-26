package at.htl.productionfactory.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Material extends PanacheEntity {

    public String name;
    public String code;
    public boolean inStock;

    public Material(Long id, String name, String code, boolean inStock) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.inStock = inStock;
    }

    public Material() {
    }

    @Override
    public String toString() {
        return "Material{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", inStock=" + inStock +
                '}';
    }
}
