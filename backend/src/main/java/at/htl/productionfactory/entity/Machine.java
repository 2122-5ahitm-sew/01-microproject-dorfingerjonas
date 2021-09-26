package at.htl.productionfactory.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Machine extends PanacheEntity {

    @Enumerated(EnumType.STRING)
    public MachineType machineType;

    public Machine(MachineType machineType) {
        this.machineType = machineType;
    }

    public Machine(MachineType machineType) {
        this.machineType = machineType;
    }

    public Machine() {
    }

    @Override
    public String toString() {
        return "Machine{" +
                "machineType=" + machineType +
                '}';
    }
}