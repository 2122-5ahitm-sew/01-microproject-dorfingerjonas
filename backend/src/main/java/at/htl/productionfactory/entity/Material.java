package at.htl.productionfactory.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;

@Entity
public class Material extends PanacheEntity {

    public String name;
    public String code;
    public boolean inStock;

    public Material(String name, String code, boolean inStock) {
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
